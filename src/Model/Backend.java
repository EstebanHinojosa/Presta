package Model;

import java.util.*;


public class Backend {

    Control_Usuarios ctrl_user=new Control_Usuarios();
    int tipo_user=0;
    public Backend() {
    }

    /**
     * @return
     */
    public boolean Autenticacion() {
        // TODO implement here
        return false;
    }

    /**
     * 
     */
    public void Pedir_Prestamo(String nombre_mat,int cantidad,String correo) {
        ctrl_user.Añadir_mats(nombre_mat, tipo_user, correo);
    }

    /**
     * 
     */
    public void Realizar_Devolucion(String nombre_mat,String correo) {
        ctrl_user.Devolver_mats(correo);
    }

    /**
     * @return
     */
    public boolean Login(String usuario,String contraseña) {
        if (ctrl_user.User_login(usuario, contraseña)!=0) {
            tipo_user=ctrl_user.User_login(usuario, contraseña);
            return true;
        }
        
        return false;
    }

}