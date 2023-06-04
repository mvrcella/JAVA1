import java.util.Scanner;
public class conversaovalorpes {
    /**
     * @param args
     */
    public static void main (String args[])
    {
   
   Scanner entrada = new Scanner(System.in); {
   
    float num, polegadas, jarda, milha;
     
    System.out.println("Digite seu número em pés: ");
    
   num = entrada.nextFloat();
  
    polegadas = (num * 12 ); 
   jarda = (num * 3 ); 
    milha= (num * 1760 ); 
   
      System.out.println("Seu valor era: " + num);
      System.out.println("Em polegadas fica: " + polegadas);
      System.out.println("Em jarda fica: " + jarda);
      System.out.println  ("Em milha fica: " + milha);
    
}
}
}


