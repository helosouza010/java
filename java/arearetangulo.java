package javinha.java;
import java.util.Scanner;
public class arearetangulo{
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a base do retangulo: ");
		Double base=scanner.nextDouble();
		System.out.println("Digite a altura do retangulo: ");
		Double altura=scanner.nextDouble();
		
		Double area=base*altura;
	
		System.out.println("A area do retangulo é: "+area);
		
	}
	
}