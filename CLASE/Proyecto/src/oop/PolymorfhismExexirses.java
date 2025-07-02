package oop;

import java.util.ArrayList;

public class PolymorfhismExexirses {
    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        ArrayList<Animal> zo = new ArrayList<>();
        
        var a = new Animal();
        var d = new Dog();
        var c = new Cat();
        var co = new Cow();
        var hor = new Horse();
        
        zo.add(a);
        zo.add(d);
        zo.add(c);
        zo.add(co);
        zo.add(hor);
        
        for (Animal animal : zo) {
            animal.makeSound();
        }
        
        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        ArrayList<Shape> sh = new ArrayList<>();
        
        var s = new Shape();
        var circle = new Circle();
        var rec = new Rectangle();
        
        sh.add(s);
        sh.add(circle);
        sh.add(rec);
        
        for (Shape shape : sh) {
            shape.calculateArea(2,5);
        }
        
        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        var vh = new Printer();
        vh.print("Hola", "Mancia");
        vh.print(2.3, 2.5);
        vh.print(3, 5);
        
        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
        var gre  = new Greeter();
        gre.greet();
        gre.greet("Daniel Mancia");
        
        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        ArrayList<Vehicle> v = new ArrayList<>();
        
        var vehicle = new Vehicle();
        var car = new Car();
        var bike = new Bike();
        var truck = new Truck();
        
        v.add(vehicle);
        v.add(car);
        v.add(bike);
        v.add(truck);
        
        for (Vehicle ve : v) {
            ve.start();
        }
        
        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        sendNotification(new EmailNotification());
        sendNotification(new SMSNotification());
        
        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
        showAnimalType(new Dog());
        showAnimalType(new Cat());
        showAnimalType(new Cow());
        showAnimalType(new Horse());
        
        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
        var converter = new Converter();
        converter.convert(42);
        converter.convert(3.14);
        converter.convert("texto");
        
        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
        ArrayList<Product> products = new ArrayList<>();
        
        var book = new Book();
        book.setPrice(100);
        
        var tv = new Electronic();
        tv.setPrice(500);
        
        products.add(book);
        products.add(tv);

        for (Product p : products) {
            System.out.println("Precio final: " + p.getPrice());
        }
        
        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new Warrior());
        characters.add(new Archer());
        characters.add(new Mage());

        for (Character y : characters){
            y.attack();
        }
    }
    
    //Class para Ejercico 1
    public static class Animal {
        public void makeSound() {
            System.out.println("Animal hace un sonido");
        }

        public String getType() {
            return "Animal";
        }
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound(){ 
            System.out.println("Woof"); 
        }
        
        @Override
        public String getType(){ 
            return "Perro"; 
        }
    }

    public static class Cat extends Animal {
        @Override
        public void makeSound(){ 
            System.out.println("Miau"); 
        }
        
        @Override
        public String getType(){ 
            return "Gato"; 
        }
    }

    public static class Cow extends Animal {
        @Override
        public void makeSound(){ 
            System.out.println("Muuu"); 
        }
        
        @Override
        public String getType(){ 
            return "Vaca"; 
        }
    }

    public static class Horse extends Animal {
        @Override
        public void makeSound(){ 
            System.out.println("Hiiiiii"); 
        }
        
        @Override
        public String getType(){ 
            return "Caballo"; 
        }
    }
    
    //Class para Ejrcico 2
    public static class Shape {
        public void calculateArea(double altura, double ancho){
        }
    }
    
    public static class Circle extends Shape{
        
        @Override
        public void calculateArea(double radio, double ancho){
            
            double area = 0;
            final double PI = 3.1416;
            
            area = (PI * (radio*radio));
            System.out.println("El area del circulo es: " + area);
        }
    }
    
    public static class Rectangle extends Shape{
        
        @Override
        public void calculateArea(double altura, double ancho){
            
            double area = 0;
            area = altura * ancho;
            System.out.println("El area del rectangulo es: " + area);
        }
    }
    
    //Class para Ejrcico 3
    public static class Printer{
        
        public void print(String a, String b){
            String cadena = a + b;
            System.out.println("La cadena: " + cadena);
        }
        
        public void print(double a, double b){
            double resta = a - b;
            System.out.println("La resta: " + resta);
        }
        
        public void print(int a, int b){
            int suma = a + b;
            System.out.println("La suma: " + suma);
        }
    }
    
    //Class para Ejrcico 4
    public static class Greeter{
        public void greet(){
            System.out.println("Hello");
        }
        
        public void greet(String name){
            System.out.println("Hello " + name);
        }
    }
    
    //Class para Ejrcico 5
    public static class Vehicle {
        public void start(){
            System.out.println("Comenzar a avanzar");
        }
    }
    
    public static class Car extends Vehicle{
        
        @Override
        public void start(){
            System.out.println("El carro comenzo a avanzar");
        }
    } 
    
    public static class Bike extends Vehicle{
        
        @Override
        public void start(){
            System.out.println("El bicicleta comenzo a avanzar");
        }
    }
    
    public static class Truck extends Vehicle{
        
        @Override
        public void start(){
            System.out.println("El camion comenzo a avanzar");
        }
    } 
    
    //Class para Ejrcico 6
    public static class Notification {
        public void send() {
            System.out.println("Enviando notificación");
        }
    }

    public static class EmailNotification extends Notification {
        @Override
        public void send() {
            System.out.println("Correo electrónico enviado");
        }
    }

    public static class SMSNotification extends Notification {
        @Override
        public void send() {
            System.out.println("SMS enviado");
        }
    }

    public static void sendNotification(Notification n) {
        n.send();
    }

    //Class para Ejrcico 7
    public static void showAnimalType(Animal animal) {
        System.out.println("Tipo de animal: " + animal.getType());
    }

    //Class para Ejrcico 8
    public static class Converter {
        public void convert(int value) {
            System.out.println("Entero convertido a texto: " + Integer.toString(value));
        }

        public void convert(double value) {
            System.out.println("Decimal convertido a texto: " + Double.toString(value));
        }

        public void convert(String text) {
            System.out.println("Texto en mayúsculas: " + text.toUpperCase());
        }
    }

    //Class para Ejrcico 9
    public static class Product {
        protected double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    public static class Book extends Product {
        public double getPrice() {
            return price * 0.9;
        }
    }

    public static class Electronic extends Product {
        public double getPrice() {
            return price * 0.8;
        }
    }

    //Class para Ejrcico 10
    public static class Character {
        public void attack() {
            System.out.println("Atacando con ataque base");
        }
    }

    public static class Warrior extends Character {
        @Override
        public void attack() {
            System.out.println("Ataque de guerrero con espada");
        }
    }

    public static class Archer extends Character {
        @Override
        public void attack() {
            System.out.println("Ataque de arquero con flechas");
        }
    }

    public static class Mage extends Character {
        public void attack() {
            System.out.println("Ataque de mago con magia");
        }
    }
}