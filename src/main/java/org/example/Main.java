package org.example;

import org.example.repositorio.*;
import org.example.servicio.*;
import org.example.vista.ConsolaVista;

public class Main {

    public static void main(String[] args) {

        ProductoRepositorio repo = new ProductoRepositorioImpl();

        //Inyección de dependencias
        ProductoServicio servicio = new ProductoServicioImpl(repo);

        ConsolaVista vista = new ConsolaVista(servicio);
        vista.iniciar();
    }
}
