package setenciaif;

import java.util.Scanner;

public class Setenciaif {

    public static void main(String[] args) {
        
        int n;
        Scanner leer = new Scanner(System.in);
        
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
    
}
