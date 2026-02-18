package org.example.modelo;

public class Producto {

    private static int contador = 1;//static significa que la variable pertenece a la clase,
                                    // no a cada objeto.

    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    // CONSTRUCTOR
    public Producto(String nombre, double precio, int cantidad) {
        this.id = contador++;// este asigna el ID actual y luego aumenta el contador.
        this.nombre = nombre;
        //Aquí usa los setters para aplicar validacione
        //Osea El constructor reutiliza los métodos de validación para evitar datos incorrectos
        setPrecio(precio);
        setCantidad(cantidad);
    }

    // GETTERS
    //Permiten leer los valores privados.
    //
    //Como los atributos son privados, solo se accede mediante métodos.
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    // SETTERS con validación  Comentario :Evita valores negativos.
    public void setPrecio(double precio) {
        if (precio >= 0)
            this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0)
            this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Nombre: " + nombre +
                " | Precio: $" + precio +
                " | Cantidad: " + cantidad;
    }
}

