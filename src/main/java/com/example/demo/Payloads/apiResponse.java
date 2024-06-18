package com.example.demo.Payloads;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class apiResponse {

    private String message;
    private boolean success;
    
}
