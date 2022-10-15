package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.entities.Seller;
import com.grupo7.vinoteca.services.SellerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/sellers")
public class SellerController {
    private SellerService svcVendedor;

    public SellerController(SellerService sellerService){
        svcVendedor = sellerService;
    }

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(svcVendedor.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(svcVendedor.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Seller entity){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(svcVendedor.save(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Seller entity, @PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(svcVendedor.update(entity, id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(svcVendedor.delete(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }





}
