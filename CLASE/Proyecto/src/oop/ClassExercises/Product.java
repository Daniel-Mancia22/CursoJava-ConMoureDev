package oop.ClassExercises;

public class Product {
    //Atributos
    private String name;
    private double price;
    
    //Contructor
    public Product (String name, double price){
        this.name = name;
        this.price = price;
    }
    
    //Metodos
    public double discount(double porcentajeDescuento){
        double descuento = price * (porcentajeDescuento / 100);
        double precioFinal = price - descuento;
        return precioFinal;
    }
    
    public void showData(double porcentajeDescuento) {
        double precioConDescuento = discount(porcentajeDescuento);
        System.out.println("Nombre: " + name);
        System.out.println("Precio original: $" + price);
        System.out.println("Precio con " + porcentajeDescuento + "% de descuento: $" + precioConDescuento);
    }
}