package com.onlinestore.training.services;

import com.onlinestore.training.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    CrudRepository<Client, Long> clientCrudRepository;

    public void create(Client client) {
        clientCrudRepository.save(client);
    }

    public List<Client> findAll() {
        return (List<Client>) clientCrudRepository.findAll();
    }
}
