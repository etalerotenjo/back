package com.example.demo.controller.service.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Cliente {
    @NotNull(message = "Debe especificar si tiene adjuntos o no")
    private Integer cedula;
    @NotNull(message = "Debe especificar si tiene adjuntos o no")
    private String nombre;
    @NotNull(message = "Debe especificar si tiene adjuntos o no")
    private String apellido;
    @NotNull(message = "Debe especificar si tiene adjuntos o no")
    private Integer celular;
    @NotNull(message = "Debe especificar si tiene adjuntos o no")
    private String correo;
}
