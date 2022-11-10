package com.grupo7.vinoteca.security.controller;

import com.grupo7.vinoteca.entities.User;
import com.grupo7.vinoteca.security.dto.JwtDto;
import com.grupo7.vinoteca.security.dto.UserDto;
import com.grupo7.vinoteca.security.dto.UserLogin;
import com.grupo7.vinoteca.security.entity.Rol;
import com.grupo7.vinoteca.security.enums.Roles;
import com.grupo7.vinoteca.security.jwt.JwtProvider;
import com.grupo7.vinoteca.security.service.RolService;
import com.grupo7.vinoteca.security.service.UserServiceSec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/auth")

public class AuthController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserServiceSec userServiceImpl;

    @Autowired
    RolService rolService;

    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/register")
    public ResponseEntity<?> register (@Valid @RequestBody UserDto userDto, BindingResult bindingResult) throws Exception {
        if (bindingResult.hasErrors())
            return new ResponseEntity(new AuthMessage("Campos mal puestos o email invalido"), HttpStatus.BAD_REQUEST);

        if (userServiceImpl.existsByUsername(userDto.getUsername()))
            return new ResponseEntity(new AuthMessage("Ese nombre de usuario ya existe"), HttpStatus.BAD_REQUEST);

        if (userServiceImpl.existsByEmail(userDto.getEmail()))
            return new ResponseEntity(new AuthMessage("Ese email existe"), HttpStatus.BAD_REQUEST);

        User user = User.builder().username(userDto.getUsername())
                .name(userDto.getName())
                 .email(userDto.getEmail())
                .password(passwordEncoder.encode(userDto.getPassword()))
                .build();

        Set<Rol> roles = new HashSet();
        roles.add(rolService.getByRoles(Roles.ROLE_USER).get());

        if (userDto.getRoles().contains("seller"))
            roles.add(rolService.getByRoles(Roles.ROLE_SELLER).get());

        user.setRol(roles);
        userServiceImpl.save(user);

        return new ResponseEntity(new AuthMessage("Usuario guardado"), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDto> login(@Valid @RequestBody UserLogin userLogin, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity(new AuthMessage("Campos mal puestos"), HttpStatus.BAD_REQUEST);

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                userLogin.getUsername(), userLogin.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtProvider.generateToken(authentication);

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        JwtDto jwtDto = JwtDto.builder()
                .token(jwt)
                .username(userDetails.getUsername())
                .authorities(userDetails.getAuthorities())
                .build();

        return new ResponseEntity(jwtDto, HttpStatus.OK);
    }
}
