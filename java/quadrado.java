package javinha.java;
import java.util.Scanner;
public class quadrado{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		int numero =  scanner.nextInt();
	
		int calculo= numero*numero;
		
		System.out.println("O resultado do quadrado de "+numero +" eh " +calculo);
	}
	}