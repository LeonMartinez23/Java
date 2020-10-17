package pkgfor;

import java.util.Scanner;

public class For {
    
    public static void main(String[] args) 
    {
        
        int n; 
        
        System.out.print("Escribe un numero: ");
        Scanner leer = new Scanner(System.in) ;
        n = leer.nextInt();
        int i;

        for (i = 0; i <= n; i++)
        
        {
            System.out.println(i);
        }
    }
    
}
