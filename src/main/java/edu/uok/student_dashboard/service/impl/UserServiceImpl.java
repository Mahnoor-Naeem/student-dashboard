package edu.uok.student_dashboard.service.impl;

import edu.uok.student_dashboard.dto.UserDto;
import edu.uok.student_dashboard.entity.User;
import edu.uok.student_dashboard.exception.ResourceNotFoundException;
import edu.uok.student_dashboard.mapper.UserMapper;
import edu.uok.student_dashboard.repository.UserRepository;
import edu.uok.student_dashboard.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User saveUser = userRepository.save(user);
        return UserMapper.mapToUserDto(saveUser);
    }

    @Override
    public UserDto getUserByEmailAndPassword(String email, String pass) {
        User user = userRepository.findByEmailAndPassword(email, pass).orElseThrow(()->
                new ResourceNotFoundException("User Not Exist With Given Email And Password!"));
        return UserMapper.mapToUserDto(user);
    }
}
