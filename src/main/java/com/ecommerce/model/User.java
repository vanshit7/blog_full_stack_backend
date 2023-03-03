package com.ecommerce.model;

import com.ecommerce.constants.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {

  @Id
  private Long id;
  private String username;
  private String first_name;
  private String last_name;
  private String email;
  private String password;
  private String phone;
  private UserRole role = UserRole.GUEST;

  public User() {}
}
