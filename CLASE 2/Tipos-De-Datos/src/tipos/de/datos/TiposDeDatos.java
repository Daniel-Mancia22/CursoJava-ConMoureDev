package tipos.de.datos;

// @author Daniel Mancia

public class TiposDeDatos {

    //int myInt2;
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Tipos de datos primitivos
        
        int myInt = 22;
        System.out.println(myInt);
        
        double myDouble = 1.72;
        System.out.println(myDouble);
        
        char myChar = 'a'; 
        System.out.println(myChar);
        
        //float parecido al double. existe tambien el long, byte
        
        boolean myBoolean = true;
        myBoolean = false; 
        
        System.out.println(myBoolean);
        
        //String es una clase
        String myString = "Hola Mundo";
        System.out.println(myString);
        
        //Tipo de dato en tiempo de compilacion
        System.out.println(myString.getClass().getSimpleName());
    }  
}