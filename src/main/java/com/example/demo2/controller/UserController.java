package com.example.demo2.controller;

import com.example.demo2.domain.User;
import com.example.demo2.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @PostMapping("/user")
  public User createUser(User user) {
    userService.createUser(user);
    return user;
  }

  @GetMapping("/user")
  public List<User> getAllUser() {
    return userService.getAllUsers();
  }

  @GetMapping("/user/{userId}")
  public User getUserById(@PathVariable("userId") int userId) {
    return userService.getUserById(userId);
  }

  @PatchMapping("/user/{userId}")
  public User updateUser(@PathVariable("userId") int userId, @RequestBody User user) {
    return userService.updateUser(userId, user);
  }

  @DeleteMapping("/user/{userId}")
  public void deleteUser(@PathVariable("userId") int userId) {
    userService.deleteUserById(userId);
  }
}
