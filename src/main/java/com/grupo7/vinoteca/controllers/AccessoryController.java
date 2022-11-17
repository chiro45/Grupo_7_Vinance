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
    public ResponseEntity<?> findAccesoryByName(@RequestParam String name) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccessoryByName(name));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/search/paged")
    public ResponseEntity<?> findAccesoryByName(@RequestParam String name, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccessoryByNamePaged(name, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchByPriceLower")
    public ResponseEntity<?> findAccesoryByPriceLower(@RequestParam double price) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccessoryByPriceLower(price));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchByPriceLower/paged")
    public ResponseEntity<?> findAccesoryByPriceLowerPaged(@RequestParam double price, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccessoryByPriceLowerPaged(price, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchByPriceUpper")
    public ResponseEntity<?> findAccesoryByPriceUpper(@RequestParam double price) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccessoryByPriceUpper(price));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchByPriceUpper/paged")
    public ResponseEntity<?> findAccesoryByPriceUpperPaged(@RequestParam double price, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccessoryByPriceUpperPaged(price, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

   /* @GetMapping("/searchByPriceEquals")
    public ResponseEntity<?> findAccessoryByPriceEquals(@RequestParam float price) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccessoryByPriceEquals(price));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchByPriceEquals/paged")
    public ResponseEntity<?> findAccessoryByPriceEqualsPaged(@RequestParam float price, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccessoryByPriceEqualsPaged(price, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }*/

    /*@GetMapping("/searchByStock")
    public ResponseEntity<?> findAccessoryByStock() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccessoryByStock());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchByStock/paged")
    public ResponseEntity<?> findAccessoryByStockPaged(Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccessoryByStockPaged(pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }*/

    /*@GetMapping("/searchByActive")
    public ResponseEntity<?> findAccessoryByActive(@RequestParam boolean active) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccessoryByActive(active));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchByActive/paged")
    public ResponseEntity<?> findAccessoryByActivePaged(@RequestParam boolean active, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAccessoryByActivePaged(active, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }*/


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