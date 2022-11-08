package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Seller;
import com.grupo7.vinoteca.entities.User;
import com.grupo7.vinoteca.services.Implementation.UserServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

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

//PRUEBA
    private static final List<User> USERS = Arrays.asList(
            new User(1, "James Bond"),
            new User(2, "Maria Jones"),
            new User(3, "Anna Smith")
    );

    @GetMapping(path = "/test/{userID}")
    @PreAuthorize("hasRole('ROLE_USER')")
    public User getUser(@PathVariable("userID") Long UserID) {
        return USERS.stream()
                .filter(user -> UserID.equals(user.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(
                        "User " + UserID + " does not exists"
                ));
    }


    @PostMapping("/test")
    @PreAuthorize("hasAuthority('user:write')")
    public void registerNewUser(@RequestBody User user) {
        System.out.println("registerNewUser");
        System.out.println(user);
    }

    @DeleteMapping(path = "/test/{userID}")
    @PreAuthorize("hasAuthority('user:write')")
    public void deleteUser(@PathVariable("userID") Long userID) {
        System.out.println("deleteUser");
        System.out.println(userID);
    }

    @PutMapping(path = "/test/{userID}")
    @PreAuthorize("hasAuthority('user:write')")
    public void updateUser(@PathVariable("userID") Long userID, @RequestBody User user) {
        System.out.println("updateUser");
        System.out.println(String.format("%s %s", userID, user));
    }

}