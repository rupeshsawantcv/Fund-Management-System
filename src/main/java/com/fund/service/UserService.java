package com.fund.service;

import java.util.List;
import com.fund.entity.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
}
