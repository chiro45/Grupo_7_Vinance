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
//    public ResponseEntity<?> findWineForNamePaged(@RequestParam String name, Pageable pageable){
//        try{
//            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForNamePaged(name, pageable));
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
    public ResponseEntity<?> findWineForVarietalPaged(@RequestParam String varietal, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForVarietalPaged(varietal, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForPriceUpper")
    public ResponseEntity<?> findWineForPrice(@RequestParam float price) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForPriceUpper(price));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForPriceUpper/paged")
    public ResponseEntity<?> findWineForPricePaged(@RequestParam float price, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForPriceUpperPaged(price, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForPriceLower")
    public ResponseEntity<?> findWineForPriceLower(@RequestParam float price) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForPriceLower(price));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForPriceLower/paged")
    public ResponseEntity<?> findWineForPriceLower(@RequestParam float price, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForPriceLowerPaged(price, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForPriceEquals")
    public ResponseEntity<?> findWineForPriceEquals(@RequestParam float price) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForPriceEquals(price));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForPriceEquals/paged")
    public ResponseEntity<?> findWineForPriceEqualsPaged(@RequestParam float price, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForPriceEqualsPaged(price, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForActive")
    public ResponseEntity<?> findWineForActive(@RequestParam boolean active) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForActive(active));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForActive/paged")
    public ResponseEntity<?> findWineForActivePaged(@RequestParam boolean active, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForActivePaged(active, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForBrand")
    public ResponseEntity<?> findWineForBrand(@RequestParam String brand) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForBrand(brand));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForBrand/paged")
    public ResponseEntity<?> findWineForBrandPaged(@RequestParam String brand, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForBrandPaged(brand, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForCategory")
    public ResponseEntity<?> findWineForCategory(@RequestParam String category) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForCategory(category));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForCategory/paged")
    public ResponseEntity<?> findWineForCategoryPaged(@RequestParam String category, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForCategoryPaged(category, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForStock")
    public ResponseEntity<?> findWineHasStock() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineHasStock());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/searchForStock/paged")
    public ResponseEntity<?> findWineHasStock(Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineHasStockPaged(pageable));
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