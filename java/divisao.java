package javinha.java;
import java.util.Scanner;
public class divisao{
	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);
		
		System.out.println("Digite o dividendo: ");
			Double dividendo = scanner.nextDouble();
			System.out.println("Digite o divisor: ");
			Double divisor = scanner.nextDouble();
			
			Double quociente= dividendo/divisor;
			
			System.out.println("Seu resultado do quociente deu: "+quociente);
		}
	
	
	
	
	
	
	
	
}