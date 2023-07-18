package org.example.interfaces;

import org.example.Auto;
import org.example.AutoHibrido;
import org.example.interfaces.AutoService;

public class AutoServiceCassicImpl implements AutoService {
    @Override
    public Auto crearAutoDemo() {
        System.out.println("Creando auto clasico");
        return new AutoHibrido();
    }

    @Override
    public void destruirAuto() {

    }
}
