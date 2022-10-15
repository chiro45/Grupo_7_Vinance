package com.grupo7.vinoteca.controllers;
import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Seller;
import com.grupo7.vinoteca.services.Implementation.SellerServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/sellers")

public class SellerController extends BaseControllerImpl<Seller, SellerServiceImpl> {


}
