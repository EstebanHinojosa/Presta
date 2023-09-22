package Model;

import java.util.*;

/**
 * 
 */
public class Material {

    String nombre;
    int cantidad;

    
    public Material(String nombre,int cantidad) {

        this.nombre=nombre;
        this.cantidad=cantidad;
    }
    public Material(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nCantidad: "+cantidad+"\n";
    }
}