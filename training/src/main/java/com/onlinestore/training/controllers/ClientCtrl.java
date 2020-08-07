package com.onlinestore.training.controllers;

import com.onlinestore.training.entities.Client;
import com.onlinestore.training.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientCtrl {

    @Autowired
    ClientService clientService;

    @GetMapping
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @PostMapping
    public String create(@RequestBody Client client) {
        clientService.create(client);
        return "Cliente creado exitosamente.";
    }

    @PutMapping
    public String edit(@RequestBody Client client) {
        return "Cliente actualizado exitosamente.";
    }

    @DeleteMapping
    public String delete(@RequestParam("id") String clientId) {
        return "Cliente eliminado exitosamente.";
    }
}
