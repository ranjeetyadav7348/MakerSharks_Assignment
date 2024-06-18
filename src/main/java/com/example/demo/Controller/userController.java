package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Payloads.UserDto;
import com.example.demo.Payloads.apiResponse;
import com.example.demo.Service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/users")
public class userController {




    @Autowired
    private UserService userService;



    @PostMapping("/register")
    ResponseEntity<?> Register(@Valid @RequestBody UserDto userDto)
    {


        System.out.println("======================================================================"+userDto);

         UserDto createUserDto = userService.register(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createUserDto);

    }

    @GetMapping("/fetch/{email}")
    ResponseEntity<?> fetch(@PathVariable String email)
    {
        UserDto us1= userService.find(email);

        if(us1==null)
          return new ResponseEntity(new apiResponse("User not found with mail: "+email,true),HttpStatus.OK);


          return ResponseEntity.status(HttpStatus.CREATED).body(us1);
    }

    
}
