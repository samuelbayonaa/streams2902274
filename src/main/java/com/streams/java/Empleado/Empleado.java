package com.streams.java.Empleado;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@Setter
@Getter
@ToString
@Builder

public class Empleado {

    private Double salario;
    private String nombre;
    private String apellido;
    private String Departamento;
}
