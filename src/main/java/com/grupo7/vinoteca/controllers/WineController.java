package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.services.Implementation.WineServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/wines")
public class WineController extends BaseControllerImpl<Wine, WineServiceImpl> {


    @GetMapping("/search")
    public ResponseEntity<?> findWineForName(@RequestParam String name){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForName(name));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/searchVarietal")
    public ResponseEntity<?> findWineForVarietal(@RequestParam String varietal){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForVarietal(varietal));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/searchForPrice")
    public ResponseEntity<?> findWineForPrice(@RequestParam String price){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findWineForPrice(price));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }




}
