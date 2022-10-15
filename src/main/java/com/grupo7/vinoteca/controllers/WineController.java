package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.entities.User;
import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.services.UserService;
import com.grupo7.vinoteca.services.WineService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/wines")
public class WineController {
    private WineService wineService;

    public WineController(WineService wineService){
        this.wineService = wineService;
    }

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(wineService.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(wineService.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Wine entity){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(wineService.save(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Wine entity, @PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(wineService.update(entity, id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(wineService.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente nuevamente...\"");
        }
    }
}
