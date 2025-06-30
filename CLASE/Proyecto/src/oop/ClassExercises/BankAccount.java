package oop.ClassExercises;

public class BankAccount {
    //Atributos
    private double balance;
    
    //Contructor
    public BankAccount (double balance){
        this.balance = balance;
    }
    
    //Metodos
    public double deposit(double Nsaldo){
        double Saldo = 0;
        
        Saldo = balance + Nsaldo;
        
        balance = Saldo;
        
        return balance;
    }

    //Getter
    public double getBalance() {
        return balance;
    }
}