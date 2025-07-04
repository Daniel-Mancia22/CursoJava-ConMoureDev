package extras;

import static extras.ExtrasExecirses.Comentada.saludo;
import java.util.Scanner;
import java.util.Random;

public class ExtrasExecirses {
    String message = "Hola DevMad";
    static String username = "Mancia Dev";
    
    static String numbers = "Uno, Dos, Tres";
    
    public static void main(String[] args) {
        // 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.
        String name = null;
        if (name != null && !name.isEmpty()){
            System.out.println("La variable esta vacia");
        }else{
            System.out.println("La variable tiene contenido");
        }
        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
        var sc = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nameInput = sc.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int age = sc.nextInt();
        
        System.out.println(name);
        System.out.println(age);
        
        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
        final int MAX_SCORE = 100;
        System.out.println(MAX_SCORE);
        
        // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.
        String message = "Hello";
        System.out.println(message); //variable local
        System.out.println(new ExtrasExecirses().message); //variable global

        
        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
        System.out.print("Ingrese un numero: ");
        int number = sc.nextInt();
        
        if (number > 0) {
            System.out.println("El número es positivo");
        } else if (number < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
        
        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
        System.out.println(numbers);
        
        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
        Random rand = new Random();
        int randomNum = rand.nextInt(10) + 1;
        System.out.println("Número aleatorio: " + randomNum);

        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.
        System.out.println(saludo);
        
        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
        var user = new User();
        user.names();
        
        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.
    }
    
    public static class User{
        final String APP_NAME = "Danel Dev";
        
        public void names(){
            System.out.println(APP_NAME);
            System.out.println(ExtrasExecirses.username);
        }
    }
    
    public static class Comentada {
        static String saludo = "¡Hola desde Comentada!";
    }
}