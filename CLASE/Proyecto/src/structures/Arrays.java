package structures;

public class Arrays {
    public static void main (String[] arg){
        //Son estructura de datos que almacenan datos del mismo tipo: Indexados
        
        //Declaracion y creacion
        int[] numbers = new int[3];
        System.out.println(numbers);
        System.out.println(numbers.length);
        
        String[] names = {"Daniel", "Mancia", "Juan"};
        System.out.println(names);
        
        //Acceso
        System.out.println(numbers[0]);
        System.out.println(names[0]);
        
        System.out.println((new String[3])[0]);
        
        //Modificacion
        numbers[0] = 1;
        numbers[1] = 10;
        
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        
        //add
        numbers[2] = 12;
        System.out.println(numbers[3]);
        
        System.out.println(names[2]);
        
        //update
        names[2] = "daniel@gmail.com";
        System.out.println(names[2]);
        
        //delete
        names[2] = null;
        System.out.println(names[2]); 
    }
}