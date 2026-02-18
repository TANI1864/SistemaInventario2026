package org.example.repositorio;

import org.example.modelo.Producto;
import java.util.List;

public interface ProductoRepositorio {

    void guardar(Producto producto);

    List<Producto> listar();

    Producto buscarPorId(int id);

    void eliminar(int id);
}

