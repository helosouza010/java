package javinha.java;
import java.util.Scanner;
public class Carteira {
public static void main(String[]args) {
	Scanner scanner= new Scanner (System.in);
	
	System.out.println("Ola, seja bem vindo(a)\n Para darmos inicio a seu cadatro de carteira de motorista siga as instruçoes abaixo");
	System.out.println("Digite seu nome abaixo:");
	String nome= scanner.nextLine();
	System.out.print("Ok, "+nome+",agora, por favor, digite sua idade: ");
	int idade= scanner.nextInt();
	
	Boolean deMaior= idade>=18;
	
	if(deMaior) {
		System.out.print("Ok,"+nome+",vemos que tem "+idade+" anos de idade, ja que voce ja é um adulto, vamos proseguir com seu cadastro ;)");
	}
	else {
		System.out.println("Bem "+nome+"... Notamos que nao atingiu a sua maioridade, volte daqui alguns aniversarios, estaremos felizes em te atender quando estiver adulto");
	}
	
	
}
}
