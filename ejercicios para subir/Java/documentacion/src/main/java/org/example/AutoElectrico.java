package org.example;

public class AutoElectrico extends Auto{

    String motorElectrico;

    public AutoElectrico(){

    }

    public AutoElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "AutoElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }


}
