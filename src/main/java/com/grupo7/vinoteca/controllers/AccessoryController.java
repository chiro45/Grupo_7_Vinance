package com.grupo7.vinoteca.controllers;
import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.services.Implementation.AccessoryServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/accessories")
public class AccessoryController extends BaseControllerImpl<Accessory, AccessoryServiceImpl> {

}
