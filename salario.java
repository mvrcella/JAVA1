
public class salario {
    public static void main (String args[])
    {
   
   
    double horas, sal_min, sal_bruto, imp, total;

     System.out.print("Digite o número de horas trabalhadas:");
    
   horas= Double.parseDouble(System.console().readLine());
   
   System.out.print("Digite o valor do salário mínimo:");
    
   sal_min= Double.parseDouble(System.console().readLine());;

  sal_bruto = (horas * (sal_min/2));
  imp = (sal_bruto * 3/100);
  total = (sal_bruto - imp);

   
      System.out.printf("O salário a receber será: R$%.2f\n", + total);
    
}

}
