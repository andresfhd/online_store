package com.onlinestore.training.repository;

import com.onlinestore.training.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Long> {
}
