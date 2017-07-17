package com.walmart.shopify.repositories;

import org.springframework.data.repository.CrudRepository;

import com.walmart.shopify.model.Seller;



public interface SellerRepository extends CrudRepository<Seller, String> {
}
