package Exceptiones;

public class ThrowExample {
    
    public void checkAge(int age) throws IllegalArgumentException{
        if (age < 18){
            throw new IllegalArgumentException("Tienes que ser mayor de edad");
        }else{
            System.out.println("Es mayor de edad");
        }
    }
    
    public void checkScore(int score) throws CustomExeption{
        if (score < 0 || score > 100){
            throw new CustomExeption("La puntuacion debe estar entre 0 y 100");
        }else{
            System.out.println("Punntuacion valida_ " + score);
        }
    }
}