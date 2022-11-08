package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.controllers.BaseController.BaseController;
import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Seller;
import com.grupo7.vinoteca.entities.User;
import com.grupo7.vinoteca.services.Implementation.SellerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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

    private static final Seller SELLER = new Seller(1, "Fede");

//    hasRole('ROLE_') hasAnyRole('ROLE_') hasAuthority('permission') hasAnyAuthority('permission')

    @GetMapping("/test")
    @PreAuthorize("hasAnyRole('ROLE_SELLER')")
    public Seller getSeller() {
        System.out.println("getSeller");
        return SELLER;
    }

    @PostMapping("/test")
    @PreAuthorize("hasAuthority('seller:write')")
    public void registerNewSeller(@RequestBody Seller seller) {
        System.out.println("registerNewSeller");
        System.out.println(seller);
    }

    @DeleteMapping(path = "/test/{sellerID}")
    @PreAuthorize("hasAuthority('seller:write')")
    public void deleteSeller(@PathVariable("sellerID") Long sellerID) {
        System.out.println("deleteSeller");
        System.out.println(sellerID);
    }

    @PutMapping(path = "/test/{sellerID}")
    @PreAuthorize("hasAuthority('seller:write')")
    public void updateSeller(@PathVariable("sellerID") Long sellerID, @RequestBody Seller seller) {
        System.out.println("updateSeller");
        System.out.println(String.format("%s %s", sellerID, seller));
    }

}