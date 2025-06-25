package operadores;

// @author Daniel Mancia

public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aritmeticos
        
        var a = 4;
        var b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        //Asignacion
        
        a = b;
        System.out.println(a);
        
        a = b * 2;
        System.out.println(a);
        
        a += 2; //a = a + 2
        System.out.println(a);
        
        a -= 2; 
        System.out.println(a);
        
        a *= 2; 
        System.out.println(a);
        
        a /= 2; 
        System.out.println(a);
        
        a %= 2; 
        System.out.println(a);
        
        //Compracion o relacionales.
        
        //igualdad
        System.out.println( a == b);
        
        //Es diferente
        System.out.println(a != b);
        
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        
        //Logicos
        
        // y (and)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        
        System.out.println( 3>2 & 5 == 2);
        
        // o (or) ||
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        
        System.out.println( 3>2 || 5 == 2);
        
        // No (not)
        System.out.println(!true);
        System.out.println(!false);
        
        System.out.println( !(3>2) || 5 == 2);
        
        
        //Unarios
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
    }
}