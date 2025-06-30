package functions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class functionExecirses {
    public static void main (String [] arg){
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        Welcome();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        Greet("Daniel Mancia");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        subtraction(5, 3);

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        square(3);

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        evenOrOddNumber(13);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        IsofLegalAge(18);
        IsofLegalAge(17);

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        LengthOfAChain("Hola, soy Daniel Mancia");
        LengthOfAChain("Daniel Mancia");

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        String [] usuarios =  {"Hola", "Juan", "Luan"};
        CalculateMeasurementOfAnArray(usuarios);
        
        int[] numeros = {1, 2, 3, 4, 5};

        CalculateMeasurementOfAnArray(usuarios);
        CalculateMeasurementOfAnArray(numeros);

        // 9. Escribe un método que reciba un número y retorna su factorial.
        factorial(6);

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        ArrayList<String> users = new ArrayList<>();
        users.add("Heidi");
        users.add("Marlon");
        users.add("Juan");
        
        showArrayList(users);
    }
    
    public static void Welcome(){
        System.out.println("Te doy la bienvenida al curso de Java desde cero!");
    }
    
    public static void Greet(String nombre){
        System.out.println("Hola buenas, como estas " + nombre);
    }
    
    public static int subtraction(int num1, int  num2){
        int Resta = num1 - num2;
        System.out.println("Los numeros proporcionados son: " + "Numero1:" + num1 + " " + "Numero2:" + num2);
        System.out.println("La Resta de los numeros es: " + Resta);
        return Resta;
    }
    
    public static int square(int num1){
        int square = num1 * num1;
        System.out.println("El numero elevado al cuadrado es: " + square);
        return square;
    }
    
    public static void evenOrOddNumber(int num){
        if(num % 2 == 0){
            System.out.println("El numero es Par");
        } else{
            System.out.println("El numero es Impar");
        }
    }
    
    public static boolean IsofLegalAge(int number){
        boolean isAdult = number >= 18;
        System.out.println(isAdult);
        return isAdult;
    }
    
    public static void LengthOfAChain(String cadena){
        int longitud = cadena.length();
        System.out.println("La Longitud de la cadena es: " + longitud);
    }
    
    public static void CalculateMeasurementOfAnArray(String[] array){
        int Medida = array.length;
        System.out.println("La Medida o Longitud del Array es: " + Medida);
    }
    
    public static void CalculateMeasurementOfAnArray(Object array) {
        if (array.getClass().isArray()) {
            int medida = Array.getLength(array);
            System.out.println("La medida o longitud del array es: " + medida);
        } else {
            System.out.println("El objeto proporcionado no es un array.");
        }
    }
    
    public static void factorial(int number){
        int factorial = 1;

        for (int s = 1; s <= number; s++) {
            factorial *= s;
        }
        System.out.println("El factorial de " + number + " es: " + factorial);
    }
    
    public static void showArrayList(ArrayList<String> arraylist){
        for(String name: arraylist){
            System.out.println("Nombre: " + name);
        }
    }
}