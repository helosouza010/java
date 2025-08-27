package javinha.java;
import java.util.Scanner;
public class ConversaoCeF{
	public static void main(String[]args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Ola fulano, digite sua temperatura em Celsiu: ");
		Double C= scanner.nextDouble();
	
		Double F= (C*9.5) + 32;
		
		System.out.println("O valor de "+C+"em Fahrenheit é "+F);
		
	}
}