package com.example.demo.controller.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private LocalDateTime timestamp;
    private String data;
    private HttpStatus respondeCode;
    private String status;
}
