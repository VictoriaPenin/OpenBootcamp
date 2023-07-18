package org.example;

import java.util.Scanner;

public class Precio {


          static double getPrice() {
            return 100.99;
        }

        static void showMenu() {
            System.out.println("Bienvenidos al E-commerce de zapatillas:");
            System.out.println("1 - Ver zapatillas");
            System.out.println("2 - Comprar zapatilla");
            System.out.println("3 - Salir");
        }

        static String getMenu() {
            return "Bienvenidos al E-commerce de zapatillas: \n 1 - Ver zapatillas....";
        }

        static double calcularPrecioConIVA(double precioOriginal, double iva) {
            double precioConIVA = precioOriginal * (1 + iva);
            return precioConIVA;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Call the static method showMenu() without using the instance
            showMenu();

            // Call the static method getPrice() without using the instance
            double price = getPrice();
            System.out.println("Price: " + price);






            // Calculate price with IVA included using the calcularPrecioConIVA function
            System.out.println("Enter the original price: ");
            double originalPrice = scanner.nextDouble();
            System.out.println("Enter the IVA percentage (e.g., 21 for 21%): ");
            double ivaPercentage = scanner.nextDouble() / 100.0; // Convert to decimal
            double priceWithIVA = calcularPrecioConIVA(originalPrice, ivaPercentage);
            System.out.println("Price with IVA included: " + priceWithIVA);

            // Don't forget to close the scanner to release the resources
            scanner.close();
        }

        static int suma(int numero1, int numero2) {
            return numero1 + numero2;
        }

        static String obtenerSaludo(String nombre, String apellido) {
            return "Buenas tardes " + nombre + " " + apellido;
        }

        static void imprimirSaludoBuenosDias(String nombre) {
            System.out.println("Buenas tardes " + nombre);
        }
    }



