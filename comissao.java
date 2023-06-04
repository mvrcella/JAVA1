
public class comissao {
    
    public static void main(String[] args)
     {
        double sal_fixo, vendas;
    
        System.out.print("Informe o valor do salário fixo do funcionário:");
        sal_fixo = Double.parseDouble(System.console().readLine());
        System.out.print("Informe o valor das vendas feitas pelo funcionário:");
        vendas = Double.parseDouble(System.console().readLine());
        double com = (vendas*4/100);
        double sal_final = (com+sal_fixo);
            System.out.printf("O salário final do funcionário é de: R$ %.2f\n",+ sal_final);
            System.out.printf("Com o valor de comissão sendo: R$ %.2f\n", + com);
    }
     
    
           

    }

