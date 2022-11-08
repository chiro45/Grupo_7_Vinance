package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Varietal;
import com.grupo7.vinoteca.services.Implementation.VarietalServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/varietals")
public class VarietalController extends BaseControllerImpl<Varietal, VarietalServiceImpl> {

    @Override
    @PreAuthorize("hasAuthority('seller:write')")
    public ResponseEntity<?> save(Varietal entity) {
        return super.save(entity);
    }

    @Override
    @PreAuthorize("hasAuthority('seller:write')")
    public ResponseEntity<?> update(Varietal entity, Long id) {
        return super.update(entity, id);
    }

    @Override
    @PreAuthorize("hasAuthority('seller:write')")
    public ResponseEntity<?> delete(Long id) {
        return super.delete(id);
    }
}
