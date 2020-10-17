package ejercicio2;
import java.util.Scanner;
 
public class Ejercicio2 {
     
    public static void main(String[] args) {
         
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion;
        
       while(!salir){
            
           System.out.println("1. Opcion 1");
           System.out.println("2. Opcion 2");
            
           System.out.println("Escribe un opcion: ");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   {
        
                int n;
                Scanner leer = new Scanner(System.in) ;
                System.out.print("Escribe la edad del sujeto: ");
                n =leer.nextInt();
        
                if (n <=17)
        {
            System.out.println("Es menor de edad");
        }
        else
        {
            System.out.println("Es mayor de edad");
        }
                   }
                   break;
                case 2:
               {    
        int i;
        
        for (i =0; i <= 10; i++)
        {
            System.out.println(i);
        }   
               }
               break;
                case 3:
                   salir=true;
                   break;
               default:
        }
     
    }
}
}
