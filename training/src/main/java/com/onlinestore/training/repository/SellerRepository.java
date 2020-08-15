package com.onlinestore.training.repository;

import com.onlinestore.training.entities.Seller;
import org.springframework.data.repository.CrudRepository;

public interface SellerRepository extends CrudRepository <Seller, Long>  {
}
