package org.example.interfaces;

import org.example.Auto;

public interface AutoService {

    //se declaran los metodos para que una clase los implemente

    public Auto crearAutoDemo();  //esto es un metodo, los metodos de interfaz no pueden tener cuerpo

    public void destruirAuto();
}
