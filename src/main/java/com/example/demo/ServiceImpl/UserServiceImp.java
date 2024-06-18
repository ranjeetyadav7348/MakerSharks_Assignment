package com.example.demo.ServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.User;
import com.example.demo.Payloads.UserDto;
import com.example.demo.Reposistory.UserRepository;
import com.example.demo.Service.UserService;


@Component
public class UserServiceImp  implements UserService{


     @Autowired
    private UserRepository userRepo;

    @Autowired
    private ModelMapper modelMapper;

    // @Autowired 
    // private PasswordEncoder passwordEncoder;

    @Override
    public UserDto register(UserDto userDto) {

        User user= modelMapper.map(userDto,User.class);

        //encode the password
        user.setPassword((user.getPassword()));
        

        User newUser=userRepo.save(user);

        return modelMapper.map(newUser,UserDto.class);
       
    }

    @Override
    public UserDto find(String email) {
        // TODO Auto-generated method stub
        

        User us1= userRepo.findByEmail(email).orElseThrow(null);

        return modelMapper.map(us1,UserDto.class);
    }
    
}
