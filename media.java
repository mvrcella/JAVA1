import java.util.Scanner;

public class media {
    
    public static void main(String[] args)
     {
       Scanner entrada= new Scanner(System.in);
        int nota1, nota2, nota3;
    
        System.out.println("Informe a primeira nota do aluno:");
        nota1 = entrada.nextInt();
        System.out.println("Informe a segunda nota do aluno:");
        nota2 = entrada.nextInt();
        System.out.println("Informe a terceira nota do aluno:");
        nota3 = entrada.nextInt();
   
        int media = (nota1+nota2+nota3)/3;
            System.out.println("A média do aluno é :" + media);
       
    
           

    }

}