package com.ecommerce.model;

import com.ecommerce.constants.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "product")
public class Product {

  @Id
  private long id;
  private String name;
  private double price;
  private int quantity;
  private String description;
  private boolean isAvailable;
  private Category category;

  public Product() {};
}
