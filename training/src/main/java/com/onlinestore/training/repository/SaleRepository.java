package com.onlinestore.training.repository;

import com.onlinestore.training.entities.Sale;
import org.springframework.data.repository.CrudRepository;

public interface SaleRepository extends CrudRepository<Sale, Long> {
}
