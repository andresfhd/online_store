package com.onlinestore.training.controllers;

import com.onlinestore.training.entities.Client;
import com.onlinestore.training.entities.Sale;
import com.onlinestore.training.services.ClientService;
import com.onlinestore.training.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleCtrl {

    @Autowired
    SaleService saleService;


    @GetMapping
    public List<Sale> findAll(){

        return  saleService.findAll();
    }

    @PostMapping
    public String create(@RequestBody Sale sale) {
        saleService.create(sale);
        return "Sale created succesfully";
    }

    @PutMapping
    public String update(@RequestBody Sale sale){
        saleService.updatedSale(sale);
        return "Sale updated succesfully";
    }

    @DeleteMapping
    public String delete(@RequestParam("id") Long saleId){
        saleService.deleteSale(saleId);
        return "Sale delete succesfully";
    }

}



