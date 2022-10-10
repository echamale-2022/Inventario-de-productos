package org.edwarchamale.vista;
import org.edwarchamale.controlador.ControladorProducto;
import org.edwarchamale.controlador.ObtenerDatos;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class MetodosMenuProductos {
    ControladorProducto cProducto = new ControladorProducto();
    Scanner sc = new Scanner(System.in);
    String opcion;
    int idProducto = 0;
    public void agregarProductos(){
        ObtenerDatos oDatos = new ObtenerDatos();
        do{
            idProducto ++;
            System.out.println("********************");
            System.out.println("* Agregar producto *");
            System.out.println("********************");
            System.out.println("Ingrese el nombre del producto");
            String producto = oDatos.producto();
            System.out.println("Ingrese la descripcion del producto");
            String descripcion = oDatos.descripcion();
            System.out.println("Ingrese la marca del producto");
            String marca = oDatos.marca();
            cProducto.ingresarProducto(producto, descripcion, marca, idProducto);
            System.out.println("¿Desea agregar otro producto (si/no)?");
            opcion = sc.next();
        }while(opcion.toLowerCase().equals("si"));
    }
    public void reporteProductos(){
        cProducto.reporteProductos();
    }
    public void buscarProducto(){
        System.out.println("******************");
        System.out.println("* Buscar usuario *");
        System.out.println("******************");
        System.out.println("Ingrese el id del producto a buscar");
        idProducto = sc.nextInt();
        cProducto.buscarProducto(idProducto);
    }
    public void actualizarProducto(){
        System.out.println("***********************");
        System.out.println("* Actualizar producto *");
        System.out.println("***********************");
        System.out.println("Ingrese el id del producto a actualizar");
        idProducto = sc.nextInt();
        cProducto.actualizarProducto(idProducto);
    }
    public void eliminarProducto(){
        System.out.println("*********************");
        System.out.println("* Eliminar producto *");
        System.out.println("*********************");
        System.out.println("Ingrese el id del producto a eliminar");
        idProducto = sc.nextInt();
        cProducto.eliminarProducto(idProducto);
    }
}
