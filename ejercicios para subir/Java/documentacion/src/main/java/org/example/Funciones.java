package org.example;

public class Funciones {
    public static void main(String[] args) {

        //holaMundo();
       // holaMundo();

   holaMundo("Vicky", "Peñin");
   holaMundo("Victoria");

        String hola = devolverHolaMundo();
        System.out.println(hola);


    }

    static void holaMundo(int i) {
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");

    }

    //la sobrecarga de funciones, se da cuando se le pone diferentes parametros, a la misma funcion
    public static void holaMundo(String name) {
        System.out.println("Hola" + " " + name);

    }

    public static void holaMundo(String name, String surname) {
        System.out.println("Hola" + " " + name + " " + surname);

    }


    private static String devolverHolaMundo() {
        return "Hola";
    }


}


