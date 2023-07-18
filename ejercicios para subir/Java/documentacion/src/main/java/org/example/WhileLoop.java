package org.example;

public class WhileLoop {
    public static void main(String[] args) {

        boolean check = true;
        int contador = 0;

        while(contador < 10){

            System.out.println("Prueba While " + contador );
            contador++; //condicion, esto hace que no se haga un bucle infinito


        }
        System.out.println("Fin");
    }
}
