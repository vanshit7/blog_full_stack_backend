package com.ecommerce.services;

import com.ecommerce.constants.UserRole;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> getAllusers() {
    List<User> allUsers = new ArrayList<>();
    userRepository.findAll().forEach(allUsers::add);
    return allUsers;
  }

  public User getUserFromUserName(String username) {
    return userRepository.findUserByUsername(username);
  }

  public void addUser(User user) {
    user.setRole(UserRole.REGISTERED);
    userRepository.save(user);
  }

  public void updateUserInfo(String username, User user) {
    UserRole role = userRepository.findByUsername(username).getRole();
    user.setRole(role);
    userRepository.save(user);
  }

  public void deleteUser(String username) {
    userRepository.deleteByUsername(username);
  }
}
