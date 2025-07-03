package oop;

public class AbstractionExercises {
    public static void main(String[] args) {
        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        var circle = new Circle();
        circle.calculateArea(2.4, 3.4);
        
        var rectangle = new Rectangle();
        rectangle.calculateArea(3.8, 2.9);
        
        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
        var guitar = new Guitar();
        guitar.play();
        
        var piano = new Piano();
        piano.play();
        
        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        Animal[] animales = {dog, cat};
        
        for(Animal fg: animales){
            fg.makeSound();
        }
        
        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
        Drawable[] figuras = { new Circle1(), new Square1(), new Triangle1()};

        for (Drawable figura : figuras) {
            figura.draw();
        }
        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        Employee emp1 = new FullTimeEmployee("Carlos", 750.00);
        Employee emp2 = new PartTimeEmployee("Lucía", 25, 6.5);

        emp1.calculateSalary();
        emp2.calculateSalary();
        
        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
        var car = new Car();
        var robot = new Robot();
        
        car.Move();
        robot.Move();
        
        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        var tv = new TV();
        var lavadora = new WashingMachine();
        
        tv.turnOn();
        tv.turnOff();
        
        lavadora.turnOn();
        lavadora.turnOff();
        
        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
        var duck = new Duck();
        duck.fly();
        duck.swim();
        
        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
        var pdf = new PDFDocuments();
        pdf.print();
        
        var word = new WordDocuments();
        word.print();
        
        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
        var voi = new Invoice();
        voi.pay();
        
        var emp = new EmployeePayment();
        emp.pay();
    }
    
    public static abstract class Shape{
        public abstract void calculateArea(double radio, double ancho);
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
    
    //Ejercicio 2
    public interface Playable{
        public void play();
    }
    
    public static class Guitar implements Playable{
        @Override
        public void play(){
            System.out.println("La guitarra empezo a sonadar");
        }
    }
    
    public static class Piano implements Playable{
        @Override
        public void play(){
            System.out.println("La piano empezo a sonadar");
        }
    }
    
    //Ejercicio 3
    public static abstract class Animal {
        public abstract void makeSound();
    }
    
    public static class Dog extends Animal{
        @Override
        public void makeSound() {
            System.out.println("Guu, Guu");
        } 
    }
    
    public static class Cat extends Animal{
        @Override
        public void makeSound() {
            System.out.println("Miuu, Miuu");
        } 
    }
    
    //Ejercicio 4
    public interface Drawable{
        void draw();
    }
   
    public static class Circle1 implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un circulo");
        }
    }

    public static class Square1 implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un cuadrado");
        }
    }

    public static class Triangle1 implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un triangulo");
        }
    }
    
    //Ejercicio 5
    public static abstract class Employee {
        protected String nombre;
        public Employee(String nombre){
            this.nombre = nombre;
        }

        public abstract void calculateSalary();
    }
    
    public static class FullTimeEmployee extends Employee {
        private double salarioMensual;

        public FullTimeEmployee(String nombre, double salarioMensual) {
            super(nombre);
            this.salarioMensual = salarioMensual;
        }

        @Override
        public void calculateSalary() {
            System.out.println("Salario mensual de " + nombre + ": $" + salarioMensual);
        }
    }
    
    public static class PartTimeEmployee extends Employee {
        private int horasTrabajadas;
        private double tarifaPorHora;

        public PartTimeEmployee(String nombre, int horasTrabajadas, double tarifaPorHora) {
            super(nombre);
            this.horasTrabajadas = horasTrabajadas;
            this.tarifaPorHora = tarifaPorHora;
        }

        @Override
        public void calculateSalary() {
            double salario = horasTrabajadas * tarifaPorHora;
            System.out.println("Salario por tiempo parcial de " + nombre + ": $" + salario);
        }
    }
    
    //Ejercicio 6
    public interface Movable{
        public void Move();
    }
    
    public static class Car implements Movable{
        @Override
        public void Move() {
            System.out.println("El carro se esta moviendo");
        }

    }
    
    public static class Robot implements Movable{
        @Override
        public void Move() {
            System.out.println("El robot se esta moviendo");
        }   
    }
    
    //Ejercicio 7
    public static abstract class Appliance{
        public abstract void turnOn();
        public abstract void turnOff();
    }
    
    public static class TV extends Appliance{
        @Override
        public void turnOn() {
            System.out.println("Encediendo Tv");
        }

        @Override
        public void turnOff() {
            System.out.println("Apagando Tv");
        } 
    }
    
    public static class WashingMachine extends Appliance{
        @Override
        public void turnOn() {
            System.out.println("Encediendo Lavadora");
        }

        @Override
        public void turnOff() {
            System.out.println("Apagando Lavadora");
        }  
    }
    
    //Ejercicio 8
    public interface Flyable{
        public void fly();
    }
    
    public interface Swimmable{
        public void swim();
    }
    
    public static class Duck implements Flyable, Swimmable{
        @Override
        public void fly() {
            System.out.println("Asi puede volar");
        }

        @Override
        public void swim() {
            System.out.println("Asi puede nadar");
        } 
    }
    
    //Ejercicio 9
    public static abstract class Document{
        public abstract void print();
    }
    
    public static class PDFDocuments extends Document{
        @Override
        public void print() {
            System.out.println("Imprimiendo PDF");
        } 
    }
    
    public static class WordDocuments extends Document{
        @Override
        public void print() {
            System.out.println("Imprimiendo archivo Word");
        } 
    }
    
    //Ejercicio 10
    public interface Payable{
        public void pay();
    }
    
    public static class Invoice implements Payable{
        @Override
        public void pay() {
            System.out.println("Pago con factura");
        }     
    }
    
    public static class EmployeePayment implements Payable{
        @Override
        public void pay() {
            System.out.println("Pago de empleado");
        }     
    }
}