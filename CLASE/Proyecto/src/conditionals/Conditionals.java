package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        //Condicionales
        
        var age = 22;
        
        if(age > 18){
            System.out.println("El usuario es Mayor de edad");
        } else if (age == 18){
            System.out.println("El usuario acaba de cumplir los 18 años");
        }else {
            System.out.println("El usuario es Menor de edad");
        } 
        
        //Switch
        var day =1;
        
        switch(day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2: 
                System.out.println("Martes");
                break;
            
            case 3:
                System.out.println("Miercoles");
                break;
                
            case 4: 
                System.out.println("Jueves");
                break;
                
            case 5:
                System.out.println("Viernes");
                break;
                
            case 6: 
                System.out.println("Sabado");
                break;
                
            case 7:
                System.out.println("Domingo");
                break;
                
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
