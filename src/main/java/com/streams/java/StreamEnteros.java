package com.streams.java;

import java.util.List;
import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;

public class StreamEnteros {

    public static void main(String[] args) {
        
        //Lista de Doubles:

        List<Double> listaDoubles = List.of(3.4 , 7.8 , 5.6 , 34.6 , 1.0 , 90.0 , 52.0);

        //Stream a partir de la lista
        DoubleStream streamDouble = listaDoubles.
                                    stream().
                                    mapToDouble(v -> Double.valueOf(v));
        //Contar cuantos numeros hay en la lista
        //Utilizando el Stream asociado
        //System.out.println("Hay " + streamDouble.count() + " Elementos");
        //Hallar el minimo valor en el flujo
        //System.out.println("El minimo valor es: " + streamDouble.min());
        //System.out.println("El maximo valor es: " + streamDouble.max());
        //System.out.println("El minimo valor es: " + streamDouble.average());

        //Hallar los numeros mayores a 20
        //Crear un predicado para los numeros mayores a 20
        DoublePredicate mayoresA20 = (n) -> n > 20;
        DoublePredicate pares = (n) -> n % 2 == 0;
        DoublePredicate menoresA70 = (n) -> n < 70;


        Long conteo = streamDouble.
                        filter(mayoresA20).
                        filter(pares).
                        filter(menoresA70).
                        count();
        System.out.println("Mayores a 20 y pares: " + conteo);
        

    }

}
