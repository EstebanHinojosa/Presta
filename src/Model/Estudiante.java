package Model;

import java.util.*;

/**
 * 
 */
public class Estudiante extends Usuario {

    int semestre;
    String carrera;
    
    public Estudiante(String correo,String contraseña,long matricula,String nombre,int semestre,String carrera){
        super(correo,contraseña,matricula,nombre);
        this.semestre = semestre;
        this.carrera = carrera;
    }
    
    public int getSemestre() {
        return semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String toString(){
        return "\nCorreo: "+correo+"\nNombre: "+nombre+"\nCarrera: "+carrera+"\nSemestre:"+semestre+"\nMaterial pedido:\n"+material_prestado;
    }

}