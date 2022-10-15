package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.services.AccessoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/accessories")
public class AccessoryController {

    private AccessoryService accessoryService;

    public AccessoryController(AccessoryService accessoryService){
        this.accessoryService = accessoryService;
    }

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(accessoryService.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(accessoryService.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Accessory entity){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(accessoryService.save(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Accessory entity, @PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(accessoryService.update(entity, id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(accessoryService.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }
}
