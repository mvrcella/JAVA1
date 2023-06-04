 
import java.util.Scanner;
public class areatriangulo {

 public static void main (String args[])
 {

 float base, altura, area;
 
Scanner entrada = new Scanner(System.in); 
  
System.out.println("Digite a base do Triângulo:");

base = entrada.nextFloat();
System.out.println("Digite a altura do Triângulo:");
altura = entrada.nextFloat();
area = (base * altura )/2; 
  System.out.println("Área do Triângulo = "+ area);
 }
}