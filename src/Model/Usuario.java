package Model;

import java.util.*;

/**
 * 
 */
public class Usuario {

    String correo;
    String contraseña;;
    long matricula;;
    String nombre;
    ArrayList<Material> material_prestado=new ArrayList();
    
    public Usuario(String correo,String contraseña,long matricula,String nombre) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.matricula = matricula;
        this.nombre = nombre;
    }
      
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaterial_prestado(String nombre,int cantidad) {
        Material prestamo=new Material();

        prestamo.setNombre(nombre);
        prestamo.setCantidad(cantidad);
        material_prestado.add(prestamo);
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Material> getMaterial_prestado() {
        return material_prestado;
    }
    
    public void devolver_Material(){
        material_prestado.clear();
    }
    

    

}