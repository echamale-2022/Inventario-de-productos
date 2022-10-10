package org.edwarchamale.vista;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class MenuUsuario {
    Scanner sc = new Scanner(System.in);
    public void menuUsuarioAdministrador(){
        MetodosMenuUsuario mMenuUsuario = new MetodosMenuUsuario();
        MenuAdministrador mAdmin = new MenuAdministrador();
        System.out.println("****************");
        System.out.println("* Menu usuario *");
        System.out.println("****************");
        System.out.println("1.  Agregar usuarios");
        System.out.println("2.  Reporte usuarios");
        System.out.println("3.  Actualizar usuarios");
        System.out.println("4.  Eliminar usuarios");
        System.out.println("5.  Regresar al menu administrador");
        System.out.println("Elija la opcion que desea");
        int opc = sc.nextInt();
            switch(opc){
                case 1:
                    mMenuUsuario.agregarUsuario();
                    this.menuUsuarioAdministrador();
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
                                mMenuUsuario.reporteUsuarios();
                                this.menuUsuarioAdministrador();
                                break;
                            case 2:
                                mMenuUsuario.buscarUsuario();
                                this.menuUsuarioAdministrador();
                                break;
                            case 3:
                                this.menuUsuarioAdministrador();
                                break;
                            default:
                                System.out.println("Opcion no validad");
                        }// switch #2
                    break;
                case 3:
                    mMenuUsuario.actualizarUsuarios();
                    this.menuUsuarioAdministrador();
                    break;
                case 4:
                    mMenuUsuario.eliminarUsuario();
                    this.menuUsuarioAdministrador();
                    break;
                case 5:
                    mAdmin.menuAdministrador();
                    break;
                default:
                    System.out.println("Opcion no validad");
            }// switch #1
    }
    public void menuUsuarioBasico(){
        MetodosMenuUsuario mMenuUsuario = new MetodosMenuUsuario();
        MenuBasico mBasico = new MenuBasico();
        System.out.println("****************");
        System.out.println("* Menu usuario *");
        System.out.println("****************");
        System.out.println("1.  Agregar usuario");
        System.out.println("2.  Reporte usuario");
        System.out.println("3.  Regresar al menu basico");
        System.out.println("Elija la opcion que desea");
        int opc = sc.nextInt();
            switch(opc){
                case 1:
                    mMenuUsuario.agregarUsuario();
                    this.menuUsuarioBasico();
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
                                mMenuUsuario.reporteUsuarios();
                                this.menuUsuarioBasico();
                                break;
                            case 2:
                                mMenuUsuario.buscarUsuario();
                                this.menuUsuarioBasico();
                                break;
                            case 3:
                                this.menuUsuarioBasico();
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
