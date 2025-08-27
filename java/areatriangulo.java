package javinha.java;
import java.util.Scanner;
public class areatriangulo{
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite o valor da base: ");
	Double base = scanner.nextDouble();
	System.out.print("Digite o valor da altura: ");
	Double altura = scanner.nextDouble();
	
	Double area= (base*altura)/2;
	
	System.out.print("O valor da area do triangulo é: "+area);
}}