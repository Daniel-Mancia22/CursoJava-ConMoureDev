package oop.ClassExercises;

public class Car {
    //Atributos
    private String brand;
    private String model;
    
    //Contructor
    public Car (String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    
    //Metodos
    public void showData(){
        System.out.println("La Marca del Carro es: " + brand + " y es el modelo es: " + model);
    }
}