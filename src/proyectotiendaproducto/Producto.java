/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotiendaproducto;

/**
 *
 * @author SENA
 */
public class Producto {
    
    private String codigo;
    private String nombre;
    private String categoria;
    private String precio;

    public Producto(String codigo, String nombre, String categoria, String precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    /*
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }*/

    public String getNombre() {
        return nombre;
    }

    /*
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    public String getCategoria() {
        return categoria;
    }

    /*
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }*/

    public String getPrecio() {
        return precio;
    }

    /*
    public void setPrecio(String precio) {
        this.precio = precio;
    }*/
    
}
