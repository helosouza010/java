package javinha.java;
import java.util.Scanner;

public class areacirculo{

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Vamos descobrir qual a area do circulo. Digte o valo do raio: ");
		Double raio = scanner.nextDouble();
		
		Double pi= 3.14;
		Double area= pi*(raio*raio);
		System.out.print("O valor da area do circulo eh: "+area);
		
		
	}
	
	
	
	
}