package javinha.java;
import java.util.Scanner;
public class ValorTotal {
public static void main(String[]args) {
	Scanner scanner= new Scanner(System.in);
	
	System.out.print("Digite o valor do produto: ");
	Double valorProduto= scanner.nextDouble();
	
	System.out.print("Digite a quantidade do produto: ");
	Integer quant= scanner.nextInt();
	
	Double sub= valorProduto*quant;
	
	Double porcent= 10.0/100*sub;
	
	if (quant>=10) {
		Double Total=sub-porcent;
		System.out.println("O valor Total da sua compra foi "+Total);
	}else {
		System.out.print("O valor total da sua compra foi "+sub);
	}
	
	
	
	
}
}
