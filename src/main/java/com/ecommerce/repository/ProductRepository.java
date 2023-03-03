package com.ecommerce.repository;

import com.ecommerce.constants.Category;
import com.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

  List<Product> findByName(String name);
  List<Product> findByCategory(Category category);
}
