package herencia;

public class AutoMain {
    public static void main(String[] args) {

        String auto = "Fiat";
        Auto autoObj = new Auto();  //esto es un objeto, cuando creamos un objeto, estamos instanciando una clase

        Auto autoObj1 = new Auto("rojo", "Honda", "civic", 125.5, 98.3 );

        autoObj.acelerar(50);

        System.out.println(autoObj1);




    }
}
