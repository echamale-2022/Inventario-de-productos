package org.edwarchamale.vista;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class MenuProducto {
    Scanner sc = new Scanner(System.in);
    public void menuProductoAdministrador(){
        MetodosMenuProductos mMenuProducto = new MetodosMenuProductos();
        MenuAdministrador mAdmin = new MenuAdministrador();
        System.out.println("*****************");
        System.out.println("* Menu producto *");
        System.out.println("*****************");
        System.out.println("1.  Agregar producto");
        System.out.println("2.  Reporte producto");
        System.out.println("3.  Actualizar producto");
        System.out.println("4.  Eliminar producto");
        System.out.println("5.  Regresar al menu administrador");
        System.out.println("Elija la opcion que desea");
        int opc = sc.nextInt();
            switch(opc){
                case 1:
                    mMenuProducto.agregarProductos();
                    this.menuProductoAdministrador();
                    break;
                case 2:
                    System.out.println("************");
                    System.out.println("* Reportes *");
                    System.out.println("************");
                    System.out.println("1.  Reporte general");
                    System.out.println("2.  Reporte individual");
                    System.out.println("3.  Regresar al menu");
                    System.out.println("Elija la opcion que desea");
                    int subOpc = sc.nextInt();
                        switch(subOpc){
                            case 1:
                                mMenuProducto.reporteProductos();
                                this.menuProductoAdministrador();
                                break;
                            case 2:
                                mMenuProducto.buscarProducto();
                                this.menuProductoAdministrador();
                                break;
                            case 3:
                                this.menuProductoAdministrador();
                                break;
                            default:
                                System.out.println("Opcion no validad");
                        }
                    break;
                case 3:
                    mMenuProducto.actualizarProducto();
                    this.menuProductoAdministrador();
                    break;
                case 4:
                    mMenuProducto.eliminarProducto();
                    this.menuProductoAdministrador();
                    break;
                case 5:
                    mAdmin.menuAdministrador();
                    break;
                default:
                    System.out.println("Opcion no validad");
            }
    }
    public void menuProductoBasico(){
        MetodosMenuProductos mMenuProducto = new MetodosMenuProductos();
        MenuBasico mBasico = new MenuBasico();
        System.out.println("***************");
        System.out.println("* Menu basico *");
        System.out.println("***************");
        System.out.println("1.  Agregar producto");
        System.out.println("2.  Reporte producto");
        System.out.println("3.  Regresar al menu basico");
        System.out.println("Elija la opcion que desea");
        int opc = sc.nextInt();
            switch(opc){
                case 1:
                    mMenuProducto.agregarProductos();
                    this.menuProductoBasico();
                    break;
                case 2:
                    System.out.println("************");
                    System.out.println("* Reportes *");
                    System.out.println("************");
                    System.out.println("1.  Reporte general");
                    System.out.println("2.  Reporte individual");
                    System.out.println("3.  Regresar al menu");
                    System.out.println("Elija la opcion que desea");
                    int subOpc = sc.nextInt();
                        switch(subOpc){
                            case 1:
                                mMenuProducto.reporteProductos();
                                this.menuProductoBasico();
                                break;
                            case 2:
                                mMenuProducto.buscarProducto();
                                this.menuProductoBasico();
                                break;
                            case 3:
                                this.menuProductoBasico();
                                break;
                            default:
                                System.out.println("Opcion no validad");
                        }
                    break;
                case 3:
                    mBasico.menuBasico();
                    break;
                default:
                    System.out.println("Opcion no validad");
            }
    }
}
