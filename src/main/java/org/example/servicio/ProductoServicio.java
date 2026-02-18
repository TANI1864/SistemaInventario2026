package org.example.servicio;

public interface ProductoServicio {

    void registrarProducto(String nombre, double precio, int cantidad);

    void listarProductos();

    void buscarProducto(int id);

    void modificarProducto(int id, double precio, int cantidad);

    void eliminarProducto(int id);
}
