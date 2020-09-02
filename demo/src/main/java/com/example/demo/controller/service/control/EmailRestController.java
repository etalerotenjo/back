package com.example.demo.controller.service.control;

import com.example.demo.controller.service.dto.Cliente;
import com.example.demo.controller.service.interfaces.ClienteService;
import com.example.demo.controller.service.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("Customer/v1")
public class EmailRestController {


    @Autowired
    ClienteService clienteServce;

    @PostMapping(path = "/insert", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Response> insertCustomer(@Valid @RequestBody Cliente cliente) {
        System.out.println("INGRESO ");
        boolean result = clienteServce.saveCustomer(cliente);
        HttpStatus httpCode;
        String message;
        if (result) {
            httpCode = HttpStatus.CREATED;
            message = "Cliente creado correctamente";
        } else {
            httpCode = HttpStatus.INTERNAL_SERVER_ERROR;
            message = "Error";
        }
        Response resultEntity = new Response(LocalDateTime.now(), " ", httpCode, message);

        return new ResponseEntity<>(resultEntity, httpCode);
    }
}
