package oop;

public class Clases {
    public static void main(String[] args) {
        
        var persona = new Persona("Daniel", "Mancia", 22, "sdsdsdsds");
        
        /*persona.names = "Daniel";
        persona.surnames = "Mancia";
        persona.age = 22;*/
        
        persona.sayHello();
        
        persona.names = "DANIEL";
        
        System.out.println(persona.names);

        //persona.id = "123456789A";

        System.out.println(persona.getId());

        persona.setAge(38);
        System.out.println(persona.getAge());

        var persona2 = new Persona("MoureDev", "Dev", 18, "123456789B");
        persona2.sayHello();
    }
}