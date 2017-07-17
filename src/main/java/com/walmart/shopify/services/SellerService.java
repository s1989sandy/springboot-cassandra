package com.walmart.shopify.services;

import java.util.List;

import com.walmart.shopify.model.Seller;

public interface SellerService {

    List<Seller> listAll();

    Seller getByName(String shopName);

    Seller saveOrUpdate(Seller	seller);

  
}
