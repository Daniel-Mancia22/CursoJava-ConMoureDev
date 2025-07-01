package oop;

import java.util.ArrayList;

public class InheritanceExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        var myCar = new Car();
        myCar.move();
        myCar.honk();
        
        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        var persona = new Person();
        persona.setName("Daniel");
        persona.setAge(22);
        System.out.println("Hola " + persona.getName() + " de " + persona.getAge() + " Años");
        
        var student = new Student();
        student.study();
        
        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        var dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();
        
        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        var m = new Manager();
        m.setName("Daniel Mancia");
        m.setSalary(268.99);
        m.setDepartment("Deportes");
        
        System.out.println("Hola "+ m.getName()+" tu salario es: "+ m.getSalary()+ " estas en el departamento de "+ m.getDepartment());
        
        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        var circle = new Circle();
        circle.calculateArea(5, 0);
        
        var rectangle = new Rectangle();
        rectangle.calculateArea(4, 3);
        
        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        var eagle = new Eagle();
        eagle.fly();
        
        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        var device = new Device();
        var phone = new Phone();
        
        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        var sa = new SavingsAccount();
        sa.deposit(500);
        sa.addInterest();
        sa.withdraw(23);
        
        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        var v = new Vehicle1();
        var c = new Car1();
        var b = new Bike();
        var t = new Truck();
        
        v.describe();
        c.describe();
        b.describe();
        t.describe();
        
        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        ArrayList<Animal> zoo = new ArrayList<>();
        /*zoo.add(new Dog());
        zoo.add(new Cat());
        zoo.add(new Bird());*/
        
        var w = new Animal();
        var z = new Dog();
        var x = new Cat();
        var k = new Bird();
        
        zoo.add(w);
        zoo.add(z);
        zoo.add(x);
        zoo.add(k);
        
        for (Animal a : zoo) {
            a.makeSound();
        }
    }
    
    //Class para Ejercico 1
    public static class Vehicle{
        public void move(){
            System.out.println("El vehiculo se esta moviendo");
        }
    }
    
    public static class Car extends Vehicle{
        public void honk(){
            System.out.println("piii piiii");
        }
    }
    
    //Class para Ejrcico 2
    public static class Person{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if(age < 0){
                System.out.println("La edad no puede ser negativa");
            }else{
                this.age = age;
            }
        } 
    }
    
    public static class Student{
        private int grade;
        
        public void study(){
            System.out.println("Hay que estudiar");
        }
    }
    
    //Class para Ejercico 3
    public static class Animal{
        
        public void makeSound(){
            System.out.println("haciendo sonido");
        }
    }
            
    public static class Dog extends Animal{
        
        @Override
        public void makeSound(){
            System.out.println("Woof");
        }
    }
    
    public static class Cat extends Animal{
        
        @Override
        public void makeSound(){
            System.out.println("Meow");
        }
    }
    
    //Class para Ejrcico 4
    public static class Employee{
        private String name;
        private double salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if (salary < 0){
                System.out.println("Salario no puede ser negativo");
            }else{
                this.salary = salary;
            }
        }
    }
    
    public static class Manager extends Employee{
        private String department;

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
    }
    
    //Class para Ejrcico 5
    public static abstract class Shape{
        
        public abstract void calculateArea(double altura, double ancho);
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
    
    //Class para Ejrcico 6
    public static class Bird extends Animal{
        public void fly(){
            System.out.println("Volando");
        }
        
        public void makeSound(){
            System.out.println("fuii ");
        }
    }
    
    public static class Eagle extends Bird{
        
        @Override
        public void fly() {
            super.fly();
            System.out.println("Volando como un águila");
        }
    }
    
    //Class para Ejrcico 7
    public static class Device{
        public Device(){
            System.out.println("Device created");
        }
    }
    
    public static class Phone extends Device{
        public Phone(){
            System.out.println("Phone ready");
        }
    }
    
    //Class para Ejercico 8
    public static class Account{
        private double balance;
        
        public Account(){  
        }
        
        public double deposit(double amount){
            double Saldo = 0;
            
            if(amount < 0){
                System.out.println("El monto debe ser positivo");
            }else{
                Saldo = balance + amount;
                balance = Saldo;
                System.out.println("Con el Deposito recien hecho, Su nuevo monto es de: " + balance);
            }
            return balance;
        }
        
        public double withdraw(double amount){
            double Saldo = 0;
            
            if(amount < 0){
                System.out.println("El monto debe ser positivo");
            }else{
                Saldo = balance - amount;
                balance = Saldo;
                System.out.println("Con el Retiro recien hecho, Su nuevo monto es de: " + balance);
            }
            return balance;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if(balance > 0){
                this.balance = balance;
            }else{
                System.out.println("El monto debe ser positivo");
            }
        }
    }
    
    public static class SavingsAccount extends Account{
        public void addInterest() {
            double interest = getBalance() * 0.05;
            deposit(interest);
            System.out.println("Interés agregado: " + interest);
        }
    }

    //Class para Ejercico 9
    public static class Vehicle1{
        public void describe(){
            System.out.println("Es un vehiculo");
        }
    }
    
    public static class Car1 extends Vehicle1{
        
        @Override
        public void describe(){
            System.out.println("Es un carro de color blanco");
        }
    }
    
    public static class Bike extends Vehicle1{
        
        @Override
        public void describe(){
            System.out.println("Es un bicicleta de color rojo");
        }
    }
    
    public static class Truck extends Vehicle1{
        
        @Override
        public void describe(){
            System.out.println("Es un camion de color verde");
        }
    }
}