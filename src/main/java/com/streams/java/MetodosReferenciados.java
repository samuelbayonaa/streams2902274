package com.streams.java;

import java.util.List;

public class MetodosReferenciados {

    public static void main(String[] args) {
        
        //Lista de enteros
        List<Integer> ListaEnteros = List.of(1, 90, 7, 5, 20);
        System.out.println(ListaEnteros);

        //Recorrer la lista
        //Utilizando un Stream forEach
        //necesitando una funcion lambda
        ListaEnteros.forEach(( Integer elemento) -> System.out.println(elemento));
        System.out.println("----------------------------------------------------------------");
        ListaEnteros.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------");
        ListaEnteros.forEach(dato -> new Empleado(dato));
        ListaEnteros.forEach(Empleado :: new);
    }

}
