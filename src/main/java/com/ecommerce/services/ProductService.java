package com.ecommerce.services;

import com.ecommerce.constants.Category;
import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public Product getProductById(Long id) {
    return productRepository.findById(id).orElse(null);
  }

  public List<Product> getProductsByCategory(Category category) {
    return productRepository.findByCategory(category);
  }

  public List<Product> getProductsByName(String name) {
    return productRepository.findByName(name);
  }

  public void addProduct(Product product) {
    productRepository.save(product);
  }

  public void updateProduct(Product product) {
    productRepository.save(product);
  };


}
