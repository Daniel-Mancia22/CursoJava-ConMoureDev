package oop.ClassExercises;

public class Rectangle {
    //Atributos
    private double base;
    private double height;
    
    //Contructor
    public Rectangle (double base, double height){
        this.base = base;
        this.height = height;
    }
    
    //Metodos
    public double area(){
        double area  = base * height;
        return area;
    }
    
    public double perimetro(){
        double perimetro = 2 * (base + height);
        return perimetro;
    }
}