package com.grupo7.vinoteca.security.service;


import com.grupo7.vinoteca.security.entity.Rol;
import com.grupo7.vinoteca.security.enums.Roles;
import com.grupo7.vinoteca.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRoles(Roles roles) {
        return rolRepository.findByRoles(roles);
    }

    public void save(Rol rol) {
        rolRepository.save(rol);
    }
}
