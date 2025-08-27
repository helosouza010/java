package javinha.java;
import java.util.Scanner;
public class calculadorasimples{
	public static void main(String[]args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Digite primeiro numero: ");
		Double numero1= scanner.nextDouble();
		System.out.print("Escola uma operacao(*,+,-,/): ");
		char operacao= scanner.next().charAt(0);
		System.out.print("Digite o segundo numero: ");
		Double numero2= scanner.nextDouble();
		
		if (operacao=='*') {
			Double resultado= numero1*numero2;
			System.out.print("O resultado da sua multiplicacao é: "+resultado);
		}else
			if (operacao=='+') {
				Double resultado= numero1+numero2;
				System.out.print("O resultado da sua adicao é: "+resultado);
			}else
				if(operacao=='-') {
					Double resultado=numero1-numero2;
					System.out.print("O resultado de sua subtracao é: "+resultado);
				}else
					if(operacao=='/') {
						Double resultado=numero1/numero2;
						System.out.print("O resultado de sua divisao é: "+resultado);
					}else {
						System.out.printf("Operacao invalida");
					}
		
			
		
		
		
	}
}