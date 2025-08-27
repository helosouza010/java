package javinha.java;
import java.util.Scanner;
public class parouimpar{
public static void main (String[]args) {
Scanner scanner= new Scanner(System.in);

System.out.print("Digite um numero: ");
Double numero= scanner.nextDouble();


 if (numero%2==0) {
	 System.out.print("Seu numero é par");
 }else {
	 System.out.print("Seu numero é impar");
 }
}
}