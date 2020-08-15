package com.onlinestore.training.services;


import com.onlinestore.training.entities.Client;
import com.onlinestore.training.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    CrudRepository<Item, Long> itemRepository;

    public void create (Item item){

        itemRepository.save(item);
    }

    public List<Item> findAll(){
        return (List<Item>)
                itemRepository.findAll();
    }

    public void deleteItem(Long id ){

        itemRepository.deleteById(id);

    }

    public void updateItem(Item item){
        itemRepository.save(item);
    }


}
