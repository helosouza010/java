package javinha.java;
import java.util.Scanner;

public class Salario{

public static void main(String[] args){
Scanner scanner= new Scanner (System.in);

	System.out.print("Ola querido funcionario, me diga, qual é o seu nome? Digite aqui:");
	String nomefuncionario= scanner.nextLine();
	
	System.out.print("Ola "+nomefuncionario+ ",seja bem vindo(a), preciso que digite qual o seu ganho por horas aqui:");
	int ganho = scanner.nextInt();
	System.out.print("Certo "+nomefuncionario+ " agora digite o numero de horas trabalhadas:");
	int horas = scanner.nextInt();

	int salario= ganho*horas;
	
	System.out.print(nomefuncionario+" seu salario é " +salario);
}
}