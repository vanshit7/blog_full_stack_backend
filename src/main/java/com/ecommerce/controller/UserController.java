package com.ecommerce.controller;

import com.ecommerce.constants.UserRole;
import com.ecommerce.model.User;
import com.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


import javax.naming.NoPermissionException;
import java.net.http.HttpHeaders;
import java.util.List;

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping("/user")
  public List<User> listUsers() {
    return userService.getAllusers();
  }

  @RequestMapping("/user/{username}")
  public User getUserWithName(@PathVariable String username) {
    return userService.getUserFromUserName(username);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/user")
  public void createUser(@RequestHeader("user-role") String userRole, @RequestBody User user) throws NoPermissionException {
    if (userRole.equals(UserRole.ADMIN.getRoleName())) {
      userService.addUser(user);
    }
    else {
      throw new NoPermissionException("Only Admins are allowed to create a user");
    }
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/user/{username}")
  public void UpdateUser(@RequestHeader("user-role") String userRole, @RequestBody User user, @PathVariable String username)
          throws NoPermissionException {
    if (!userRole.equals(UserRole.GUEST.getRoleName())) {
      userService.updateUserInfo(username, user);
    }
    else {
      throw new NoPermissionException("Only registered users are allowed to update their information");
    }
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/user/{username}")
  public void deleteUser(@RequestHeader("user-role") String userRole, @PathVariable String username) throws NoPermissionException {
    if (userRole.equals(UserRole.ADMIN.getRoleName())) {
      userService.deleteUser(username);
    }
    else {
      throw new NoPermissionException("Only Admins are allowed to delete a user");
    }
  }

  @RequestMapping("*")
  public String fallbackMethod(){
    return "fallback method";
  }
}
