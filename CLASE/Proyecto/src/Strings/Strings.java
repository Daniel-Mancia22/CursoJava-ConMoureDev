package Strings;

public class Strings {

    public static void main(String[] args) {
        // Cadenas de texto
        
        //Declaraciones
        String name = "Daniel";
        String surname = "Mancia";
        
        //Operaciones con string
        
        //Concatenacion
        System.out.println(name + " " + surname);
        
        //Encontrar logitud
        System.out.println(name.length());
        
        //Encontrar caracter
        System.out.println(name.charAt(0));
        
        //Obtener sub cadena
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 4));
        
        //Mayusculas y Minusculas
        System.out.println(name.toUpperCase()); //Mayusculas
        System.out.println(name.toLowerCase()); //Minusculas
        
        //Comprobar si contiene algo
        System.out.println("Hola, Java".contains("daniel")); //false
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));
        
        //Hacer una comparacion
        System.out.println(name.equals("daniel"));
        System.out.println(name.equals("Daniel"));
        System.out.println(name.equalsIgnoreCase("daniel"));
        
        // == VS equals
        var a = "Mancia";
        var b = "Mancia";
        var c = new String("Mancia");
        
        System.out.println(a == b); //Es lo mismo
        System.out.println(a == c); //Aqui es de manera diferente un new objeto
        System.out.println(a.equals(c)); //Siempre usar equals
        
        
        //Operacion trim
        System.out.println(" Hola, Me llamo daniel ");
        System.out.println(" Hola, Me llamo daniel ".trim()); //Limpia espacios en blanco
        
        //Replace
        System.out.println(" Hola, Me llamo daniel ".replace("daniel", "Mancia"));
       
        //Format
        var age = 22;
        System.out.println(String.format("Hola, %s. Tengo %d", name, age)); //%s = Texto;  %d = Enteros  %f = num decimales
    }
}