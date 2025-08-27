package javinha.java;
import java.util.Scanner;
public class massacorporal{
    public static void main(String[] args) {
    	Scanner scanner = new Scanner (System.in);
    	
        System.out.print("Ola, digite seu peso em kg: ");
        Double peso= scanner.nextDouble();
        
        System.out.print("Digite sua altura: ");
        Double altura= scanner.nextDouble();
        
        Double massaIMC= peso/(altura*altura);
        System.out.println("O valor da sua massa corporea IMC e: "+massaIMC);
        
        scanner.close();
    }
}
