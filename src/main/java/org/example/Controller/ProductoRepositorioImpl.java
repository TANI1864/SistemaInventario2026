package org.example.repositorio;

import org.example.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements ProductoRepositorio {

    private List<Producto> productos = new ArrayList<>();

    //Agrega un producto a la lista
    //lo cual significa
    @Override
    public void guardar(Producto producto) {
        productos.add(producto);
    }

    @Override
    public List<Producto> listar() {
        return productos;
    }

    @Override
    public Producto buscarPorId(int id) {
        for (Producto p : productos) { //Comentario : Buscar producto, este recorre la lista buscando el ID.
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void eliminar(int id) {
        productos.removeIf(p -> p.getId() == id);
    }
}
