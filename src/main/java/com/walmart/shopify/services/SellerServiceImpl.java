package com.walmart.shopify.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.walmart.shopify.model.Seller;
import com.walmart.shopify.repositories.SellerRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	
	@Override
	public List<Seller> listAll() {
		List<Seller> sellers = new ArrayList<>();
		sellerRepository.findAll().forEach(sellers::add);
		return sellers;
	}

	@Override
	public Seller getByName(String shopName) {
		return sellerRepository.findOne(shopName);
	}

	@Override
	public Seller saveOrUpdate(Seller seller) {
		sellerRepository.save(seller);
		return seller;
	}

}
