package oop.ClassExercises;

public class Book {
    //Atributos
    private String title;
    private String author;
    
    //Contructor
    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }
    
    //Metodos
    public void showData(){
        System.out.println("El nombre es: " + author + " y mi libro lleva el titulo de: " + title);
    }
    
    //Getter and Setter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}