package com.grupo7.vinoteca.services;



import com.grupo7.vinoteca.entities.Vendedor;

import com.grupo7.vinoteca.repositories.VendedorRepository;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class VendedorService extends Exception {

    private VendedorRepository repository;

    @Transactional
    public Vendedor findUserAndPasswd(String user,String passwd) throws Exception {
        try{
            Vendedor entities = this.repository.findUserAndPasswd(user, passwd);
            System.out.println(entities);
            return entities;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }





}
