
package com.model;

public class Producto {
   //atributos
    private int IdProducto;
    private String NombreProducto; 
    private String Descripcion;
    private int Idlinea;
    private int IdProveedor;
    private int IdCategoria;
    private double Preciocompra;
    private double Precioventa;
    private int Stock;
    


    public Producto() {
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getIdlinea() {
        return Idlinea;
    }

    public void setIdlinea(int Idlinea) {
        this.Idlinea = Idlinea;
    }

    public int getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public double getPreciocompra() {
        return Preciocompra;
    }

    public void setPreciocompra(double Preciocompra) {
        this.Preciocompra = Preciocompra;
    }

    public double getPrecioventa() {
        return Precioventa;
    }

    public void setPrecioventa(double Precioventa) {
        this.Precioventa = Precioventa;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

   

}
