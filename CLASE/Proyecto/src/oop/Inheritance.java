package oop;

public class Inheritance {
    public static void main(String[] args) {
        //Herencia -> reutilizar codigo
        
        var animal = new Animal("Mi Animal");
        //animal.name = "Mi Animal";
        animal.comer();
        
        var dog = new Dog("Mi Dog", 23);
        //dog.name = "Mi Dog";
        dog.comer();
        
        var cat = new Cat("Mi Cat");
        //cat.name = "Mi Cat";
        cat.comer();
        
        var bird = new Bird("Birdddd");
        //bird.name = "Birdddd";
        bird.comer();
        bird.fly();
    }
    
    public static class Animal{
        
        String name;
        
        public Animal(String name){
            this.name = name;
        }
        
        public void comer(){
            System.out.println("El animal con nombre: " + name + " esta comiendo");
        }
    }
    
    public static class Dog extends Animal{

        int age;
        
        public Dog(String name, int age) {
            super(name);
            this.name = name;
            this.age = age;
        }
        
        @Override
        public void comer(){
            System.out.println("El perro con nombre: " + name + " esta comiendo");
        }
    }
    
    public static class Cat extends Animal{
        
        public Cat(String name) {
            super(name);
        }  
    }
    
    public static class Bird extends Animal{

        public Bird(String name) {
            super(name);
        }
        public void fly(){
            System.out.println("El Pajaro con nombre: " + name + " esta volando");
        }
    }
}