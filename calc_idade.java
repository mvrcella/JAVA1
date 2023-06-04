import java.util.Scanner;

public class calc_idade {

    public static void main (String args[])
    {
   
   Scanner entrada = new Scanner(System.in); {
   
    float ano_atual, ano_nasc, dias, meses, anos, semanas;

     System.out.println("Digite o ano atual: ");
    
   ano_atual= entrada.nextFloat();
   
   System.out.println("Digite o ano do nascimento: ");
    
   ano_nasc= entrada.nextFloat();

  anos = (ano_atual - ano_nasc);
  meses = (anos * 12);
  semanas = (anos * 52);
  dias = ( anos * 365);
   
      System.out.println("Sua idade em anos é:" + anos);
      System.out.println("Sua idade em meses é:" + meses);
      System.out.println("Sua idade em semanas é:" + semanas);
      System.out.println  ("Sua idade em dias é:" + dias);
    
}

}
}