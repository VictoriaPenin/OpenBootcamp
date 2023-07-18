package org.example;

public class PolimorfirmoMain {
    public static void main(String[] args) {

//        Auto auto2 = new AutoElectrico();
        Auto auto3 = new AutoHibrido();


if (auto3 instanceof AutoElectrico){
    System.out.println("Auto Electrico");
}

if (auto3 instanceof AutoHibrido){
    System.out.println("Auto Hibrido");
}

    }
}
