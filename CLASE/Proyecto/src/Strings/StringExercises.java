package Strings;

public class StringExercises {
     public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String name1 = "Daniel";
        String name2 = "Mancia";

        //Forma 1
        System.out.println(name1 +" "+ name2);

        //Forma 2
        System.out.println(name1.concat(name2));

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(name1.length());
        System.out.println(name2.length());

        // 3. Muestra el primer y último carácter de un string.
        //Forma 1
        System.out.println(name1.subSequence(0,1));
        System.out.println(name1.subSequence(5, 6));
        
        //Forma 2
        System.out.println(name1.charAt(0));
        System.out.println(name1.charAt(name1.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        
        //Forma 1
        System.out.println(name1.contentEquals("Daniel"));
        
        //Forma 2
        System.out.println(name1.contains("Daniel"));

        // 6. Formatea un string con un entero.
        int age = 22;
        
        System.out.println(String.format("Tengo %d años", age));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String paragraph = " Hola, Soy Daniel Mancia ";
        
        System.out.println(paragraph);
        System.out.println(paragraph.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(paragraph.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        String surname1 = "Mancia";
        String surname2 = "Mancia";
        
        //Forma 1
        System.out.println(surname1.equals(surname2));
        
        //Forma 2
        System.out.println(surname1.toUpperCase().equals(surname2.toUpperCase()));

        // 10. Comprueba si dos strings tienen la misma longitud.
        
        //Comprobacion con names
        System.out.println(name1.length() == name2.length());
        
        //Comprobacion con Surnames
        System.out.println(surname1.length() == surname2.length());
        
        //Comprobacion extra que dara false
        String son1 = "Lucas Hernandez";
        String son2 = "Johana Hernandez";
  
        System.out.println(son1.length() == son2.length());
    }
}
