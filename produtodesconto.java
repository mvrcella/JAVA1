public class produtodesconto {
    public static void main (String args[]){
    double novovalor, desconto, valor;
  
    System.out.print("Digite o valor do produto: ");

    valor = Double.parseDouble(System.console().readLine());

    desconto = (valor * 10/100);
    novovalor = (valor - desconto);
    System.out.printf("O valor do produto com 10 porcento de desconto é: R$ %.2f\n", + novovalor);
    }
        }

