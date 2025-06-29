package functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static void main (String [] arg){
        
        //Funciones
        for(int i = 0; i<3; i++ ){
            sendEmail();
        }
        
        sendEmail();
        sendEmailToUser("Daniel@gmail.com");
        sendEmailToUser("Daniel@gmail.com", "Mancia");
        var users = new ArrayList<>(Arrays.asList("Daniel@gmail.com", "Marlon@gmail.com", "Juan@gmail.com"));
        sendEmailToUser(users);
        
        //se envia bien
        var state = sendEmailWithState("dman@gmail.com");
        System.out.println(state);
        
        //devuelve falso ya que no le mandamos el imail
        System.out.println(sendEmailWithState(""));
    }
    
    //Funcion sin parametros ni retornos
    public static void sendEmail(){
        System.out.println("Hola Daniel");
    }
    
    //Funcion con parametros
    public static void sendEmailToUser(String email){
        System.out.println("Se envia el email: " + email);
    }
    
    //Sobrecarga de funciones
    public static void sendEmailToUser(String email, String name){
        System.out.println("Se envia el email: " + name + "(" + email + ")");
    }
    
    public static void sendEmailToUser(ArrayList<String> emails){
        for(String email: emails){
            System.out.println("Se envia el email: " + email);
        }
    }
    
    //Funcion con retorno
    public static boolean sendEmailWithState(){
        System.out.println("Hola Daniel");
        
        return true;
    }
    
    // con parametros
    public static boolean sendEmailWithState(String email){
        if(email.isEmpty()){
            return false;
        }
        System.out.println("Hola Daniel ->" + email);
        
        return true;
    }
}