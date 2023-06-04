import java.util.Scanner;
public class conversaocpf {
    public static void main (String args[])
    {
   
   Scanner entrada = new Scanner(System.in); {
   
    double celsius, far;
     
    System.out.println("Digite o valor da temperatura em Celsius: ");
    
   celsius= entrada.nextFloat();
   
   far = ((9*celsius/5)+32);

   
      System.out.println("O valor da temperatura informada em Fahrenheit é: " + far);
    
}

}
}