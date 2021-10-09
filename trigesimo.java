package trabalho1;
import java.util.Scanner;
public class trigesimo {
	public static void main(String[] args) {
		float taxa=0;
		float pl=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de combustivel comprado ");
		int lit = sc.nextInt();
		System.out.print("A-alcool ou G-gasolina:");
		char tipo = sc.next().charAt(0);
		if(tipo=='A'||tipo=='a') {
			pl = 1.9f;
			if(lit<=20 && lit>=1) 
				taxa = 0.03f;
			else if(lit>20) 
				taxa = 0.05f;
		}
		if(tipo=='G'||tipo=='g') {
			pl = 2.5f;
			if(lit<=20 && lit>=1) 
				taxa = 0.04f;
			else if(lit>20) 
				taxa = 0.06f;
		}
		float preco = (pl*lit-(lit*taxa));
		System.out.printf("valor final:%.2f", preco);
		sc.close();
	}}