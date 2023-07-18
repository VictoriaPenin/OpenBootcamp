package org.example;

public class AutoMain {

        public static void main(String[] args) {

            String auto = "Fiat";

            //comento Auto para que no me de error porque puse como abstracta la clase Auto
          //  Auto autoObj = new Auto();  //esto es un objeto, cuando creamos un objeto, estamos instanciando una clase

       //     Auto autoObj1 = new Auto("rojo", "Honda", "civic", 125.5, 98.3 );

        //    autoObj1.acelerar(50);

        //    System.out.println(autoObj1);



AutoElectrico autoElectrico = new AutoElectrico();

autoElectrico.motorElectrico = "modelo de motor";
autoElectrico.color = "Azul";

            System.out.println(autoElectrico);


AutoHibrido autoHibrido = new AutoHibrido();

autoHibrido.motorHibrido = "modelo de Motor Hibrido";
autoHibrido.color = "verde";
autoHibrido.largo = 6658.3;

            System.out.println(autoHibrido);

            AutoElectrico autoElectrico2 = new AutoElectrico("rosa", "Ford", "focus", 885.5, 998.3,"pepito");
            System.out.println(autoElectrico2);

            autoElectrico2.acelerar(50);

            System.out.println(autoElectrico2);

        }



    }

