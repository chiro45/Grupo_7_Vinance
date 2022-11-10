package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.services.Implementation.WineServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/wines")
public class WineController extends BaseControllerImpl<Wine, WineServiceImpl> {

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

    @Override
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> save(Wine entity) {
        return super.save(entity);
    }

    @Override
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> update(Wine entity, Long id) {
        return super.update(entity, id);
    }

    @Override
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> delete(Long id) {
        return super.delete(id);
    }
}