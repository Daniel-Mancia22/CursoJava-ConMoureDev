package ejerciciosoperadores;
// @author Daniel Mancia

public class EjerciciosOperadores {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // 1. Crea una variable con el resultado de cada operación aritmética.
        double Variable = 2.3 + 3.1;
        System.out.println(Variable);
        
        Variable = 3.4 - 1.2;
        System.out.println(Variable);
        
        Variable = 2.5 * 4.2;
        System.out.println(Variable);
        
        Variable = 6.23 / 3.6;
        System.out.println(Variable);
        
        Variable = 6.23 % 3.6;
        System.out.println(Variable);
        System.out.println("*************************************************");

        // 2. Crea una variable para cada tipo de operación de asignación.
        int a = 5, b = 6, c = 7, d = 8, e = 9, f = 10;
        
        a = b;
        System.out.println(a);
        
        b += 2;
        System.out.println(b);
        
        c -= 3;
        System.out.println(c);
        
        d *= 2;
        System.out.println(d);
        
        e /= 4;
        System.out.println(e);
        
        f %= 3;
        System.out.println(f);
        System.out.println("*************************************************");
        
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        String name1 = "Josue", name2 = "Manuel";
        double num1 = 2.34, num2 = 1.99;
        
        System.out.println(name1 != name2);
        System.out.println( num1 >= num2);
        System.out.println(num1 > num2);
        
        System.out.println("*************************************************");
        
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(name1 == name2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
        System.out.println("*************************************************");

        // 5. Utiliza el operador lógico and.
        int number1 = 4, number2 = 5, number3 = 2, number4 = 6;
        
        System.out.println(number1 > number3 && number2 < number4);
        System.out.println(number1 == number2 && number3 == number4);
        System.out.println(number1 < number4 && number2 < number3);
        System.out.println("*************************************************");

        // 6. Utiliza el operador lógico or.
        System.out.println(num1>num2 || num1 < num2);
        System.out.println("*************************************************");

        // 7. Combina ambos operadores lógicos.
        System.out.println((number1 < number2 && number3 < number4) || (number1 == number3));
        System.out.println("*************************************************");

        // 8. Añade alguna negación.
        boolean frase1 = true;
        boolean frase2 = false;
        System.out.println(frase1 && !frase2);
        System.out.println("*************************************************");
        
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        var x = 2;
        
        System.out.println(x++);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(-x);
        System.out.println("*************************************************");
        
        // 10. Combina operadores aritméticos, de comparación y lógicos.
        int age1 = 22, age2 = 27, age3 = 19, age4 = 18;
        
        System.out.println((age1 + age2 + age3 - age4 == 50) || (age1 + age2 + age4 - age3 == 50));
    }
}