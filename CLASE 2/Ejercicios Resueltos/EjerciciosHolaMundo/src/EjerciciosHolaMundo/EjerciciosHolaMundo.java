package EjerciciosHolaMundo;

// @author Daniel Mancia

import java.util.Scanner;

public class EjerciciosHolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Daniel Mancia");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        
        /* 
           package EjerciciosHolaMundo: Aca se define el paquete donde lleva su nombre que se le asigno.
           @author Daniel Mancia: Esto es un comentario de quien realizo el proyecto.
           public class EjerciciosHolaMundo {}: Esto define una clase sobre la cual trabajaremos.
           @param args the command line arguments: Sirve para explicar qué hace un parámetro del método o función 
                                                   donde aparece, en este caso args
           public static void main(String[] args){}: Lo que hace e metodo mean es servir como punto de entrada para 
                                                     ejecutar las insttrucciones.
        */

        // 4. Crea un comentario en varias líneas.
        
        /*Bueno en esta ocación estoy realizando un comentarios
          de varias lineas, en el cual estpy utilizando los parametros
          que me permiten realizar esta acción. Tambien podemos hacer 
          comentarios de una sola linea*/

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Mi edad es: 22\nMi color favorito: Verde\nMi ciudad: Sonsonate");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.out.print("Hola Print sin salto de linea");
        System.out.println("Hola con salto de linea");
        
        //System.err.println("¡Ocurrió un error!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String name = sc.nextLine();

        
        // 7. Utiliza varios println para imprimir una frase.
        System.out.print("Hola");
        System.out.print(" Soy");
        System.out.print(" Mancia");
        System.out.print(" Co");
        System.out.print("mo");
        System.out.print(" Es");
        System.out.print("tas");
        System.out.println("?");
        
        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println(":-)");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        System.out.println("El error que se detecta o nos da el ide en mi caso netbeans es que no se encontro el metodo principal en la \n" +
        "clase EjerciciosHolaMundo.EjerciciosHolaMundo. y que por favor cree o defina el metodo principal como:\n" +
        "\n" + "public static void main(String[] args) O una clase de aplicacion JavaFX debe extender \n" + 
        "javafx.application.Application");

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa
        
        //error: class EjerciciosHolaMundo is public, should be declared in a file named HolaMundo.java
        //Lo que dice es que la clase EjerciciosHolaMundo es publica y debe de declararse con el mismo nombre
    } 
}