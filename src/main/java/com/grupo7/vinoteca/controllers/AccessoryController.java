package com.grupo7.vinoteca.controllers;
import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.services.AccessoryService;
import com.grupo7.vinoteca.services.ImageAccessoryService;
import com.grupo7.vinoteca.services.ImageWineService;
import com.grupo7.vinoteca.services.Implementation.AccessoryServiceImpl;
import com.grupo7.vinoteca.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.validation.Valid;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/accessories")
public class AccessoryController extends BaseControllerImpl<Accessory, AccessoryServiceImpl> {

    @Autowired
    private AccessoryService accessoryService;

    @Autowired
    private ImageAccessoryService imageAccessoryService;

    @GetMapping("/search")
    public ResponseEntity<?> findAccesoryByName(@RequestParam String name){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccesoryByName(name));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/search/paged")
    public ResponseEntity<?> findAccesoryByName(@RequestParam String name, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccesoryByName(name, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchPrice")
    public ResponseEntity<?> findAccesoryByPrice(@RequestParam float price){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccesoryByPrice(price));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/searchPrice/paged")
    public ResponseEntity<?> findAccesoryByPrice(@RequestParam float price, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccesoryByPrice(price, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchPriceMore")
    public ResponseEntity<?> findAccesoryByPriceMore(@RequestParam float price){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccesoryByPriceMore(price));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchPriceMore/paged")
    public ResponseEntity<?> findAccesoryByPriceMore(@RequestParam float price, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccesoryByPriceMore(price, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }


    @GetMapping("/inicio")
    public String inicio(Model model) {
        try {
            List<Accessory> accessories = this.accessoryService.findAllByActivo();
            model.addAttribute("accessories", accessories);
            return "views/inicio";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @GetMapping("/detalle/{id}")
    public String detalleAccessory(Model model, @PathVariable("id") long id) {
        try {
            Accessory accessory = this.accessoryService.findByIdAndActivo(id);
            model.addAttribute("accessories", accessory);
            return "views/detalle";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @GetMapping(value = "/busqueda")
    public String busquedaAccessory(Model model, @RequestParam(value = "query", required = false) String d) {
        try {
            List<Accessory> accessories = this.accessoryService.findByName(d);
            model.addAttribute("accessories", accessories);
            return "views/busqueda";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @GetMapping("/crud")
    public String crudAccessory(Model model) {
        try {
            List<Accessory> accessories = this.accessoryService.findAll();
            model.addAttribute("accessories", accessories);
            return "views/crud";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @GetMapping("/formulario/accessory/{id}")
    public String formularioAccessory(Model model, @PathVariable("id") long id) {
        try {
            model.addAttribute("imágenes", this.imageAccessoryService.findAll());
            if (id == 0) {
                model.addAttribute("accessory", new Accessory());
            } else {
                model.addAttribute("accessory", this.accessoryService.findById(id));
            }
            return "views/formulario/accessory";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @PostMapping("/formulario/accessory/{id}")
    public String guardarAccessory(
            @RequestParam("archivo") MultipartFile archivo2, @Valid @ModelAttribute("accessory") Accessory accessory,
            BindingResult result,
            Model model, @PathVariable("id") long id
    ) {

        try {
            model.addAttribute("imágenes", this.imageAccessoryService.findAll());
            if (result.hasErrors()) {
                return "views/formulario/accessory";
            }
            String ruta = "C://Vinoteca/Accesorios/imagenes";
            int index = archivo2.getOriginalFilename().indexOf(".");
            String extension = "";
            extension = "." + archivo2.getOriginalFilename().substring(index + 1);
            String nombreFoto = Calendar.getInstance().getTimeInMillis() + extension;
            Path rutaAbsoluta = id != 0 ? Paths.get(ruta + "//" + accessory.getImagesAccesory()) :
                    Paths.get(ruta + "//" + nombreFoto);
            if (id == 0) {
                if (archivo2.isEmpty()) {
                    model.addAttribute("errorImagenMsg", "La imagen es requerida");
                    return "views/formulario/accessory";
                }
                if (!this.validarExtension(archivo2)) {
                    model.addAttribute("errorImagenMsg", "La extension no es valida");
                    return "views/formulario/accessory";
                }
                if (archivo2.getSize() >= 15000000) {
                    model.addAttribute("errorImagenMsg", "El peso excede 15MB");
                    return "views/formulario/accessory";
                }
                Files.write(rutaAbsoluta, archivo2.getBytes());
                accessory.setImagesAccesory(nombreFoto);
                this.accessoryService.save(accessory);
            } else {
                if (!archivo2.isEmpty()) {
                    Files.write(rutaAbsoluta, archivo2.getBytes());
                }
                this.accessoryService.update(accessory, id);
            }
            return "redirect:/crud";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @GetMapping("/eliminar/accessory/{id}")
    public String eliminarAccessory(Model model, @PathVariable("id") long id) {
        try {
            model.addAttribute("accessory", this.accessoryService.findById(id));
            return "views/formulario/eliminar";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @PostMapping("/eliminar/accessory/{id}")
    public String desactivarAccessory(Model model, @PathVariable("id") long id) {
        try {
            this.accessoryService.delete(id);
            return "redirect:/crud";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            System.out.println(e);
            return "error";
        }
    }

    public boolean validarExtension(MultipartFile archivo) {
        try {
            ImageIO.read(archivo.getInputStream()).toString();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

}