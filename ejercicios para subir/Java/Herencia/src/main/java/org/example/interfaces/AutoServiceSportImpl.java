package org.example.interfaces;

import org.example.Auto;
import org.example.AutoElectrico;

public class AutoServiceSportImpl implements AutoService {
    @Override
    public Auto crearAutoDemo() {
        System.out.println("Creando auto deportivo");
        return new AutoElectrico();
    }

    @Override
    public void destruirAuto() {

    }
}
