package javinha.java;
import java.util.Scanner;
public class Cadastro {
public static void main (String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("Ola, qual o seu nome: ");
	String nome= scanner.nextLine();
	System.out.print("Qual a sua idade: ");
	int idade = scanner.nextInt();
	
	Boolean deMaior= idade>=18;
	
	System.out.print("De maior? "+deMaior);
	
}
}
