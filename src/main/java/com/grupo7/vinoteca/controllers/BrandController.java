package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Brand;
import com.grupo7.vinoteca.services.Implementation.BrandServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/brands")
public class BrandController extends BaseControllerImpl<Brand, BrandServiceImpl> {


    @PostMapping("/searchOrSave")
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> findBrandByName(@RequestBody Brand entity) {
        try {
            if (service.existsByBrand(entity.getBrand())) {
            return ResponseEntity.status(HttpStatus.OK).body(service.getByBrand(entity.getBrand()));
            }else  {
                return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
        }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @Override
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> save(Brand entity) {
        return super.save(entity);
    }

    @Override
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> update(Brand entity, Long id) {
        return super.update(entity, id);
    }

    @Override
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> delete(Long id) {
        return super.delete(id);
    }
}
