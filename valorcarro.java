 
public class valorcarro {


        public static void main(String[] args) {
     

           
            double custoFabrica, total, PercentualDistribuidor, PercentualImpostos, Lucro, ValorImpostos;

            System.out.print("Informe o custo de fábrica de um carro novo: ");
            custoFabrica = Double.parseDouble(System.console().readLine());
            System.out.print("Informe o percentual de lucro do distribuidor: ");
            PercentualDistribuidor = Double.parseDouble(System.console().readLine());
            System.out.print("Informe o percentual de impostos: ");
            PercentualImpostos = Double.parseDouble(System.console().readLine());

           ValorImpostos = ((PercentualImpostos/100) * custoFabrica);
            Lucro = ((PercentualDistribuidor/100) * custoFabrica);
            total = (custoFabrica + ValorImpostos + Lucro);
     
            
            System.out.printf("O valor do lucro do distribuidor será de: R$%.2f\n", + Lucro);
            System.out.printf("O valor dos impostos será de: R$%.2f\n", + ValorImpostos);
            System.out.printf("O preço final do carro será: R$%.2f\n", + total);
        }
    }
    

