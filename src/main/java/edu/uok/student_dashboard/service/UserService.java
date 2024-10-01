package edu.uok.student_dashboard.service;

import edu.uok.student_dashboard.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByEmailAndPassword(String email, String pass);
}
