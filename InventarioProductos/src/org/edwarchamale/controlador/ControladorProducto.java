package org.edwarchamale.controlador;
import org.edwarchamale.modelo.Producto;
import org.edwarchamale.vista.MenuAdministrador;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Edwar
 */
public class ControladorProducto {
    public static ArrayList<Producto> arregloProducto = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    public void ingresarProducto(String producto, String descripcion, String marca, int idProducto){
        arregloProducto.add(new Producto(producto, descripcion, marca, idProducto));
    }
    public void reporteProductos(){
        System.out.println("*********************");
        System.out.println("* Reporte productos *");
        System.out.println("*********************");
        for(int i = 0; i < arregloProducto.size(); i++){
            System.out.println("Id del producto: " + arregloProducto.get(i).getIdProducto());
            System.out.println("Nombre del producto: " + arregloProducto.get(i).getProducto());
            System.out.println("Descripcion del producto: " + arregloProducto.get(i).getDescripcion());
            System.out.println("Marca del producto: " + arregloProducto.get(i).getMarca());
        }
    }
    public void buscarProducto(int idProducto){
        for(int i = 0; i < arregloProducto.size(); i++){
            if(idProducto == arregloProducto.get(i).getIdProducto()){
                System.out.println("*** Producto encontrado ***");
                System.out.println("Id del producto: " + arregloProducto.get(i).getIdProducto());
                System.out.println("Nombre del producto: " + arregloProducto.get(i).getProducto());
                System.out.println("Descripcion del producto: " + arregloProducto.get(i).getDescripcion());
                System.out.println("Marca del producto: " + arregloProducto.get(i).getMarca());
                break;
            } else{
                contador ++;
            }
                if(contador == arregloProducto.size()){
                    System.out.println("Id de producto no encontrado");
                }
        }
    }
    public boolean verificar(int idProducto){
	for(int i = 0; i < arregloProducto.size(); i++){
		if(idProducto == arregloProducto.get(i).getIdProducto()){
                    System.out.println("Buscando.....");
                    System.out.println("Buscando.");
                    System.out.println("Buscando..");
                    System.out.println("Buscando.....");
                    System.out.println("Id de producto, si se encuentra");
                    return true;
		} else{
                    contador ++;
		}
                    if(contador == arregloProducto.size()){
			System.out.println("Buscando.....");
			System.out.println("Buscando.");
			System.out.println("Buscando..");
			System.out.println("Buscando.....");
			System.out.println("Id de producto, no se encuentra");
			System.out.println("Intentelo de nuevo");
			return false;
                    }
	}
	return true;
	}
    public void actualizarProducto(int idProducto){
        ObtenerDatos oDatos = new ObtenerDatos();
        for(int i = 0; i < arregloProducto.size(); i++){
            if(idProducto == arregloProducto.get(i).getIdProducto()){
                System.out.println("¿Que desea actualizar?");
                System.out.println("(producto/descripcion/marca)");
                String opcion = sc.next();
                    if(opcion.equalsIgnoreCase("producto")){
                        System.out.println("Ingrese el nuevo producto");
                        String producto = oDatos.producto();
                        arregloProducto.get(i).setProducto(producto);
                        System.out.println("Actualizado exitosamente");
                        break;
                    } else if(opcion.equalsIgnoreCase("descripcion")){
                        System.out.println("Ingrese la nueva descripcion");
                        String descripcion = oDatos.descripcion();
                        arregloProducto.get(i).setDescripcion(descripcion);
                        System.out.println("Actualizado exitosamente");
                        break;
                    } else if(opcion.equalsIgnoreCase("marca")){
                        System.out.println("Ingrese la nueva marca");
                        String marca = oDatos.marca();
                        arregloProducto.get(i).setMarca(marca);
                        System.out.println("Actualizado exitosamente");
                        break;
                    } else{
                        System.out.println("No se encuentra lo que desea actualizar");
                        break;
                    }
            } else{
                contador ++;
            }
                if(contador == arregloProducto.size()){
                    System.out.println("Id de producto no encontrado");
                }
        }
    }
    public void eliminarProducto(int idProducto){
        MenuAdministrador mAdmin = new MenuAdministrador();
        for(int i = 0; i < arregloProducto.size(); i++){
            if(idProducto == arregloProducto.get(i).getIdProducto()){
                System.out.println("¿Esta seguro de eliminarlo (si/no)?");
                String opcion = sc.next();
                    if(opcion.equalsIgnoreCase("si")){    
                        arregloProducto.remove(i);
                        System.out.println("Eliminado exitosamente");
                        break;
                    } else{
                        System.out.println("Sera mandado al menu");
                        mAdmin.menuAdministrador();
                    }
            } else{
                contador ++;
            }
                if(contador == arregloProducto.size()){
                    System.out.println("Id de producto no encontrado");
                }
        }
    }
}
