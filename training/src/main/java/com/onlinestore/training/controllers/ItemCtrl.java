package com.onlinestore.training.controllers;

import com.onlinestore.training.entities.Client;
import com.onlinestore.training.entities.Item;
import com.onlinestore.training.services.ClientService;
import com.onlinestore.training.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/item")
public class ItemCtrl {

    @Autowired
    ItemService itemService;

    @GetMapping
    public List<Item> findAll() {

        return itemService.findAll();
    }

    @PostMapping
    public String create(@RequestBody Item item) {
        itemService.create(item);
        return "item creado exitosamente.";
    }


    @PutMapping
    public String edit(@RequestBody Item item) {

        itemService.updateItem(item);
        return "Item actualizado exitosamente.";
    }

    @DeleteMapping
    public String delete(@RequestParam("id") Long itemtId) {
        itemService.deleteItem(itemtId);
        return "Item eliminado exitosamente.";
    }


}
