package edu.uok.student_dashboard.controller;

import edu.uok.student_dashboard.dto.UserDto;
import edu.uok.student_dashboard.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserController {
    private UserService userService;
    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        UserDto savedUser = userService.createUser(userDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

//    @GetMapping("/{email}/{password}")
//    public ResponseEntity<UserDto> getUserByEmailAndPassword(@PathVariable("email") String email, @PathVariable("password") String pass){
//        UserDto getUser = userService.getUserByEmailAndPassword(email, pass);
//        return ResponseEntity.ok(getUser);
//    }
    @PostMapping("/login")
    public ResponseEntity<UserDto> getUserByEmailAndPassword(@RequestBody UserDto userDto){
        UserDto getUser = userService.getUserByEmailAndPassword(userDto.getEmail(), userDto.getPassword());
        return ResponseEntity.ok(getUser);
    }
}
