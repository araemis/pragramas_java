package trabalho1;
import java.util.Scanner;
public class oitavo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1ª nota ");
		float n1 = sc.nextFloat();
		System.out.print("2ª nota ");
		float n2 = sc.nextFloat();
		float media = (n1+n2)/2;
		if(media >= 7) {
			System.out.print("Aprovado");
		}else {
			System.out.print("Reprovado");
		}
		sc.close();
	}}