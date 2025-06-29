package loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main (String [] arg){
        
        //Loops = Bucles
        
        // 1- For controlado por contador
        for(int i = 0; i<5; i++ ){
            System.out.println("Hola, Java!");
        }
        
        // Recorrer un Array con For
        String[] names = {"Daniel", "Marlon", "Juan", "Lucas", "Alejandra", "Marvin"};
        
        for(int i=0; i < names.length; i++){
            System.out.println(names[i]);
        }
        
        // 2- For-each: para recorrer Array, ArrayList, HashSets y HashMap
        for(String name: names){
            System.out.println(name);
        }
        
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        
        for(Integer number: numbers){
            System.out.println(number);
        }
        
        HashMap<String, String> emails = new HashMap<>();
        
        emails.put("Daniel", "daniel@gmail.com");
        emails.put("Daniel Man", "danielman@gmail.com"); 
        emails.put("Daniel Mancia", "danielmancia@gmail.com");
        
        //Pintar el par (Clave-Valor)
        for(Map.Entry<String, String> email: emails.entrySet()){
            System.out.println(email);
        }
        
        //Pintar a uno de los elementos de la clave-valor
        for(Map.Entry<String, String> email: emails.entrySet()){
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }
        
        // 3- while
        int m = 0;
        
        while(m < 5){
            System.out.println("Hola Java!");
            m++;
        }
        
        //Recorrer array
        int j = 0;
        while(j < names.length){
            System.out.println(names[j]);
            j++;
        }
        
        //Recorrer array buscando algo en especifico
        j = 0;
        boolean find = false;
        while(!find){
            System.out.println(names[j]);
            if(names[j].equals("Marlon")){
                find = true;
            }
            j++;
        }
        
        //Variante de while -> do-while
        j = 0;
        
        do{
            System.out.println("Hola java-");
            j++;
        }while(j < 5);
        
        //Control de bucles
        
        // Break
        for(String name: names){
            if(name.equals("Lucas")){
                break;
            }
            System.out.println(name);
        }
        
        // Continue
        for(int p = 0; p<5; p++ ){
            if(p == 3){
                continue;
            }
            System.out.println(p);
        }
    }
}