package oop.ClassExercises;

public class Dog {
    //Atributos
    private String name;
    private String color;
    
    //Contructor
    public Dog (String name, String color){
        this.name = name;
        this.color = color;
    }
    
    //Metodos
    public void bark(){
        System.out.println("El Dog " + name + " de color " + color + " esta ladrando: GUUA, GUUA, GUUA");
    }
}