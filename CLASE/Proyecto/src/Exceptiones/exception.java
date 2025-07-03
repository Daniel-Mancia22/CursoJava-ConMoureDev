package Exceptiones;

import java.util.logging.Level;
import java.util.logging.Logger;

public class exception {
    public static void main(String[] args) {
        
        //Manejo de excepciones
        
        //try catch
        try{
            var result = 10 /0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Fin");
       
        //try con multiples catch
        try{
            var result = 10 /5;
            System.out.println(result);
            
            var name = "Daniel";
            name = null;
            System.out.println("Name: " + name.toUpperCase());
        }catch(ArithmeticException e){
            System.out.println("Cuidado con imprimir algo que no puedes: " + e.getMessage());
        }catch(NullPointerException e){
            System.out.println("Ha ocurrido un null pointer mítico: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Se ha producido un error no esperado");
        }
       
        //Bloque Finally
        try{
            var result = 10 /0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
           System.out.println("Fin del bloque try catch");
        }
       
        //lanzar una exception manualmente con Throw
       
        var throwexaple = new ThrowExample();
        try {
            throwexaple.checkAge(17);
        }catch(IllegalArgumentException e){
           System.out.println("error revisando edad: "+ e.getMessage());
        }
       
        //Exception personalizada
        try {
            throwexaple.checkScore(20);
        } catch (CustomExeption e) {
            System.out.println("Error revisando la puntuacion: " + e.getMessage());
        }
        
       System.out.println("Fin");
    }
}