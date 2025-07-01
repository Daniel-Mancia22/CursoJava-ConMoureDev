package oop;

public class AbstractionExecirses {
    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        var p = new Person();
        
        p.setName("Daniel Mancia");
        p.setAge(22);
        
        System.out.println("El nombre es: " + p.getName());
        System.out.println("La edad de " + p.getName() + " es: " + p.getAge());

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var produc = new Product();
        
        produc.setPrice(-2);
        System.out.println("El precio asignado es: " + produc.getPrice());
        
        produc.setPrice(22);
        System.out.println("El precio asignado es: " + produc.getPrice());

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        var bank = new BankAccount();
        
        bank.setBalance(250);
        System.out.println("El monto inicial es: " + bank.getBalance());
        
        bank.deposit(-23);
        bank.deposit(60);
        bank.withdraw(90);

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        var book = new Book("Mil horas");
        System.out.println("El titulo es: " + book.getTitle());
        
        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temp = new Temperature();
        temp.setCelsius(100);
        System.out.println("La temperatura en celsius que proporciono es: " + temp.getCelsius() + " C");
        
        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        var user = new User("Daniel", "Daniel123-");
        user.checkPassword("Daniel123-");
        
        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        var emp = new Employee();
        
        emp.setSalary(290);
        emp.raiseSalary(15);
        emp.raiseSalary(150.59);
        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        var r = new Rectangle();
        
        r.setWidth(12);
        r.setHeight(34);
        
        r.calculateArea();
        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        var studen = new Student(59);
        studen.isPassed();
        
        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        var c = new Car(0);
        c.accelerate(110);
        c.accelerate(10);
        c.accelerate(1);
        
        c.brake(110);
        c.brake(11);
        
        c.accelerate(115);
    }
    
    public static class Person{
        private String name;
        private int age;

        public Person(){
        }
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else{
            System.out.println("Edad no válida");
        }
        }
    }
    
    public static class Product{
        private double price;

        public Product(){
        }
        
        public double getPrice() {
            return price;
        }
        
        public void setPrice(double price) {
            if(price > 0){
               this.price = price; 
            }else{
                System.out.println("Precio no valido");
            }
        } 
    }
    
    public static class BankAccount{
        private double balance;
        
        public BankAccount(){  
        }
        
        public double deposit(double amount){
            double Saldo = 0;
            
            if(amount < 0){
                System.out.println("El monto debe ser positivo");
            }else{
                Saldo = balance + amount;
                balance = Saldo;
                System.out.println("Con el Deposito recien hecho, Su nuevo monto es de: " + balance);
            }
            return balance;
        }
        
        public double withdraw(double amount){
            double Saldo = 0;
            
            if(amount < 0){
                System.out.println("El monto debe ser positivo");
            }else{
                Saldo = balance - amount;
                balance = Saldo;
                System.out.println("Con el Retiro recien hecho, Su nuevo monto es de: " + balance);
            }
            return balance;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if(balance > 0){
                this.balance = balance;
            }else{
                System.out.println("El monto debe ser positivo");
            }
        }
    }
    
    public static class Book{
        final private String title;
        
        public Book(String title){
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }
    
    public static class Temperature{
        private double celsius;
        
        public Temperature(){
        }

        public double getCelsius() {
            return celsius;
        }

        public void setCelsius(double celsius) {
            if(celsius >= -100 && celsius <= 100){
                this.celsius = celsius;
            }else{
                System.out.println("Dato fuera del rango");
            }
        }
    }
    
    public static class User{
        private String username;
        private String password;
        
        public User(String username, String password){
            this.username = username;
            this.password = password;
        }

        public boolean checkPassword(String inputPassword){
            boolean g = false;
            g = inputPassword.equals(password);
            
            if(g == true){
                System.out.println("Contraseña Correcta");
            } else{
                System.out.println("Contraseña Incorrecta");
            }
            return g;
        }
        
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
    
    public static class Employee{
        private double salary;
        
        public Employee(){
        }
        
        public void raiseSalary(double percent){
            double Nuevo = 0;
            
            if(percent < 0){
                System.out.println("El monto debe ser positivo");
            }else{
                Nuevo = salary + percent;
                salary = Nuevo;
                System.out.println("Su nuevo Salario es: " + salary);
            }
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }        
    }
    
    public static class Rectangle{
        private double width; 
        private double height;
        
        public Rectangle(){
        }

        public void calculateArea(){
            double area = 0;
            
            area = width * height;
            System.out.println("El area es de: " + area);
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public void setHeight(double height) {
            this.height = height;
        }
    }
    
    public static class Student{
        private int grade;
        
        public Student(int grade){
            this.grade = grade;
        }
        
        public void isPassed(){
            if(grade >= 60){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
    }

    public static class Car {
        private double speed;
        
        public Car(double speed){
            this.speed = speed;
        }
        
        public void accelerate(int amount){
            double V = speed;
            
            if(amount < 0){
                System.out.println("El valor debe ser positivo");
            }else if (speed + amount > 120) {
                speed = 120;
                System.out.println("Se alcanzó la velocidad máxima: " + speed + " Km/h");
            }else{
                speed = V + amount;
                System.out.println("El carro va a una velocidad de: " + speed + " Km/h");
            }
        }
        
        public void brake(int amount) {
            if (amount <= 0) {
                System.out.println("El valor debe ser positivo");
            } else if (speed <= 0) {
                System.out.println("El carro ya está detenido");
            } else {
                speed -= amount;
                if (speed <= 0) {
                    speed = 0;
                    System.out.println("El carro se detuvo, llegó a 0 Km/h");
                } else {
                    System.out.println("El carro frenó y va a una velocidad de: " + speed + " Km/h");
                }
            }
        }
    }
}