package org.example;

public class IfContinue {
    public static void main(String[] args) {
 /*       int count = 0;
        while (count < 10){

            count++; //condicion

            if(count == 6)
                continue; //salta el valor 6 y continua la siguiente iteracion

            System.out.println("Hola mundo " + count);
        }
        System.out.println("Fin");
    } */

      /*  int count1 = 0;
        while (count1 < 10) {

            count1++; //condicion

            if (count1 == 6)
                break; //rompe el flujo de ejecucion y salta afuera del while

            System.out.println("Hola mundo " + count1);
        }
        System.out.println("Fin");
    }*/

        for (int i = 0; i <= 10; i++) {
            if (i == 6)
                continue;
            System.out.println(i + " Hola mundo");
        }
        System.out.println("Fin");
    }
}