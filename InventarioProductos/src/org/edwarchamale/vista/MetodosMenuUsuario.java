package org.edwarchamale.vista;
import org.edwarchamale.controlador.ControladorUsuario;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class MetodosMenuUsuario {
    ControladorUsuario cUsuario = new ControladorUsuario();
    Scanner sc = new Scanner(System.in);
    int contador;
    
    public void iniciarSesion(){
        System.out.println("******************");
        System.out.println("* Iniciar sesion *");
        System.out.println("******************");
        System.out.println("Ingrese su correo");
        String correo = sc.next();
        System.out.println("Ingrese su contraseña");
        String contraseña = sc.next();
        cUsuario.verificarCredenciales(correo, contraseña);
    }
    public void agregarUsuario(){
        System.out.println("*******************");
        System.out.println("* Agregar usuario *");
        System.out.println("*******************");
        System.out.println("Ingrese el correo");
        String correo = sc.next();
        System.out.println("Ingrese una contraseña");
        String contraseña = sc.next();
        System.out.println("Ingrese el rol que empleara");
        System.out.println("a     Administrador  ---  b     basico");
        char rol = sc.next().charAt(0);
            for(int i = 0; i < correo.length(); i++){
                if(correo.charAt(i) == '@'){
                    cUsuario.agregarUsuario(correo, contraseña, rol);
                } else{
                    contador ++;
                }
                    if(contador == correo.length()){
                        System.out.println("No se encuentra el '@'");
                        break;
                    }
            }
    }
    public void reporteUsuarios(){
        cUsuario.reporteUsuarios();
    }
    public void buscarUsuario(){
        String opcion;
        do{
        System.out.println("******************");
        System.out.println("* Buscar usuario *");
        System.out.println("******************");
        System.out.println("Ingrese el usuario a buscar");
        String usuario = sc.next();
        cUsuario.reporteIndividual(usuario);
        System.out.println("Desea buscar otro (si/no)");
        opcion = sc.next();
        }while(opcion.toLowerCase().equals("si"));
    }
    public void actualizarUsuarios(){
        System.out.println("**********************");
        System.out.println("* Actualizar usuario *");
        System.out.println("**********************");
        System.out.println("Ingrese el usuario a actualizar");
        String usuario = sc.next();
        cUsuario.actualizarUsuario(usuario);
    }
    public void eliminarUsuario(){
        System.out.println("********************");
        System.out.println("* Eliminar usuario *");
        System.out.println("********************");
        System.out.println("Ingrese el usuario a eliminar");
        String usuario = sc.next();
        cUsuario.eliminarUsuario(usuario);
    }
    
}
