package com.example.demo.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Payloads.UserDto;


@Service
public interface UserService {



     UserDto register(UserDto userDto);
     UserDto find(String email);

    
}
