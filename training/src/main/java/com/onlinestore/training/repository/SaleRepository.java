package com.onlinestore.training.repository;

import com.onlinestore.training.entities.Client;
import com.onlinestore.training.entities.Sale;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SaleRepository extends CrudRepository<Sale, Long> {
    List<Sale> findByClient(Client client);
}
