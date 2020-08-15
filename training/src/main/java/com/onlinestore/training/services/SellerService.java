package com.onlinestore.training.services;


import com.onlinestore.training.entities.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {

    @Autowired
    CrudRepository<Seller, Long> sellerCrudRepository;

    public void create(Seller seller){

         sellerCrudRepository.save(seller);
    }

    public List<Seller> findAll(){
        return (List<Seller>)
                sellerCrudRepository.findAll();

    }

    public void deleteSeller(Long id){
        sellerCrudRepository.deleteById(id);
    }

    public void updateSeller( Seller seller){
        sellerCrudRepository.save(seller);
    }

}
