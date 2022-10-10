package org.edwarchamale.modelo;
/**
 *
 * @author Edwar
 */
public class Inventario {
    int codProducto;
    int cantidad;
    double precio;
    double costo;
    int codInventario;

    public Inventario(){
    }
    
    public Inventario(int codProducto, int cantidad, double precio, double costo, int codInventario) {
        this.codProducto = codProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.costo = costo;
        this.codInventario = codInventario;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCodInventario() {
        return codInventario;
    }

    public void setCodInventario(int codInventario) {
        this.codInventario = codInventario;
    }
    
}
