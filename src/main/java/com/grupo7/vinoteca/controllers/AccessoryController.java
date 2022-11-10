package com.grupo7.vinoteca.controllers;
import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.services.Implementation.AccessoryServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/accessories")
public class AccessoryController extends BaseControllerImpl<Accessory, AccessoryServiceImpl> {

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

    @Override
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> save(Accessory entity) {
        return super.save(entity);
    }

    @Override
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> update(Accessory entity, Long id) {
        return super.update(entity, id);
    }

    @Override
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> delete(Long id) {
        return super.delete(id);
    }
}