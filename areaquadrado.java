import java.util.Scanner;

public class areaquadrado {
    public static void main (String args[])
    {
   
   Scanner entrada = new Scanner(System.in); 
   
    float base, lado, area;
     
    System.out.println("Digite o tamanho da lateral do quadrado:");
    
   lado = entrada.nextFloat();
  
    area = (lado * lado ); 
      System.out.println("A área do quadradro é:  "+ area);
    
}
}
