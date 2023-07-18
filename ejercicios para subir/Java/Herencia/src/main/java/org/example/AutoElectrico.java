package org.example;

public class AutoElectrico extends Auto{

    String motorElectrico;

    public AutoElectrico() {

    }

    public AutoElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    public AutoElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico) {
        //el metodo super nos permite invocar a un constructor de la clase superior (se usa para reutilizar codigo
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
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
