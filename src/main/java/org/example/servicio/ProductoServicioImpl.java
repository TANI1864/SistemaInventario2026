package org.example.servicio;

import org.example.modelo.Producto;
import org.example.repositorio.ProductoRepositorio;

public class ProductoServicioImpl implements ProductoServicio {

    private ProductoRepositorio repo;

    public ProductoServicioImpl(ProductoRepositorio repo) {
        this.repo = repo;
    }

    @Override
    public void registrarProducto(String nombre, double precio, int cantidad) {
        Producto producto = new Producto(nombre, precio, cantidad);
        repo.guardar(producto);
        System.out.println("Producto registrado correctamente.");
    }

    @Override
    public void listarProductos() {
        if (repo.listar().isEmpty()) {
            System.out.println("No hay productos.");
        } else {
            repo.listar().forEach(System.out::println);
        }
    }

    @Override
    public void buscarProducto(int id) {
        Producto p = repo.buscarPorId(id);
        if (p != null)
            System.out.println(p);
        else
            System.out.println("Producto no encontrado.");
    }

    @Override
    public void modificarProducto(int id, double precio, int cantidad) {
        Producto p = repo.buscarPorId(id);

        if (p != null) {
            p.setPrecio(precio);
            p.setCantidad(cantidad);
            System.out.println("Producto actualizado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    @Override
    public void eliminarProducto(int id) {
        repo.eliminar(id);
        System.out.println("Producto eliminado.");
    }
}
