package com.streams.java;

public class PruebaFuncionales {

    public static void main(String[] args) {
        
        //Clase anonima
        //Instancia de una interface
        Operacion sumar = (a , b)-> a + b;
        
        //Ejecutar el metodo
        Integer resultado = sumar.ejecutar(2, 5);
        System.out.println(resultado);


        //resta
        Operacion resta = (a,b)-> a - b;
        Integer resultado2 = resta.ejecutar(2, 5);
        System.out.println(resultado2);
    

        //Crear metodo para multiplicar
        //Utilizando la expresion lambda
        Operacion multiplicar = (a ,  b) -> a * b;
        Integer resultado3 = multiplicar.ejecutar(2, 3);
        System.out.println(resultado3);

        Operacion division = (a, b) -> a / b;
        Integer resultado4 = division.ejecutar(10, 2);
        System.out.println(resultado4);
    }

}