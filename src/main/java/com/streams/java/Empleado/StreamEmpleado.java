package com.streams.java.Empleado;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.stream.Stream;


public class StreamEmpleado {

    //Crear 
    public static void main(String[] args) {
        
    Empleado e1 = Empleado.builder()
                    .salario(3500000.0)
                    .nombre("Carlos")
                    .apellido("Corredor")
                    .Departamento("Cundinamarca").
                    build();
    List<Empleado> empleados = List.of(
                            e1,
                            Empleado.builder()
                            .salario(3500000.0)
                            .nombre("Carlos")
                            .apellido("Corredor")
                            .Departamento("Cundinamarca")
                            .build()
                            ,
                            new Empleado(
                                1500000.0,
                                "Jose",
                                "Bedoya",
                                "Sistemas"
                            )
                            ,
                            new Empleado(
                                4000000.0,
                                "Juan",
                                "Rodriguez",
                                "Tesoreria"
                            )
                            ,
                            new Empleado(
                                10000000.0,
                                "Maria",
                                "Nuñez",
                                "Logistica"
                            )
                            ,
                            new Empleado(
                                4500000.0,
                                "Laura",
                                "Garcia",
                                "Logistica"
                            )
                            ,
                            new Empleado(
                                1500000.0,
                                "Jorge",
                                "Ortiz",
                                "Logistica"
                            )
                        );
        System.out.println("Operaciones de streams");
        //Crear el stream de empleados:
        Stream<Empleado> streamEmpleados = empleados.stream();

        //1. COntar el numero de empleados en el Stream 
        //System.out.println("Numero de empleados: " + streamEmpleados.count());
        //2. Recorrer todos los empleados
        //streamEmpleados.forEach(e -> System.out.println(e.getSalario()));
        //Predicate
        Predicate<Empleado> mayoresA2palos = empleado -> empleado.getSalario() >= 2000000.0;
        Predicate<Empleado> menoresA3palos = empleado -> empleado.getSalario() < 3000000.0;
        Predicate<Empleado> entre2Y3 = mayoresA2palos.and(menoresA3palos);
        Function<Empleado, String> geNombreyApellido = empleado -> empleado.getApellido() + " " + empleado.getNombre();
        Function<Empleado, Double> getSalario = Empleado::getSalario;
        //Aplicacion del predicado con un filtro
        //streamEmpleados.filter(mayoresA2palos).map(geNombreyApellido).forEach(System.out::println);
        //System.out.println(streamEmpleados.max(Comparator.comparing(getSalario)));
        //System.out.println(streamEmpleados.min(Comparator.comparing(getSalario)));
        /*
        //Total de salario de empleados
        Double totalSalarios =  
        streamEmpleados.map(getSalario)
        //reduce: Halla el resultado de una operacion de acumulacion sobre un flujo
        //parametros: 
        //identidad: El valor inicial de la operacion
        //EL BO: Para ir sumnando los numeros
        .reduce( 0.0, (sal1, sal2) -> sal1 + sal2);
        System.out.println(totalSalarios);*/

        System.out.println(
        "Promedio de empleados de logistica " + 
        streamEmpleados.filter(e -> e.getDepartamento().equals("Logistica"))
        .mapToDouble(Empleado::getSalario)
        .average()
        );
        
        
    }
}
