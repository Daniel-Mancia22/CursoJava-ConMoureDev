package oop.ClassExercises;

public class Student {
    //Atributos
    private double score;
    
    //Contructor
    public Student (double score){
        this.score = score;
    }
    
    //Metodos
    public void averages(){
        if(score >= 6){
            System.out.println("El estudiante Aprobo con nota de: " + score);
        }else{
            System.out.println("El estudiante Reprobo con nota de: " + score);
        }
    }
}