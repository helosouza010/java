package javinha.java;
import java.util.Scanner;
public class Calculadora {
public static void main(String[]args) {
	Scanner scanner =new Scanner(System.in);
	System.out.print("____CALCULADORA____");
	System.out.print("\nOperações:         |\nAdição=1           |\nSubtração=2        |\nMultiplicação=3    |\nDivisão=4          |\nMódulo=5           |");
	System.out.print("\n____________________");
	
	System.out.print("\n\nDigite o primeiro número: ");
	Integer primeiroNumero=scanner.nextInt();
	
	System.out.print("\nDigite a operação: ");
	Integer Operacao=scanner.nextInt();
	
	System.out.print("\nDigite o segundo número: ");
	Integer segundoNumero=scanner.nextInt();
	
	if (Operacao==1) {
		Integer Total=primeiroNumero+segundoNumero;
		System.out.print("Total da adição= "+Total);
	}else
		if(Operacao==2) {
			Integer Total=primeiroNumero-segundoNumero;
			System.out.print("Total da Subtração= "+Total);
		}else
			if(Operacao==3) {
				Integer Total=primeiroNumero*segundoNumero;
				System.out.print("Total da Multiplicação= "+Total);
			}else
				if(Operacao==4) {
					Integer Total=primeiroNumero/segundoNumero;
					System.out.print("Total da Divisão= "+Total);
				}else
					if(Operacao==5) {
						Integer Total=primeiroNumero%segundoNumero;
						System.out.print("Seu módulo é= "+Total);
					}else {
				
						System.out.print("Operação incorreta!");
					}

}
}
