package com.onlinestore.training.services;

import com.onlinestore.training.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClientService {

    @Autowired
    CrudRepository<Client, Long> clientCrudRepository;

    public void create(Client client) {

        clientCrudRepository.save(client);
    }

    public List<Client> findAll() {
        return (List<Client>)
                clientCrudRepository.findAll();
    }

    public void deleteUser(Long id ){

            clientCrudRepository.deleteById(id);

    }

    public void updateClient(Client client){
        clientCrudRepository.save(client);
    }


    /*
    public Client getClient(Long id){
        return  clientCrudRepository.findById(id);

    }

/*
    public Client editClient(Client fromClient){

            Optional<Client> toClient = getClient(fromClient.getId());
            mapClient(fromClient, toClient);
            return clientCrudRepository.save(toClient);
    }

    private void mapClient(Client from, Optional<Client> to){
       to.setAge(from.getAge());
       to.setCedula(from.getCedula());
       to.setFirstName(from.getFirstName());
       to.setLastName(from.getLastName());


    }

     */
}
