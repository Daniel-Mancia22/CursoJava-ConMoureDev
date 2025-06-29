package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StruturesExercises {
    public static void main (String[] arg){
        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] names = {"Daniel", "Marlon", "Juan", "Lucas", "Alejandra"};
        System.out.println(names.length);
        System.out.println("*********************************************************");

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(names[2]);
        names [2] = "Martin";
        System.out.println(names[2]);
        System.out.println("*********************************************************");

        // 3. Crea un ArrayList vacío.
        ArrayList<String> persons = new ArrayList <>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        persons.add("Marta");
        persons.add("Luis");
        persons.add("Juana");
        persons.add("Fernando");
        System.out.println(persons);
        
        persons.remove(2); //Eliminamos a juana
        System.out.println(persons);
        System.out.println("*********************************************************");

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> hases = new HashSet<>();
        
        hases.add("Hola");
        hases.add("Saludos");
        System.out.println(hases);
        System.out.println("*********************************************************");

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        hases.add("Hola");
        hases.add("Nos vemos");
        System.out.println(hases);
        System.out.println("*********************************************************");

        // 7. Elimina uno de los elementos del HashSet.
        hases.remove("Hola");
        System.out.println(hases);
        System.out.println("*********************************************************");

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, Integer> dates = new HashMap<>();
        
        dates.put("Damaris", 78452334);
        dates.put("Manuel", 67458334);
        dates.put("Antonio", 65234413);
        System.out.println(dates);
        System.out.println("*********************************************************");

        // 9. Modifica uno de los contactos y elimina otro.
        dates.replace("Antonio", 67670990);
        dates.remove("Damaris");
        System.out.println(dates);
        System.out.println("*********************************************************");

        //10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] surnames = {"Daniel", "Marlon", "Juan", "Lucas", "Alejandra"};
        
        ArrayList<String> nuevo = new ArrayList<>();
        
        nuevo.add(surnames[0]);
        nuevo.add(surnames[1]);
        nuevo.add(surnames[2]);
        nuevo.add(surnames[3]);
        nuevo.add(surnames[4]);
        
        System.out.println("ArrayList: " + nuevo);
        
        HashSet<String> converts = new HashSet<>();
        
        converts.add(nuevo.get(0));
        converts.add(nuevo.get(1));
        converts.add(nuevo.get(2));
        converts.add(nuevo.get(3));
        converts.add(nuevo.get(4));
        System.out.println("el hastSet: " + converts);
        
        HashMap<String, String> FinalsHashMap = new HashMap<>();

        for (String elemento : converts) {
            FinalsHashMap.put(elemento, elemento);
        }
        
        System.out.println("Final HashMap: " + FinalsHashMap);
    }
}