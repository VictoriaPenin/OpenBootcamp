/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devices;

/**
 *
 * @author vicky
 */
// SmartDevice class
class SmartDevice {
    private String brand;
    private String model;
    private int year;
    private double price;

    // Constructor vacío
    public SmartDevice() {
    }

    // Constructor con parámetros
    public SmartDevice(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

 

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ") - Price: $" + price;
    }
}

// SmartPhone class (subclass of SmartDevice)
class SmartPhone extends SmartDevice {
    private String networkType;

    // Constructor vacío
    public SmartPhone() {
    }

    // Constructor con parámetros
    public SmartPhone(String brand, String model, int year, double price, String networkType) {
        super(brand, model, year, price);
        this.networkType = networkType;
    }

    // Getters and Setters (Opcional)
    // ...

    @Override
    public String toString() {
        return super.toString() + ", Network Type: " + networkType;
    }
}

// SmartWatch class (subclass of SmartDevice)
class SmartWatch extends SmartDevice {
    private String strapMaterial;

    // Constructor vacío
    public SmartWatch() {
    }

    // Constructor con parámetros
    public SmartWatch(String brand, String model, int year, double price, String strapMaterial) {
        super(brand, model, year, price);
        this.strapMaterial = strapMaterial;
    }

    // Getters and Setters (Opcional)
    // ...

    @Override
    public String toString() {
        return super.toString() + ", Strap Material: " + strapMaterial;
    }
}
