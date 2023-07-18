package org.example.interfaces;

import org.example.Auto;

public class InterfacesMain {

    public static void main(String[] args) {

        AutoService service1 = new AutoServiceCassicImpl();
        AutoService service2 = new AutoServiceSportImpl();


        Auto auto1 = service1.crearAutoDemo();

        Auto auto2 = service2.crearAutoDemo();


    }
}
