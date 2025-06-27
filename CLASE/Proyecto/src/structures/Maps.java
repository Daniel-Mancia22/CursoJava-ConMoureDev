package structures;

import java.util.HashMap;

public class Maps {
    public static void main (String[] arg){
        
        //Declarar Mapas y creacion
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();
        
        //Tamaño  
        System.out.println(names.size());
        
        //Añadir elementos
        names.put("Daniel", "daniel@gmail.com");
        names.put("Daniel Man", "danielman@gmail.com"); 
        names.put("Daniel Mancia", "danielmancia@gmail.com");
        
        System.out.println(names);
        
        //Aceder a los elementos (Por que tenemos clave)
        System.out.println(names.get("Daniel Man"));
        System.out.println(names.get("Dev")); //retorna null por que no existes la clave a laque se pide acceder
        
        //Verificar elemento o si existe
        
        //clave
        System.out.println(names.containsKey("Daniel Man"));
        System.out.println(names.containsKey("Dev"));
        
        //valor
        System.out.println(names.containsValue("danielman@gmail.com"));
        
        //Eliminar elementos
        System.out.println(names.remove("Daniel"));
        System.out.println(names.remove("Daniel Man"));
        
        System.out.println(names);
        
        //Limpiar HastMap
        names.clear();
        System.out.println(names);
        
        //Modificacion de elementos
        names.put("Daniel Mancia", "danielmancia@gmail.com");
        System.out.println(names);
        
        names.put("Daniel Mancia", "dani@gmail.com");
        System.out.println(names);
        
        names.replace("Daniel", "daniel@gmail.com"); //Reemplaza el valor si existe
        System.out.println(names);
        
        names.putIfAbsent("Daniel", "daniel@gmail.com"); //Solo lo add solo si no existe
        System.out.println(names);
        
        //Otras operaciones
        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);
    }
}