package javinha.java;
import java.util.Scanner;
public class soma{
 public static void main(String[] args){
	 Scanner scanner= new Scanner(System.in);
System.out.print("Digite o primeiro numero: ");
Double numero1= scanner.nextDouble();
System.out.print("Digite o segundo numero: ");
Double numero2= scanner.nextDouble();

Double somatoria= numero1+numero2;

System.out.print("Seu resultado da somatoria eh: " +somatoria);


}
	}