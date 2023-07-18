package org.example;

public class ConcatenarTextos {

    public static void main(String[] args) {
        String[] nombres = {"Juan", "María", "Pedro", "Ana"};

        // Concatenar los nombres en una variable
        String resultado = "";
        for (String nombre : nombres) {
            resultado += nombre + " ";
        }

        // Imprimir el resultado final por consola
        System.out.println("Resultado final: " + resultado);
    }
}
