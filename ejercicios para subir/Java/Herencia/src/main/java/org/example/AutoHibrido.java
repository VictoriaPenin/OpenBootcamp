package org.example;

public class AutoHibrido extends Auto{

    String motorHibrido;

    public AutoHibrido(){}

    public AutoHibrido(String motorHibrido) {
        this.motorHibrido = motorHibrido;
    }

    @Override
    public String toString() {
        return "AutoHibrido{" +
                "motorHibrido='" + motorHibrido + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
