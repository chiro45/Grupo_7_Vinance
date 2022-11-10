package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.ImageWine;
import com.grupo7.vinoteca.services.Implementation.ImageWineServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/imagesWine")
public class ImageWineController extends BaseControllerImpl<ImageWine, ImageWineServiceImpl> {

    @Override
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> save(ImageWine entity) {
        return super.save(entity);
    }

    @Override
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> update(ImageWine entity, Long id) {
        return super.update(entity, id);
    }

    @Override
    @PreAuthorize("hasRole('SELLER')")
    public ResponseEntity<?> delete(Long id) {
        return super.delete(id);
    }
}
