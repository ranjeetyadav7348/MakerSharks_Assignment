package com.example.demo.Payloads;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@NoArgsConstructor
@Getter
@Setter
public class UserDto {



    // here i created Dto to maintain the standard of application

    private int id;

    @NotEmpty
    @Size(min=4,message = "Username must be min is 4 characters!!")
    private String name;
    @Email(message = "Email is not valid")
    private String email;
    @NotEmpty
    @Size(min = 3,max = 10,message = "Password must be in between 4 to 10 character")
    private String password;
    @NotEmpty
    private String about;
    
}
