package oop.ClassExercises;

import java.util.ArrayList;

public class ClassesExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("Los Perdidos", "Daniel Mancia");
        
        System.out.println("El Title es: " + book.getTitle());
        System.out.println("El Author es: " + book.getAuthor());

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog = new Dog("Ranger", "Blanco");
        dog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        var book2 = new Book("Los Lindos", "Juan Orteli");

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        var car = new Car("Nissan", "Nissan Sentra 2024");
        car.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var student = new Student(7);
        student.averages();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var bankaccount = new BankAccount(22);
        
        System.out.println("Saldo Actual: " + bankaccount.getBalance());
        
        bankaccount.deposit(3);
        System.out.println("Saldo Actual: " + bankaccount.getBalance());
        
        bankaccount.deposit(30);
        System.out.println("Saldo Actual: " + bankaccount.getBalance());
        
        bankaccount.deposit(10);
        System.out.println("Saldo Actual: " + bankaccount.getBalance());

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        Rectangle rect = new Rectangle(5, 3);

        System.out.println("Área del rectángulo: " + rect.area());
        System.out.println("Perímetro del rectángulo: " + rect.perimetro());

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var worker = new Worker("Daniel", "Mancia", 234.34);
        worker.showSalary();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        Person.addPerson(new Person("Daniel", "Mancia", 22, "SDS123"));
        Person.addPerson(new Person("Ana", "Martínez", 28, "001"));
        Person.addPerson(new Person("Luis", "González", 35, "002"));
        Person.addPerson(new Person("Carla", "Ramírez", 22, "003"));

        Person.showAllPeople();

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var produc = new Product("Pollo Campero", 90);
        produc.showData(45);
    }
}