/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crud;

/**
 *
 * @author vicky
 */
interface CocheCRUD {
    void save();
    void findAll();
    void delete();
}

// Implementación de la interfaz CocheCRUD en CocheCRUDImpl
class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Ejecutando método save()");
    }

    @Override
    public void findAll() {
        System.out.println("Ejecutando método findAll()");
    }

    @Override
    public void delete() {
        System.out.println("Ejecutando método delete()");
    }
}