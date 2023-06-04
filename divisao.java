import java.util.Scanner; 

public class divisao {
    
    public static void main(String[] args)
     {
       Scanner entrada= new Scanner(System.in); {

       
        int n1, n2;
        double Resultado;
            
        System.out.println("Digite o primeiro número:");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = entrada.nextInt();
        Resultado = (n1/n2);
            System.out.println("O resultado da divisão é: " + Resultado);
     }
    }
}