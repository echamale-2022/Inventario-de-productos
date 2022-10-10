package org.edwarchamale.vista;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class MenuAdministrador {
    Scanner sc = new Scanner(System.in);
    public void menuAdministrador(){
        MenuUsuario mUsuario = new MenuUsuario();
        MenuProducto mProducto = new MenuProducto();
        MenuInventario mInventario = new MenuInventario();
        MenuInicio mInicio = new MenuInicio();
        System.out.println("**********************");
        System.out.println("* Menu administrador *");
        System.out.println("**********************");
        System.out.println("1.  Menu usuarios");
        System.out.println("2.  Menu productos");
        System.out.println("3.  Menu inventario");
        System.out.println("4.  Cerrar sesion");
        System.out.println("5.  Salir del sistema");
        System.out.println("Elija la opcion que desea");
        int opc = sc.nextInt();
            switch(opc){
                case 1:
                    mUsuario.menuUsuarioAdministrador();
                    break;
                case 2:
                    mProducto.menuProductoAdministrador();
                    break;
                case 3:
                    mInventario.menuInventarioAdministrador();
                    break;
                case 4:
                    mInicio.menuInicio();
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no validad");
            }// switch #1
    }
}   
