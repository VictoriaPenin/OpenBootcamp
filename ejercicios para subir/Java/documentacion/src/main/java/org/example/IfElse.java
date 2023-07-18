package org.example;

public class IfElse {
    public static void main(String[] args) {

        boolean check = 5 < 10;
        int num1 = 6;
        int num2 = 41;
        int num3 = 25;
        int num4 = 100;



        if (num1 < num2 && num2 < num3) {
            System.out.println("Este es Verdadero");
        }

    else if(num1 < num4){
        System.out.println("Este es Verdadero con else if");
    }else{
        System.out.println("Este es Falso");
}

}}

