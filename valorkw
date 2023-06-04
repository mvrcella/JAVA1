public class valorkw {


    
    public static void main(String args [] ) {

        double salmin, qtdconsu, valorpkw, valortotal, desc;
        
        
        System.out.print("Qual é o salário Minimo atual?");
        
            salmin = Double.parseDouble(System.console().readLine());
         
        System.out.print("Qual consumo de quilowatt da residência?");
        
            qtdconsu = Double.parseDouble(System.console().readLine());
        
        valorpkw = (salmin / 500);
        valortotal = (valorpkw * qtdconsu);
        desc = valortotal-((valortotal * 15) / 100);
        System.out.printf("De acordo com seu salário, cada quilowatt consumido sera cobrado: R$%.2f\n", + valorpkw);
        System.out.printf("O valor da sua conta será: R$%.2f\n", + valortotal);
        System.out.printf("Com o desconto de 15%, o valor será de: R$%.2f\n", + desc);        
    }
}
