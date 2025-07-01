package oop;

public class Composition {
    public static void main (String[] arg){
        
        //Composicion(Tiene un)
        var car = new Car();
        car.on();
    }
    
    public static class Engine{
        
        public void on(){
            System.out.println("Motor Enecendido");
        }
    }
    
    public static class Car{
        
        final private Engine ingeni = new Engine();
        
        public void on(){
           ingeni.on();
        }
    }
}