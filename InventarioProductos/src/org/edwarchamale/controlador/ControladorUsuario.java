package org.edwarchamale.controlador;
import org.edwarchamale.modelo.Usuario;
import org.edwarchamale.vista.MenuAdministrador;
import org.edwarchamale.vista.MenuBasico;
import org.edwarchamale.vista.MenuUsuario;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class ControladorUsuario {
    public static ArrayList<Usuario> arregloUsuario = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    
    public void agregarUsuario(String usuario, String clave, char rol){
        arregloUsuario.add(new Usuario(usuario, clave, rol));
        System.out.println("Agregado exitosamente");
    }
    public void verificarCredenciales(String usuario, String clave){
        MenuAdministrador mAdmin = new MenuAdministrador();
        MenuBasico mBasico = new MenuBasico();
        for(int i = 0; i < arregloUsuario.size(); i++){
            if(usuario.charAt(i) != '@'){
                if(usuario.equals(arregloUsuario.get(i).getUsuario()) && clave.equals(
                arregloUsuario.get(i).getClave())){
                    if(arregloUsuario.get(i).getRol() == 'a'){
                        mAdmin.menuAdministrador();
                    } else{
                        mBasico.menuBasico();
                    }
                } else{
                    contador ++;
                }
            } else{
                contador ++;
            }
                if(contador == arregloUsuario.size()){
                    System.out.println("Error de credenciales");
                    System.out.println("Gracias por usar el sistema");
                    System.exit(0);
                }
        }
    }
    public void reporteUsuarios(){
        for (Usuario u : arregloUsuario){
            System.out.println("*********************************");
            System.out.println("El usuario es: " + u.getUsuario());
            System.out.println("La clave es: " + u.getClave());
            System.out.println("a     Administrador - b     Básico");
            System.out.println("El rol que emplea es:" + u.getRol());
            System.out.println("*********************************");
        }
    }
    public void reporteIndividual(String usuario){
        for(int i = 0; i < arregloUsuario.size(); i++){
            if(usuario.equals(arregloUsuario.get(i).getUsuario())){
                System.out.println("*** Usuario encontrado ***");
                System.out.println("El usuario es: " + arregloUsuario.get(i).getUsuario());
                System.out.println("La clave es: " + arregloUsuario.get(i).getClave());
                System.out.println("a     Administrador  ---  b     Básico");
                System.out.println("El rol que emplea es:" + arregloUsuario.get(i).getRol());
                break;
            } else{
                contador ++;
            }
                if(contador == arregloUsuario.size()){
                    System.out.println("*** Usuario no encontrado ***");
                    break;
                }
        }
    }
    public void actualizarUsuario(String usuario){
        for(int i = 0; i < arregloUsuario.size(); i++){
            if(usuario.equals(arregloUsuario.get(i).getUsuario())){
                System.out.println("Que es lo que desea actualizar");
                System.out.println("clave/rol");
                String opcion = sc.next();
                    if(opcion.toLowerCase().equals("clave")){
                        System.out.println("Ingrese la nueva clave");
                        String clave = sc.next();
                        arregloUsuario.get(i).setClave(clave);
                        System.out.println("Actualizado exitosamente");
                        break;
                    } else if(opcion.toLowerCase().equals("rol")){
                        System.out.println("Ingrese el nuevo rol");
                        char rol = sc.next().charAt(0);
                        arregloUsuario.get(i).setRol(rol);
                        System.out.println("Actualizado exitosamente");
                        break;
                    } else{
                        System.out.println("No se encuentra lo que desea actualizar");
                        break;
                    }
            } else{
                contador ++;
            }
                if(contador == arregloUsuario.size()){
                    System.out.println("*** Usuario no encontrado ***");
                    break;
                }
        }
    }
    public void eliminarUsuario(String usuario){
        MenuAdministrador mAdmin = new MenuAdministrador();
        for(int i = 0; i < arregloUsuario.size(); i++){
            if(usuario.equals(arregloUsuario.get(i).getUsuario())){
                System.out.println("¿Esta seguro de eliminarlo (si/no)?");
                String opcion = sc.next();
                if(opcion.equals("si")){
                    arregloUsuario.remove(i);
                    System.out.println("Eliminado exitosamente");
                    break;
                } else{
                    System.out.println("Sera mandado al menu");
                    mAdmin.menuAdministrador();
                }
            } else{
                contador ++;
            }
                if(contador == arregloUsuario.size()){
                    System.out.println("*** Usuario no encontrado ***");
                }
        }
    }
}