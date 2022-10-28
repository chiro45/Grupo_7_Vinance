package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Seller;
import com.grupo7.vinoteca.services.Implementation.SellerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/sellers")
public class SellerController extends BaseControllerImpl<Seller, SellerServiceImpl> {

    @GetMapping("/login")
    public ResponseEntity<?> userLogin(@RequestParam String name, @RequestParam String passwd) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.userLogin(name, passwd));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

}