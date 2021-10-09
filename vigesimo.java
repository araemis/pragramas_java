package trabalho1;
import java.util.Scanner;
public class vigesimo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("digite um ano qualquer ");
		int ano = sc.nextInt();
		System.out.println();
		if (ano>=0) {
			if (ano%4==0) 
				System.out.print("ano informado é bissexto");
			else 
				System.out.print("ano informado não é bissexto");
		}sc.close();
	}}