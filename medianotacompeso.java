import java.util.Scanner;

public class medianotacompeso {
    public static void main (String args[])
    {
   
   Scanner entrada = new Scanner(System.in); {
   
   int nota1, nota2, nota3, p1, p2, p3, media;
    
        System.out.println("Informe a primeira nota do aluno:");
        nota1 = entrada.nextInt();
        System.out.println("Informe a segunda nota do aluno:");
        nota2 = entrada.nextInt();
        System.out.println("Informe a terceira nota do aluno:");
        nota3 = entrada.nextInt();
        System.out.println("Digite o peso da primeira nota: ");
        p1 = entrada.nextInt();
        System.out.println("Digite o peso da segunda nota: ");
        p2 = entrada.nextInt();
        System.out.println("Digite o peso da terceira nota:");
        p3 = entrada.nextInt();
         media = (nota1 * p1 )+( nota2 * p2 ) +(nota3*p3) / (p1 + p2 + p3);
            System.out.println("A média ponderada das três notas é :" + media);
    }
}
} 