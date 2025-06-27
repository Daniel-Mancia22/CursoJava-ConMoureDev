package structures;

import java.util.HashSet;

public class Sets {
    public static void main (String[] arg){
        
        //Declarar set y creacion
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();
        
        //Tamaño  
        System.out.println(names.size());
        
        //Añadir elementos
        names.add("Daniel");
        names.add("Mancia");
        names.add("Daniel Mancia");
        System.out.println(names.size());
        
        System.out.println(names);
        
        names.add("daniel@gamail");
        System.out.println(names);
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        //Eliminar elementos
        names.remove("Mancia");
        System.out.println(names.size());
        
        //Buscar elementos
        System.out.println(names.contains("Daniel"));
        System.out.println(names.contains("Mancia@gmail"));
        
        //No permite repetidos
        System.out.println(names);
        names.add("Daniel");
        names.add("Daniel");
        names.add("Daniel");
        System.out.println(names);
        
        //Conjuntos
        //names.addAll(numbers); incopatibilidad de datos
        
        HashSet<String> coutries = new HashSet<>();
        
        coutries.add("Mexico");
        coutries.add("España");
        coutries.add("daniel@gamail");
        
        names.addAll(coutries);
        System.out.println(names);
        
        names.removeAll(coutries);
        System.out.println(names);
        
        names.retainAll(coutries);
        System.out.println(names);
    }
}