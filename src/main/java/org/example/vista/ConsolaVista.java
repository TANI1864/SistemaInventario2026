package org.example.vista;

import java.util.Scanner;
import org.example.servicio.ProductoServicio;

public class ConsolaVista {

    //Es la conexión con la capa lógica.

    private ProductoServicio servicio;
    private Scanner sc = new Scanner(System.in);

    //Recibe el servicio y lo guarda.
    //Esta parte se llama Inyección de dependencia
    public ConsolaVista(ProductoServicio servicio) {
        this.servicio = servicio;
    }

    public void iniciar() {
        //Guarda la opción que el usuario elige.
        int opcion;

        do {
            System.out.println("\n====== SISTEMA INVENTARIO ======");
            System.out.println("1. Registrar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar producto");
            System.out.println("4. Modificar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione opción: ");

            //Lee el número que eligió el usuario.
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    //Envía la información al servicio.
                    servicio.registrarProducto(nombre, precio, cantidad);
                    break;

                case 2:
                    //Solo llama al servicio.
                    servicio.listarProductos();
                    break;

                case 3:
                    System.out.print("ID: ");
                    servicio.buscarProducto(sc.nextInt());
                    break;

                case 4:
                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();

                    System.out.print("Nueva cantidad: ");
                    int nuevaCantidad = sc.nextInt();

                    servicio.modificarProducto(id, nuevoPrecio, nuevaCantidad);
                    break;

                case 5:
                    System.out.print("ID: ");
                    servicio.eliminarProducto(sc.nextInt());
                    break;
            }

        } while (opcion != 0);

        System.out.println("Sistema finalizado.");
    }
}
