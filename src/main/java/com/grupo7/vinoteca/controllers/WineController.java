package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.services.*;
import com.grupo7.vinoteca.services.Implementation.WineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.imageio.ImageIO;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/wines")
public class WineController extends BaseControllerImpl<Wine, WineServiceImpl> {

    @Autowired
    private WineService wineService;

    @Autowired
    private BrandService brandService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private VarietalService varietalService;

    @Autowired
    private ImageWineService imageWineService;


    @GetMapping("/search")
    public ResponseEntity<?> findWineForName(@RequestParam String name) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForName(name));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

//    @GetMapping("/search/paged")
//    public ResponseEntity<?> findWineForName(@RequestParam String name, Pageable pageable){
//        try{
//            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForName(name, pageable));
//        }catch (Exception e){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
//        }
//    }

    @GetMapping("/searchVarietal")
    public ResponseEntity<?> findWineForVarietal(@RequestParam String varietal) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForVarietal(varietal));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchVarietal/paged")
    public ResponseEntity<?> findWineForVarietal(@RequestParam String varietal, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForVarietal(varietal, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForPrice")
    public ResponseEntity<?> findWineForPrice(@RequestParam float price) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForPrice(price));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForPrice/paged")
    public ResponseEntity<?> findWineForPrice(@RequestParam float price, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForPrice(price, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/inicio")
    public String inicio(Model model) {
        try {
            List<Wine> wines = this.wineService.findAllByActivo();
            model.addAttribute("wines", wines);
            return "views/inicio";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @GetMapping("/detalle/{id}")
    public String detalleWine(Model model, @PathVariable("id") long id) {
        try {
            Wine wine = this.wineService.findByIdAndActivo(id);
            model.addAttribute("wines", wine);
            return "views/detalle";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @GetMapping(value = "/busqueda")
    public String busquedaWine(Model model, @RequestParam(value = "query", required = false) String q) {
        try {
            List<Wine> wines = this.wineService.findByName(q);
            model.addAttribute("wines", wines);
            return "views/busqueda";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @GetMapping("/crud")
    public String crudWine(Model model) {
        try {
            List<Wine> wines = this.wineService.findAll();
            model.addAttribute("wines", wines);
            return "views/crud";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @GetMapping("/formulario/wine/{id}")
    public String formularioWine(Model model, @PathVariable("id") long id) {
        try {
            model.addAttribute("marcas", this.brandService.findAll());
            model.addAttribute("variedades", this.varietalService.findAll());
            model.addAttribute("categorías", this.categoryService.findAll());
            model.addAttribute("imágenes", this.imageWineService.findAll());
            if (id == 0) {
                model.addAttribute("wine", new Wine());
            } else {
                model.addAttribute("wine", this.wineService.findById(id));
            }
            return "views/formulario/wine";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @PostMapping("/formulario/wine/{id}")
    public String guardarWine(
            @RequestParam("archivo") MultipartFile archivo, @Valid @ModelAttribute("wine") Wine wine,
            BindingResult result,
            Model model, @PathVariable("id") long id
    ) {

        try {
            model.addAttribute("marcas", this.brandService.findAll());
            model.addAttribute("variedades", this.varietalService.findAll());
            model.addAttribute("categorías", this.categoryService.findAll());
            model.addAttribute("imágenes", this.imageWineService.findAll());
            if (result.hasErrors()) {
                return "views/formulario/wine";
            }
            String ruta = "C://Vinoteca/Vinos/imagenes";
            int index = archivo.getOriginalFilename().indexOf(".");
            String extension = "";
            extension = "." + archivo.getOriginalFilename().substring(index + 1);
            String nombreFoto = Calendar.getInstance().getTimeInMillis() + extension;
            Path rutaAbsoluta = id != 0 ? Paths.get(ruta + "//" + wine.getImagesWine()) :
                    Paths.get(ruta + "//" + nombreFoto);
            if (id == 0) {
                if (archivo.isEmpty()) {
                    model.addAttribute("errorImagenMsg", "La imagen es requerida");
                    return "views/formulario/wine";
                }
                if (!this.validarExtension(archivo)) {
                    model.addAttribute("errorImagenMsg", "La extension no es valida");
                    return "views/formulario/wine";
                }
                if (archivo.getSize() >= 15000000) {
                    model.addAttribute("errorImagenMsg", "El peso excede 15MB");
                    return "views/formulario/wine";
                }
                Files.write(rutaAbsoluta, archivo.getBytes());
                wine.setImagesWine(nombreFoto);
                this.wineService.save(wine);
            } else {
                if (!archivo.isEmpty()) {
                    Files.write(rutaAbsoluta, archivo.getBytes());
                }
                this.wineService.update(wine, id);
            }
            return "redirect:/crud";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @GetMapping("/eliminar/wine/{id}")
    public String eliminarWine(Model model, @PathVariable("id") long id) {
        try {
            model.addAttribute("wine", this.wineService.findById(id));
            return "views/formulario/eliminar";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    @PostMapping("/eliminar/videojuego/{id}")
    public String desactivarWine(Model model, @PathVariable("id") long id) {
        try {
            this.wineService.delete(id);
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