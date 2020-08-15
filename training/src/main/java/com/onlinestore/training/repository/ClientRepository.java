package com.onlinestore.training.repository;

import com.onlinestore.training.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {

    
}
