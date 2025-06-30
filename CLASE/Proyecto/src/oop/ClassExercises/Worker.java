package oop.ClassExercises;

public class Worker {
    private String names;
    private String surnames;
    private double salary;
    
    //Contructor
    public Worker (String names, String surnames, double salary){
        this.names = names;
        this.surnames = surnames;
        this.salary = salary;
    }
    
    //Metodos
    public void showSalary(){
        System.out.println("El Salario es: " + salary);
    }
}