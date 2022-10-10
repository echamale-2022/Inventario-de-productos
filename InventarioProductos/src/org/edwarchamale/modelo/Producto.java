package org.edwarchamale.modelo;
/**
 *
 * @author Edwar
 */
public class Producto {
    String producto;
    String marca;
    String descripcion;
    int idProducto;

    public Producto() {
    }

    public Producto(String producto, String descripcion, String marca, int idProducto) {
        this.producto = producto;
        this.marca = marca;
        this.descripcion = descripcion;
        this.idProducto = idProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
}
