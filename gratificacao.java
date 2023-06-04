public class gratificacao {
    
    public static void main (String args[])
 {


double sal, grat, imp, desc, novosalario;
  
System.out.print("Digite o valor do salário base do funcionário:");
sal = Double.parseDouble(System.console().readLine());
grat = (sal * 5/100);
imp = (sal * 7/100);
desc = (sal - imp);
novosalario = (desc + grat);
  System.out.printf("O valor do salário a receber é: R$%.2f\n", + novosalario);
 }
}
    

