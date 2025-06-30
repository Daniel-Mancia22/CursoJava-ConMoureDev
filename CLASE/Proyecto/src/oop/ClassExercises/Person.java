package oop.ClassExercises;

import java.util.ArrayList;

public class Person {
    // Atributos
    protected String names;
    protected String surnames;
    private int age;
    private String id;

    // Lista estática para almacenar todas las personas
    private static ArrayList<Person> people = new ArrayList<>();

    // Constructor
    public Person(String names, String surnames, int age, String id){
        this.names = names;
        this.surnames = surnames;
        this.setAge(age);
        this.id = id;
    }
    
    public void sayHello(){
        System.out.println("Hola soy " + names + " " + surnames + " y tengo " + age + " años");
    }

    public static void addPerson(Person person) {
        people.add(person);
    }

    public static void showAllPeople() {
        for (Person p : people) {
            p.sayHello();
        }
    }
    
    //Get an Set
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
}