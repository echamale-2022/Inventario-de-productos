package org.edwarchamale.vista;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class MenuInicio {
    Scanner sc = new Scanner(System.in);
    public void menuInicio(){
        MetodosMenuUsuario rMenuUsuario = new MetodosMenuUsuario();
        System.out.println("***************");
        System.out.println("* Menu Inicio *");
        System.out.println("***************");
        System.out.println("1.  Crear cuenta");
        System.out.println("2.  Iniciar sesion");
        System.out.println("3.  Reporte cuentas");
        System.out.println("4.  Salir del sistema");
        System.out.println("Elija la opcion que desea");
        int opc = sc.nextInt();
            switch(opc){
                case 1:
                    rMenuUsuario.agregarUsuario();
                    this.menuInicio();
                    break;
                case 2:
                    rMenuUsuario.iniciarSesion();
                    break;
                case 3:
                    rMenuUsuario.reporteUsuarios();
                    this.menuInicio();
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no validad");
            }
    }
}
