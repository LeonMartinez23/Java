package arraysfor;

public class Arraysfor {

    public static void main(String[] args) {
        
        int [] numeros;
        int i;
        
        numeros = new int [10];
        
        numeros[0] = 5;
        numeros[1] = 10;
        numeros[2] = 15;
        numeros[3] = 20;
        numeros[4] = 25;
        numeros[5] = 30;
        numeros[6] = 35;
        numeros[7] = 40;
        numeros[8] = 45;
        numeros[9] = 50;
        
        for (i = 0; i < numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }
       
    }
    
}
