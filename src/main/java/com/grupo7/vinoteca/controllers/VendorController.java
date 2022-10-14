package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.entities.Vendedor;
import com.grupo7.vinoteca.services.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "/vendedor")
public class VendorController {

    @Autowired
    private VendedorService svcVendedor;

    @GetMapping("/{user}/{passwd}")
    public String vendorUserLogin( @RequestParam String user,@RequestParam String passwd) {
        try {
            Vendedor vendor = this.svcVendedor.findUserAndPasswd(user, passwd);

            System.out.println("exisste nazi");
                return "El vendedor se ha logueado correctamente ";

        } catch (Exception e) {
            System.out.println("no existe pa");
            return "Usuario o contraseña incorrectos";
        }
    }



}
