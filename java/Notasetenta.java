package javinha.java;
import java.util.Scanner;
public class Notasetenta { //para treinar constante
public static void main(String[]args) {
	Scanner scanner= new Scanner (System.in);
	 final Integer notaMinima= 70;
	
	 System.out.println("Nota do 1º Bimestre: ");
		Double nota1= scanner.nextDouble();
		System.out.println("Nota do 2º Bimestre: ");
		Double nota2= scanner.nextDouble();
		System.out.println("Nota do 3º Bimestre: ");
		Double nota3 = scanner.nextDouble();
		
		Double notaFinal= (nota1+nota2+nota3) /3;
		
		if(notaFinal>notaMinima) {
			System.out.println("Parabens, voce passou com "+notaFinal+" pontos");
		}else {
			System.out.println("Lamento, você reprovou");
		}
	
	
	
}
}
