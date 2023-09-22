package Model;

import java.util.*;

/**
 * 
 */
public class Control_Materiales {
ArrayList<Material> materiales = new ArrayList();
    /**
     * Default constructor
     */
    public Control_Materiales() {
        Material mat1=new Material("Laptop",5);
        Material mat2=new Material("Fuente de poder",10);
        Material mat3=new Material("Protoboard",3);
        
        materiales.add(mat1);
        materiales.add(mat2);
        materiales.add(mat3);
        
    }

    public ArrayList<Material> BDMats(){
        return materiales;
    }
    public boolean Prestar(String nombre,int cantidad) {
        for (int i = 0; i < materiales.size(); i++) {
            if (materiales.get(i).getNombre()==nombre) {
                System.out.println(materiales.get(i).getNombre());
                if (cantidad<=materiales.get(i).getCantidad()) {
                    int aux=materiales.get(i).getCantidad()-cantidad;
                    materiales.get(i).setCantidad(aux);
                    System.out.println("Materiales restantes");
                    System.out.println(materiales.get(i).toString());
                    return true;
                }else
                    System.out.println("No hay suficiente para prestar");
                return false;
            }
        }
        return false;
    }

    /**
     * 
     */
    public void Devolver(String nombre,int cantidad) {
        for (int i = 0; i < materiales.size(); i++) {
            if (materiales.get(i).getNombre()==nombre) {
                int aux=materiales.get(i).getCantidad()+cantidad;
                materiales.get(i).setCantidad(aux);
            }
        }
    }

}