package herencia;

public class Auto {
    //Atributos

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    //Constructores, nos permiten crear objetos de una clase
    public Auto() {     //constructor vacio
    }

    public Auto(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color; //el this hace referencia a la propiedad de un objeto
        this.largo = largo; //
        this.modelo = modelo;
        this.peso = peso;
        this.fabricante = fabricante;

    }

    //Comportamiento , metodo acelerar

    public void acelerar(Integer cantidad) {
        if (cantidad > 0 && cantidad < 120) {
            this.velocidad += cantidad;
        }
}

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
