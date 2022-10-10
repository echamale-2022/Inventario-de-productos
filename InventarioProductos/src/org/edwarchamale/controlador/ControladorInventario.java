package org.edwarchamale.controlador;
import org.edwarchamale.modelo.Inventario;
import org.edwarchamale.vista.MenuAdministrador;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class ControladorInventario {
    public static ArrayList<Inventario> arregloInventario = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    
    public void agregarInventario(int idProducto, int cantidad, double precio,
                                  double costo, int codInventario){
        arregloInventario.add(new Inventario(idProducto, cantidad, precio, costo, codInventario));
    }
    public void reporteInventario(){
        System.out.println("*******************");
        System.out.println("* Reporte general *");
        System.out.println("*******************");
        for(Inventario i : arregloInventario){
            System.out.println("*************************************");
            System.out.println("El codigo de inventario es: " + i.getCodInventario());
            System.out.println("El id del producto es: " + i.getCodProducto());
            System.out.println("La cantidad de productos es: " + i.getCantidad());
            System.out.println("El precio del producto es: " + i.getPrecio());
            System.out.println("El costo del producto es: " + i.getCosto());
            System.out.println("*************************************");
        }
    }
    public void buscarInventario(int codigoInventario){
        for(int i = 0; i < arregloInventario.size(); i++){
            if(codigoInventario == arregloInventario.get(i).getCodInventario()){
                System.out.println("*** Codigo inventario encontrado ***");
                System.out.println("El codigo de inventario es: " + arregloInventario.get(i).getCodInventario());
                System.out.println("El id del producto es: " + arregloInventario.get(i).getCodProducto());
                System.out.println("La cantidad de productos es: " + arregloInventario.get(i).getCantidad());
                System.out.println("El precio del producto es: " + arregloInventario.get(i).getPrecio());
                System.out.println("El costo del producto es: " + arregloInventario.get(i).getCosto());
                break;
            } else{
                contador ++;
            }
                if(contador == arregloInventario.size()){
                    System.out.println("*** Codigo de inventario no encontrado ***");
                    break;
                }
        }
    }
    public void actualizarInventario(int codigoInventario){
        for(int i = 0; i < arregloInventario.size(); i++){
            if(codigoInventario == (arregloInventario.get(i).getCodInventario())){
                System.out.println("¿Que desea modificar?");
                System.out.println("(cantidad/precio/costo)");
                String opcion = sc.next();
                    if(opcion.equalsIgnoreCase("cantidad")){
                        System.out.println("Ingrese la nueva cantidad");
                        int cantidad = sc.nextInt();
                        arregloInventario.get(i).setCantidad(cantidad);
                        System.out.println("Actualizacion exitosamente");
                        break;
                    } else if(opcion.equalsIgnoreCase("precio")){
                        System.out.println("Ingrese el nuevo precio");
                        double precio = sc.nextDouble();
                        arregloInventario.get(i).setPrecio(precio);
                        System.out.println("Actualizacion exitosamente");
                        break;					
                    } else if(opcion.equalsIgnoreCase("costo")){
                        System.out.println("Ingrese el nuevo costo");
                        double costo = sc.nextDouble();
                        arregloInventario.get(i).setCosto(costo);
                        System.out.println("Actualizacion exitosamente");
                        break;					
                    } else{
                        System.out.println("No se encuentra lo que quiere actualizar");
                        break;
                    }
            } else{
                contador ++;
            }
                if(contador == arregloInventario.size()){
                    System.out.println("El codigo de inventario, no se encuentra");
                    break;
                }
        }
    }
    public void eliminarInventario(int codigoInventario){
        MenuAdministrador mAdmin = new MenuAdministrador();
        for(int i = 0; i < arregloInventario.size(); i++){
            if(codigoInventario == arregloInventario.get(i).getCodInventario()){
                System.out.println("¿Esta seguro de eliminarlo (si/no)?");
                String opcion = sc.next();
                    if(opcion.equalsIgnoreCase("si")){
                        arregloInventario.remove(i);
                        System.out.println("Eliminado exitosamente");
                        break;
                    } else{
                        System.out.println("Sera mandado al menu");
                        mAdmin.menuAdministrador();
                        break;
                    }
            } else{
                contador ++;
            }
                if(contador == arregloInventario.size()){
                    System.out.println("No se encuentra el codigo de inventario");
                    break;
                }
        }
    }
}
