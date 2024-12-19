package com.secure.note.service;

import com.secure.note.dto.UserDto;
import com.secure.note.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    UserDto getUserById(Long id);

    void updateUserRole(Long userId, String roleNme);
}
