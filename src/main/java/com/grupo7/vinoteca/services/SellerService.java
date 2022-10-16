package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.Seller;

import java.util.List;

public interface SellerService extends BaseService<Seller, Long> {



    Seller userLogin(String name, String passwd) throws Exception;
}
