package com.onlinestore.training.controllers;


import com.onlinestore.training.entities.Seller;
import com.onlinestore.training.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerCtl {

        @Autowired
        SellerService sellerService;

        @GetMapping
        public List<Seller> findAll(){
            return sellerService.findAll();
        }

        @PostMapping
        public String create(@RequestBody Seller seller){
            sellerService.create(seller);
            return "Seller create successfully";
        }

        @PutMapping
        public String update(@RequestBody Seller seller){
            sellerService.updateSeller(seller);
            return "Seller update successfully";
        }

        @DeleteMapping
        public String delete(@RequestParam("id") Long idSeller){
            sellerService.deleteSeller(idSeller);
            return "Seller delete successfully";
        }
}
