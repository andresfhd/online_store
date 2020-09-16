package com.onlinestore.training.services;

import com.onlinestore.training.entities.Client;
import com.onlinestore.training.entities.Sale;
import com.onlinestore.training.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleCrudRepository;

    public void create (Sale sale){

        saleCrudRepository.save(sale);
    }

    public List<Sale> findAll(){
        return (List<Sale>)
                saleCrudRepository.findAll();
    }

    public List<Sale> findByClient(Client client){
        return saleCrudRepository.findByClient(client);
    }

    public  void deleteSale(Long id){
        saleCrudRepository.deleteById(id);
    }

    public void updatedSale(Sale sale){
        saleCrudRepository.save(sale);
    }

}
