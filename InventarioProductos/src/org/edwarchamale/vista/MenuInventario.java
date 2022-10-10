package org.edwarchamale.vista;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class MenuInventario {
    Scanner sc = new Scanner(System.in);
    public void menuInventarioAdministrador(){
        MetodosMenuInventario mMenuInventario = new MetodosMenuInventario();
        MenuAdministrador mAdmin = new MenuAdministrador();
        System.out.println("*******************");
        System.out.println("* Menu inventario *");
        System.out.println("*******************");
        System.out.println("1.  Agregar inventario");
        System.out.println("2.  Reporte inventario");
        System.out.println("3.  Actualizar inventario");
        System.out.println("4.  Eliminar inventario");
        System.out.println("5.  Regresar al menu administrador");
        System.out.println("Elija la opcion que desea");
        int opc = sc.nextInt();
            switch(opc){
                case 1:
                    mMenuInventario.agregarInventario();
                    this.menuInventarioAdministrador();
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
                                mMenuInventario.reporteInventario();
                                this.menuInventarioAdministrador();
                                break;
                            case 2:
                                mMenuInventario.buscarInventario();
                                this.menuInventarioAdministrador();
                                break;
                            case 3:
                                this.menuInventarioAdministrador();
                                break;
                            default:
                                System.out.println("Opcion no validad");
                        }
                    break;
                case 3:
                    mMenuInventario.actualizarInventario();
                    this.menuInventarioAdministrador();
                    break;
                case 4:
                    mMenuInventario.eliminarInventario();
                    this.menuInventarioAdministrador();
                    break;
                case 5:
                    mAdmin.menuAdministrador();
                    break;
                default:
                    System.out.println("Opcion no validad");
            }
    }
    public void menuInventarioBasico(){
        MetodosMenuInventario mMenuInventario = new MetodosMenuInventario();
        MenuBasico mBasico = new MenuBasico();
        System.out.println("*******************");
        System.out.println("* Menu inventario *");
        System.out.println("*******************");
        System.out.println("1.  Agregar inventario");
        System.out.println("2.  Reporte inventario");
        System.out.println("3.  Regresar al menu basico");
        System.out.println("Elija la opcion que desea");
        int opc = sc.nextInt();
            switch(opc){
                case 1:
                    mMenuInventario.agregarInventario();
                    this.menuInventarioBasico();
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
                                mMenuInventario.reporteInventario();
                                this.menuInventarioBasico();
                                break;
                            case 2:
                                mMenuInventario.buscarInventario();
                                this.menuInventarioBasico();
                                break;
                            case 3:
                                this.menuInventarioBasico();
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
