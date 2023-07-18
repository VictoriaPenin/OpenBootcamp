package org.example;

public class SwitchCase{
    public static void main(String[] args) {

        String weather = "sunny";

        switch (weather){

            case "sunny":
                System.out.println("El tiempo es soleado");
                break; //si no pongo este break, me muestra si o si el siguiente sout
            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;
                default:
                    System.out.println("No se pudo identificar el clima");
                    break;
        }
    }
}
