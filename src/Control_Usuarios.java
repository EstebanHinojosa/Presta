package Model;

import java.util.*;

/**
 * 
 */
public class Control_Usuarios {

  ArrayList <Estudiante> estudiantes=new ArrayList();
  ArrayList <Maestro> maestros=new ArrayList();
  Control_Materiales ctrl_mats=new Control_Materiales();
    
    public Control_Usuarios() {
    Estudiante est1=new Estudiante("hernesto@uabc.edu.mx","portavasos",1122334,"Hernesto",4,"Computacion");
    Estudiante est2=new Estudiante("salvador@uabc.edu.mx","disco",1122334,"Salvador",7,"Computacion");
    Estudiante est3=new Estudiante("paola@uabc.edu.mx","comic",1122334,"Paola",8,"Computacion");
    Maestro mae1=new Maestro("Hugo@uabc.edu.mx","salsa",43251,"Hernesto","Coordinador");
    Maestro mae2=new Maestro("Bernardo@uabc.edu.mx","openhaimer",91827,"Bernardo","Encargado Academico");
    
    estudiantes.add(est1);
    estudiantes.add(est2);
    estudiantes.add(est3);
    maestros.add(mae1);
    maestros.add(mae2);
    }

    public int User_login(String correo,String contraseña) {
        for (int i = 0; i <= estudiantes.size(); i++) {
            if (estudiantes.get(i).getCorreo().equals(correo)&&estudiantes.get(i).getContraseña().equals(contraseña)) {
                System.out.println("Bienvenido estudiante");
                return 1;
            }else if (maestros.get(i).getCorreo().equals(correo)&&maestros.get(i).getContraseña().equals(contraseña)) {
                System.out.println("Bienvenido maestro");
                return 2;
            }
        }
        System.out.println("Correo o contraseña incorrecto");
        return 0;
    }


    /**
     * 
     */
    public void Añadir_mats(String nombre,int cantidad,String correo) {
         for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCorreo().equals(correo)) {             
                if (ctrl_mats.Prestar(nombre, cantidad)) {
                    estudiantes.get(i).setMaterial_prestado(nombre,cantidad);
                    System.out.println(estudiantes.get(i).toString());
                }
              
            }
        }
    }

    /**
     * 
     */
    public void Devolver_mats(String correo) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCorreo().equals(correo)) {
              ArrayList<Material> temp=estudiantes.get(i).getMaterial_prestado();
                for (int j = 0; j < temp.size(); j++) {
                    ctrl_mats.Devolver(temp.get(j).getNombre(), temp.get(j).getCantidad());
                }
                estudiantes.get(i).devolver_Material();
                estudiantes.get(i).toString();
            }
        }
    }

}