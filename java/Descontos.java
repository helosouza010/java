package javinha.java;
import java.util.Scanner;
public class Descontos {
public static void main(String[]args) {
	Scanner scanner= new Scanner (System.in);
	
	System.out.print("Bem vindo á nossa loja\nAqui você pode comprar seu computador e muito mais, com descontos interdíveis!!!!!!\nE hoje nas compras acima de R$100,00 você não paga frete!!!\n");
	System.out.print("\nCATÁLOGO\n");
	System.out.print("\n1-Computador   R$1000,00\n");
	System.out.print("2-Fone de ouvido grande  R$80,00\n");
	System.out.print("3-Pen drive simples  R$15,00\n");
	System.out.print("4-Pen drive médio  R$30,00\n");
	System.out.print("5-Pen drive chic  R$60,00\n");
	System.out.print("6-Fone de ouvido simples(com fio) R$24,00\n");
	System.out.print("7-Gabinete de computador  R$234,00\n");
	System.out.print("8-Celular usado R$837,00\n");
	System.out.print("9-Banqueta R$45,00\n");
	
	int soma=0;
	int maisItem=0;
	
while(maisItem==0) {

	System.out.println("Digite o numero do seu pedido: ");
int item= scanner.nextInt();

if(item==1) {
	soma +=1000;
}else 
	if(item==2) {
		soma +=80;
	}else
		if(item==3) {
			soma+=15;
		}else
			if(item==4) {
				soma+=30;
			}else
				if(item==5){
				soma+=60;
			}else
				if(item==6) {
					soma+=24;
				}else
					if(item==7) {
						soma+=234;
					}else
						if(item==8) {
							soma+=837;
						}else
							if(item==9) {
								soma+=45;
							}else {
								System.out.println("Opção inválida!");
							}

System.out.println("Deseja mais algum item? 0 para sim e 1 para não");
 maisItem = scanner.nextInt();
}

System.out.print("\nTotal da sua compra: R$"+soma);

if(soma>=100) {
	System.out.println("\nVoce não precisa pagar o frete!, sua compra continua sendo no valor total de R$"+soma);
}else
 {
		Integer ValorcomFrete= soma+15;
		System.out.println("\nSeu valor total com o frete é R$"+ValorcomFrete);
	}


	
	
	
	
	
	
	
}
}
