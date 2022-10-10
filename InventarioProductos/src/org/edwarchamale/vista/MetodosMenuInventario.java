package org.edwarchamale.vista;
import org.edwarchamale.controlador.ControladorInventario;
import org.edwarchamale.controlador.ControladorProducto;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class MetodosMenuInventario {
    ControladorInventario cInventario = new ControladorInventario();
    Scanner sc = new Scanner(System.in);
    String opcion;
    int codigoInventario = 0;
    public void agregarInventario(){
        ControladorProducto cProducto=new ControladorProducto();
        do{
            System.out.println("***********************");
            System.out.println("*Buscar id de producto*");
            System.out.println("***********************");
            System.out.println("Ingrese el id del producto");
            int idProducto = sc.nextInt();
                if(cProducto.verificar(idProducto)){
                    codigoInventario++;
                    System.out.println("********************");
                    System.out.println("*Ingreso Inventario*");
                    System.out.println("********************");
                    System.out.println("Ingrese la cantidad de productos");
                    int cantidad = sc.nextInt();
                    System.out.println("Ingrese el precio");
                    double precio = sc.nextDouble();
                    System.out.println("Ingrese el costo");
                    double costo = sc.nextDouble();		
                    cInventario.agregarInventario(idProducto, cantidad, precio, 
                                                  costo,codigoInventario);
                    System.out.println("¿Desea agregar otro? (si/no)");
                    opcion=sc.next();
                }else{
                    this.agregarInventario();
                }
        }while(opcion.toLowerCase().equals("si"));
    }   
    public void reporteInventario(){
        cInventario.reporteInventario();
    }
    public void buscarInventario(){
        do{
            System.out.println("*******************************");
            System.out.println("*Reporte Individual Inventario*");
            System.out.println("*******************************");
            System.out.println("Ingrese el codigo de inventario");
            codigoInventario=sc.nextInt();
            cInventario.buscarInventario(codigoInventario);
            System.out.println("¿Desea buscar otro? (si/no)");
            opcion=sc.next();
        }while(opcion.toLowerCase().equals("si"));
    }
    public void actualizarInventario(){
        System.out.println("*************************");
        System.out.println("* Actualizar inventario *");
        System.out.println("*************************");
        System.out.println("Ingrese el codigo de inventario a actualizar");
        codigoInventario = sc.nextInt();
        cInventario.actualizarInventario(codigoInventario);
    }
    public void eliminarInventario(){
        System.out.println("***********************");
        System.out.println("* Eliminar inventario *");
        System.out.println("***********************");
        System.out.println("Ingrese el codigo de inventario a eliminar");
        codigoInventario = sc.nextInt();
        cInventario.eliminarInventario(codigoInventario);
    }
}
