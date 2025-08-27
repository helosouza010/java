package javinha.java;
import java.util.Scanner;
public class Ola {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		String saudacao = "Olá!";
		
		System.out.println(saudacao);
		
		System.out.print("Qual o seu nome? ");
		String nome = scanner.nextLine();
		System.out.print("Olá "+nome);
		
		
	}
	
}
