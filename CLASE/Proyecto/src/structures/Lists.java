package structures;

import java.util.ArrayList;

public class Lists {
    
    public static void main (String[] arg){
        
        //Declaracion y creacion de array Lists
        
        ArrayList<String> names = new ArrayList<>(); //Forma mas clasica
        var numbers = new ArrayList<Integer>();
        
        //Tamaño
        System.out.println(names.size());
        
        //Añadir elementos
        names.add("Daniel");
        names.add("Mancia");
        names.add("Daniel Mancia");
        
        System.out.println(names.size());
        
        //Aceder a los elementos
        System.out.println(names.getFirst()); //acceder al primero
        System.out.println(names.get(1));
        System.out.println(names.getLast()); //acceder al ultimo
        
        //Actualizar o modificar elemento
        names.set(2, "Daniel Daniel");
        
        //Eliminar elementos
        names.remove(2);
        //names.get(2); //Error ya no existes
        
        //Buscar elementos
        System.out.println(names.contains("Mancia"));
        System.out.println(names.contains("Daniel Mancia"));
        
        System.out.println(names);
        
        //Limpiar o eliminar todo lo de array list
        names.clear();
        System.out.println(names.size()); 
    }  
}