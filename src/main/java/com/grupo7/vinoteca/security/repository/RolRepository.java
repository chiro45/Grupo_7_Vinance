package com.grupo7.vinoteca.security.repository;

import com.grupo7.vinoteca.security.entity.Rol;
import com.grupo7.vinoteca.security.enums.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol,Long> {

    Optional<Rol> findByRoles(Roles roles);
}
