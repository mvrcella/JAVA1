import java.util.Scanner;

public class gratificacao {
    public static void main (String args[])
 {

Scanner entrada = new Scanner(System.in); 

double sal, grat, imp, desc, novosalario;
  
System.out.println("Digite o valor do salário base do funcionário:");
sal = entrada.nextFloat();
grat = (sal * 0.05);
imp = (sal * 0.07);
desc = (sal - imp);
novosalario = (desc + grat);
  System.out.println("O valor do salário a receber é: "+ novosalario);
 }
}

