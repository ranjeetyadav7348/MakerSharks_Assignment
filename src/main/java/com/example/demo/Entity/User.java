package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor

public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
     @Email(message = "Email is not valid")
    String email;
   
      @NotEmpty
    @Size(min=4,message = "Username must be min is 4 characters!!")
    String name;

    @NotEmpty
    @Size(min = 3,max = 10,message = "Password must be in between 4 to 10 character")
    String password;
 
    @NotEmpty
    String about;
    
}
