package Model;

import java.util.*;

/**
 * 
 */
public class Maestro extends Usuario {

    String puesto;
    
    public Maestro(String correo,String contraseña,long matricula,String nombre,String puesto){
        super(correo,contraseña,matricula,nombre);
        this.puesto = puesto;
        
    }

    public void setPuesto(String puesto) {
        this.puesto=puesto;
    }

    public String getPuesto() {
        return puesto;
    }

}