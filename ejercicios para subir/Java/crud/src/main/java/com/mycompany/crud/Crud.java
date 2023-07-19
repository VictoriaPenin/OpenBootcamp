/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crud;

/**
 *
 * @author vicky
 */
public class Crud {

    public static void main(String[] args) {
     
        // Crear un objeto de tipo CocheCRUDImpl
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        // Llamar a cada uno de los métodos
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
    }

