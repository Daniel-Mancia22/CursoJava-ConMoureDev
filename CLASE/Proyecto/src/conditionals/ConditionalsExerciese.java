package conditionals;

import java.util.Scanner;

public class ConditionalsExerciese {
    
    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var age = 14;

        if(age > 18){
            System.out.println("El usuario Si puede VOTAR, es mayor de edad");
        } else if (age == 18){
            System.out.println("El usuario Si puede VOTAR, acaba de cumplir los 18 años");
        }else {
            System.out.println("El usuario No puede VOTAR, es menor de edad");
        } 

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        double number1 = 27.4, number2 = 23.4;
        
        if(number1 > number2){
            System.out.println("El mayor es: " + number1);
        } else if(number1 < number2){
            System.out.println("El mayor es: " + number2);
        } else{
            System.out.println("Los numeros son iguales: numero1: "+ number1 + " " + "numero2: " + number2);
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        double number3 = 77;
        
        if(number3 >= 1){
            System.out.println("Es un numero POSITIVO");
        } else if(number3 <= -1){
            System.out.println("Es un numero NEGATIVO");
          } else {
                System.out.println("El numero es CERO");
            } 

        // 4. Crea un programa que diga si un número es par o impar.
        if (number3 % 2 == 0){
            System.out.println("El numero es Par y es: " + number3);
        }else if (number3 % 2 == 1){
            System.out.println("El numero es Impar y es: " + number3);
        } else{
            System.out.println("Error opcion no valida");
        }
        
        // 5. Verifica si un número está en el rango de 1 a 100.
        if (number3 <= 100 && number3 >=1){
            System.out.println("El numero esta dentro del Rango de 1 a 100 y es: " + number3);
        } else {
            System.out.println("El numero esta Fuera del rango de 1 a 100.");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var day = 5;
        
        switch(day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2: 
                System.out.println("Martes");
                break;
            
            case 3:
                System.out.println("Miercoles");
                break;
                
            case 4: 
                System.out.println("Jueves");
                break;
                
            case 5:
                System.out.println("Viernes");
                break;
                
            case 6: 
                System.out.println("Sabado");
                break;
                
            case 7:
                System.out.println("Domingo");
                break;
                
            default:
                System.out.println("Opcion incorrecta, la semana tiene 7 dias nada mas");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        double note = 70.9;

        if (note >= 80 && note <= 100) {
            System.out.println("Sobresaliente");
        } else if (note >= 60 && note < 80) {
            System.out.println("Aprobado");
          } else if (note >= 0 && note < 60) {
            System.out.println("Suspendio");
            } else {
                System.out.println("Opción no definida");
              }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        var age2 = 14;
        
        if(age2 >= 15){
            System.out.println("SI puede entrar al Cine, Tiene 15 años");
        } else if (age2 < 15){
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Va acompañado por un adulto. SI[1]  NO[2] : ");
            int respuesta = scanner.nextInt();
        
            boolean companion = (respuesta == 1);
            
            if (companion) {
            System.out.println("Está acompañado por un adulto, SI puede entrar.");
            } else {
                System.out.println("No puede entrar");
                System.out.println("No tiene 15 años y no está acompañado por un adulto.");
            }
            scanner.close();
        } else{
            System.out.println("Se ha producido un error");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        String letter = "D";
        
        switch(letter){
            case "A", "a":
                System.out.println("Es vocal y es la: " + letter);
                break;
            
            case "E", "e":
                System.out.println("Es vocal y es la: " + letter);
                break;
                
            case "I", "i":
                System.out.println("Es vocal y es la: " + letter);
                break;
                
            case "O", "o":
                System.out.println("Es vocal y es la: " + letter);
                break;
                
            case "U", "u":
                System.out.println("Es vocal y es la: " + letter);
                break;
                
            default:
                System.out.println("Es una consonate y es la: " + letter);
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        double a = 1.2, b = 1.2, c = 2.2;
        
        if (a > b && a>c){
            System.out.println("El mayor es A y es: " + a);
        } else if(b>a && b>c){
            System.out.println("El mayor es B y es: " + b);
        } else if(c>a && c>b){
            System.out.println("El mayor es C y es: " + c);
        } else if(a == b && b == c){
            System.out.println("Los 3 son el mismo valor y son: " + "A:" + a +"  "+ "B:" + b +"  "+ "C:" + c);
            System.out.println("Por lo tanto no existes un Mayor");
        } else if(a==b && a>c && b>c){
            System.out.println("De los 3 numeros hay dos iguales que son los mayores y son: " + "A:" + a +"  "+ "B:"+b);
        } else if(a==c && a>b && c>b){
            System.out.println("De los 3 numeros hay dos iguales que son los mayores y son: " + "A:" + a +"  "+ "C:"+c);
        }else if(b==c && b>a && c>a){
            System.out.println("De los 3 numeros hay dos iguales que son los mayores y son: " + "B:" + b +"  "+ "C:"+c);
        }
    }
}