package org.example;

public class Main {
    public static void main(String[] args) {

        int[] notas = new int[10];
        int[] notas2 = {8, 5, 6, 8, 9, 4, 3, 1};


        notas[0] = 6;
        notas[1] = 9;

        System.out.println(notas[1]);

        for(int i=0; i<notas2.length; i++){
            System.out.println(notas2[i]);
        }

        for(int item:notas2){
            System.out.println(item);



    }
    }
