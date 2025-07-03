package extras;

import java.util.Scanner;
import oop.InheritanceExercises.Person;

public class Extras {
    static String globalname = "Daniel Mancia";
    
    public static void main(String[] args) {
        
        //Extras
        
        //null
        String name = "Daniel";
        name = null;
        
        if(name != null){
            System.out.println(name.toLowerCase());
        }
        
        //Imports
        new Person();
        
        //Scanner
        var sc = new Scanner(System.in);
        
        var age = 22;
        
        System.out.print("Introduce tu edad: ");
        age = sc.nextInt();
        
        System.out.println("La edad es: " + age);
        
        //Scope: Variables gloabales y locales
        test();
        
        //static (Pertenece a la clase no a la instancia)
    }
    
    public static void test(){
        System.out.println(globalname);
    }
}