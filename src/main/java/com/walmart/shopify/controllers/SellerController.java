package com.walmart.shopify.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.walmart.shopify.model.Seller;
import com.walmart.shopify.services.SellerService;


@Controller
public class SellerController {
	@Autowired
    private SellerService sellerService;
	
    @RequestMapping("/home")
	public String home(Model model){
	 model.addAttribute("sellerList", sellerService.listAll());
	 return "home";
	}
    
      
    @RequestMapping(value = "/search")
    public String search(Model model, @RequestParam String search) {
    	model.addAttribute("sellerList", sellerService.getByName(search));
    	//model.addAttribute("search", search);
    	return "home";
    }
    
     
    @RequestMapping(value = "/newSeller", method = RequestMethod.POST)
    public String newSeller1(@ModelAttribute Seller seller) {
    	sellerService.saveOrUpdate(seller);
    	System.out.println("Seller data saved successfully");
    	return "redirect:home";
    }
    
      
    
    
    
  
}
