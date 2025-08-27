package javinha.java;
import java.util.Scanner;
public class compensatrabalho{
	public static void main(String[]args) {
		Scanner scanner= new Scanner(System.in);
	System.out.print("Ola, digite seu  nome: ");
	String nome= scanner.nextLine();
	System.out.print("Bem vindo(a) "+nome+ ", digite seu salario: ");
	Double salario = scanner.nextDouble();
	
	Double Acres = salario*0.15;
	Double resul = salario+Acres;
	
	System.out.print(nome+", seu salario com acrescimo é: "+resul);
	}
	
	
}
