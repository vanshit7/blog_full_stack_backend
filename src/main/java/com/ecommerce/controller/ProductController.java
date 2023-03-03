package com.ecommerce.controller;

import com.ecommerce.constants.Category;
import com.ecommerce.model.Product;
import com.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

  @Autowired
  private ProductService productService;

  @RequestMapping("/{category}/products")
  public List<Product>  getProductsByCategory(@PathVariable Category category) {
    return productService.getProductsByCategory(category);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/product/{id}")
  public Product getProductById(@PathVariable long id) {
    return productService.getProductById(id);
  }

//  @RequestMapping(method = RequestMethod.GET, value = "/product/{name}")
//  public List<Product> getProductsByName(@PathVariable String name) {
//    return productService.getProductsByName(name);
//  }

  @RequestMapping(method = RequestMethod.POST, value = "/product")
  public void addProduct(@RequestBody Product product) {
    productService.addProduct(product);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/product/{id}")
  public void addProduct(@RequestBody Product product, @PathVariable long id) {
    productService.updateProduct(product);
  }

}
