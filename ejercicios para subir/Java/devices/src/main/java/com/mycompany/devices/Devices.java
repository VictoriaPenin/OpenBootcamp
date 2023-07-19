/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.devices;

/**
 *
 * @author vicky
 */
public class Devices {

    public static void main(String[] args) {
        // Crear objetos de SmartPhone
        SmartPhone phone1 = new SmartPhone("Apple", "iPhone 13", 2023, 999.99, "5G");
        SmartPhone phone2 = new SmartPhone("Samsung", "Galaxy S22", 2023, 899.99, "5G");

        // Crear objetos de SmartWatch
        SmartWatch watch1 = new SmartWatch("Apple", "Apple Watch Series 7", 2023, 399.99, "Stainless Steel");
        SmartWatch watch2 = new SmartWatch("Samsung", "Galaxy Watch 4", 2023, 349.99, "Leather");

        // Imprimir valores por consola
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(watch1);
        System.out.println(watch2);
    }
}
