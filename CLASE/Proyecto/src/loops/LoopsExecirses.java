package loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExecirses {
    public static void main(String[] args) {
        // 1. Imprime los números del 1 al 10 usando while.
        int i = 1;
        
        while(i <= 10){
            System.out.println("Numero: " + i);
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> users = new ArrayList<>();
        users.add("Daniel");
        users.add("Marcos");
        users.add("Hugo");
        users.add("Francisco");
        
        i = 0;
        
        do{
            System.out.println(users.get(i));
            i++;
        }while(i < users.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        
        for(int j = 5; j <= 50; j+=5){
            System.out.println("Multiplo: " + j);
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        
        int[] numbers = {11, 2, 4, 23, 8};
        int suma = 0;

        for(int t = 0; t < numbers.length; t++){
            System.out.println("Numero: " + numbers[t]);
            suma += numbers[t]; 
        }
        System.out.println("La suma de los numeros es: " + suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] surnames = {"daniel", "Juan", "Manuel", "Fernando"};
        
        for(int t = 0; t < surnames.length; t++){
            System.out.println(surnames[t]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> HashSets = new HashSet<>();
        
        HashSets.add("Reina");
        HashSets.add("Julio");
        HashSets.add("Elmer");
        HashSets.add("Kevin");
        
        for(String hashset: HashSets){
            System.out.println("Valores HashSets: " + hashset);
        }
        
        HashMap<String, Integer> HashMapas = new HashMap<>();
        
        HashMapas.put("Daniel", 22);
        HashMapas.put("Vega", 20);
        HashMapas.put("Paola", 23);
        HashMapas.put("Daniela", 19);
        
        for(Map.Entry<String, Integer> email: HashMapas.entrySet()){
            System.out.println(email);
        }
     
        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for(int w = 10; w >= 1 ; w-- ){
            System.out.println("Numero: "+ w);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int y = 1; y <= 20; y++) {
      
           if (y % 3 == 0) {
               continue;
           }
           System.out.println(y);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] Numbers = {11, 2, 4, -2, 23, 8};
        
        for(int h = 0; h < Numbers.length; h++){
            if(Numbers[h] < 0){
                break;
            }
            System.out.println("JK: " + Numbers[h]);
        }
  
        // 10. Crea un programa que calcule el factorial de un número dado.
        int num = 9;
        int factorial = 1;

        for (int s = 1; s <= num; s++) {
            factorial *= s;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}