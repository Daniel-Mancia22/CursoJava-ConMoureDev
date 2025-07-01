package oop;

public class Polymorphism {
    public static void main (String[] arg){
        
        //Polimorfirmo  por herencia(sobre escritura)
        var animal = new Animal();
        animal.sound();
        
        var dog = new Dog();
        dog.sound();
        
        //Polimmorfismo por sobrecarga(sobre carga de metodos)
        
        var calculator = new Calculator();
        System.out.println("La suma con int: " + calculator.sum(1, 4));
        System.out.println("La suma con 3 int: " + calculator.sum(1, 4, 5));
        System.out.println("La suma con Double: " + calculator.sum(2.4, 2.1));
    }
    
    //Polimorfirmo  por herencia(sobre escritura)
    public static class Animal{
        public void sound(){
            System.out.println("Algun sonido");
        }
    }
     
    public static class Dog extends Animal{
        
        @Override
        public void sound(){
            System.out.println("Guau Guau");
        }
    }
    
    //Polimmorfismo por sobrecarga(sobre carga de metodos)
    public static class Calculator {
        
        public int sum(int a, int b){
            return a + b;
        }
        
        public int sum(int a, int b, int c){
            return a + b + c;
        }
        
        public double sum(double a, double b){
            return a + b;
        }
    }
}