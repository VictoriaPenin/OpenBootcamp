package org.example;

public class PruebaFunciones {
    public static void main(String[] args) {

        //si tiene el modificador public, se puede llamar a una funcion desde otra clase
        Funciones.holaMundo(548);
    }

    //protected hace que solo se pueda acceder desde cualquier clase del mismo paquete
    //private no permite el acceso desde otra clase
}
