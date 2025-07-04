package Exceptiones;

public class ExceptionsExecirses {
    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        double n1 = 5; 
        double n2 = 0;
        
        try{
            double rs = n1 / n2;
            System.out.println("El resultado es: " + rs);
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        String[] name = {"Daniel", "Mancia", "Perez"};
        
        try{
            System.out.println("El resultado es: " + name[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
        String surname = null;
        try{
            System.out.println("Su logitud es: " +  surname.length());
        }catch(NullPointerException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
        transforma("123");       
        transforma("45.67");     
        transforma("hola");      
        transforma("   8   ");   
        transforma("");          
        transforma(null);        

        
        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
        try {
            int resultado = 10 / 2;
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error detectado");
        } finally {
            System.out.println("Este bloque siempre se ejecuta");
        }

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
        verificarNumero(6);
        
        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
        try {
            TemperatureChecker.verificarTemperatura(60);
        } catch (TemperaturaInvalidaException e) {
            System.out.println("Temperatura inválida: " + e.getMessage());
        }

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
        try {
            int x = 10 / 0;
            int[] arr = new int[2];
            System.out.println(arr[5]);
        }catch (ArithmeticException e) {
            System.out.println("Error aritméticoO: " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de rango: " + e.getMessage());
        }
        
        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
        checkPassword("hola");
        
        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
        try {
            LoginSystem.login("hoal", "jajaj");
        } catch (LoginFailedException e) {
            System.out.println("Inicio fallido: " + e.getMessage());
        }
        
        try {
            LoginSystem.login("admin", "1234");
        } catch (LoginFailedException e) {
            System.out.println("Inicio fallido: " + e.getMessage());
        }
    }
    
    public static void transforma(String palabra){
        if (palabra == null || palabra.isBlank()) {
            System.out.println("Entrada vacía o nula. Por favor ingresa algo válido.");
            return;
        }

        try {
            int numero = Integer.parseInt(palabra.trim());
            System.out.println("Conversión exitosa. Número entero: " + numero);
        } catch (NumberFormatException e1) {
            try {
                double decimal = Double.parseDouble(palabra.trim());
                System.out.println("Número decimal detectado: " + decimal);
            } catch (NumberFormatException e2) {
                System.out.println("Error: '" + palabra + "' no es un número válido.");
            }
        }
    }

    //Ejercicio 6
    public static void verificarNumero(int num){
        if(num < 0){
            throw new IllegalArgumentException("No se permiten números negativos: " + num);
        }
    }

    //Ejercicio 7
    public static class TemperaturaInvalidaException extends Exception {
        public TemperaturaInvalidaException(String mensaje) {
            super(mensaje);
        }
    }

    public static class TemperatureChecker {
        public static void verificarTemperatura(int temp) throws TemperaturaInvalidaException {
            if (temp < -50 || temp > 50) {
                throw new TemperaturaInvalidaException("Temperatura fuera de rango: " + temp);
            } else {
                System.out.println("Temperatura aceptable 🌡️");
            }
        }
    }
    //Ejercicio 9
    public static void checkPassword(String pass) {
        if(pass.length() < 6){
            throw new IllegalArgumentException("Contraseña demasiado corta 🚫");
        }
    }
    
    //Ejercicio 10
    public static class LoginFailedException extends Exception {
        public LoginFailedException(String mensaje){
            super(mensaje);
        }
    }

    public static class LoginSystem {
        public static void login(String usuario, String contraseña) throws LoginFailedException {
            if (!usuario.equals("admin") || !contraseña.equals("1234")) {
                throw new LoginFailedException("Usuario o contraseña incorrectos");
            } else {
                System.out.println("Inicio de sesión exitoso");
            }
        }
    }
}