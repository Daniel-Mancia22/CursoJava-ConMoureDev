package variables;

// @author Daniel Mancis

public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variables
        
        String name = "Daniel";
        System.out.println(name);
        
        name = "Daniel Mancia";
        System.out.println(name);
        
        //name = 22; (No se puede cambiar el tipo de dato)
        
        int age = 22;
        System.out.println(age);
        
        
        //Crear una constante (Se escriben en mayusculas)
        
        final String EMAIL = "daniel@gmail.com";
        //EMAIL = "dani@gmail.com"; Es una constante
        System.out.println(EMAIL);
        
        
        //Inferencia de tipos
        var email = "daniel@gmail.com";
        System.out.println(email);
    }
}