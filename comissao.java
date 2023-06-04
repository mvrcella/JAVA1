import java.util.Scanner;

public class comissao {
    
    public static void main(String[] args)
     {
       try (Scanner inter = new Scanner(System.in)) {
        int sal_fixo, vendas;
    
        System.out.println("Informe o valor do salário fixo do funcionário:");
        sal_fixo = inter.nextInt();
        System.out.println("Informe o valor das vendas feitas pelo funcionário:");
        vendas = inter.nextInt();
        double com = (vendas*0.04);
        double sal_final = (com+sal_fixo);
            System.out.println ("O salário final do funcionário é de: R$" + sal_final);
            System.out.println ("Com o valor de comissão sendo: R$" + com);
    }
     
    
           

    }

}