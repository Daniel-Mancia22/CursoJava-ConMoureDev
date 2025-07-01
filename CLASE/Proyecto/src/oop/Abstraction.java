package oop;

public class Abstraction {
    public static void main (String[] arg){
        
        //Abstraccion
        
        //Clase abstracta -> solo permite instanciar animales concretos definidos ya
        var dog = new Dog();
        dog.sleep();
        dog.sound();
        
        var cat = new Cat();
        cat.sleep();
        cat.sound();
        
        //Clase abstracta 2: Interfaz -> no se pueden instancear
        var bird = new Bird();
        bird.fly();
        
        var bat = new Bat();
        bat.fly();
    }
    
    //Clase abstracta
    public static abstract class Animal{
        
        public abstract void sound();
        
        public void sleep(){
            System.out.println("El animal esta durmiendo");
        }
    }
    
    public static class Dog extends Animal{
        @Override
        public void sleep(){
            System.out.println("El perro esta durmiendo");
        }
        
        @Override
        public void sound(){
            System.out.println("Guau, Guau");
        }
    }
    
    public static class Cat extends Animal{
        
        @Override
        public void sleep(){
            System.out.println("El gato esta durmiendo");
        }
        
        @Override
        public void sound(){
            System.out.println("Miau, Miau");
        }
    }
    
    
    //Clase abstracta 2: Interfaz
    public interface Flying{
        public void fly();
    }
    
    public interface Flying2{
        public void fly2();
    }
    
    public static class Bird extends Animal implements Flying, Flying2{
        
        @Override
        public void sound(){
            System.out.println("pio pio");
        }
        
        @Override
        public void fly(){
            System.out.println("El pajaro vuela");
        }

        @Override
        public void fly2() {
        }
    }
    
    public static class Bat extends Animal implements Flying, Flying2{
        
        @Override
        public void sound(){
            System.out.println("soy batman");
        }
        
        @Override
        public void fly(){
            System.out.println("El muurcielago vuela");
        }
        
        @Override
        public void fly2() {
        }
    }
}