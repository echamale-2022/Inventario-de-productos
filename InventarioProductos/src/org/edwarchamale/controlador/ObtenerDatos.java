package org.edwarchamale.controlador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Edwar
 */
public class ObtenerDatos {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public String descripcion(){
    String descripcion = null;
    try{
            descripcion = bf.readLine();
    }catch(IOException ioe){
            System.out.println("Error de IOE");
            System.exit(0);
    }
    return descripcion;
    }
    
    public String producto(){
    String producto = null;
    try{
            producto = bf.readLine();	
    }catch(IOException ioe){
            System.out.println("Error de IOE");
            System.exit(0);
    }
    return producto;
    }
    
    public String marca(){
    String marca = null;
    try{
            marca = bf.readLine();
    }catch(IOException ioe){
            System.out.println("Error de IOE");
            System.exit(0);
    }
    return marca;
    }
}
