package trabalho1;
import java.util.Scanner;
public class quarto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("digite algum ano:");
		int ano = sc.nextInt();
		if (ano>=1000 && ano<=9999)
			if (ano%4==0) 
				System.out.print("ano � bissexto");
			else
				System.out.print("ano n�o � bissexto");
		else
			System.out.print("ano inv�lido");
		sc.close();
	}
}