package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.User;
import com.grupo7.vinoteca.services.Implementation.UserServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/users")
public class UserController extends BaseControllerImpl<User, UserServiceImpl> {
    @GetMapping("/login")
    public ResponseEntity<?> search(@RequestParam String name, @RequestParam String password) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.loginUser(name, password));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/search")
    public ResponseEntity<?> findUserByName(@RequestParam String name) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findUserByName(name));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/search/paged")
    public ResponseEntity<?> findUserByName(@RequestParam String name, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findUserByName(name, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

}