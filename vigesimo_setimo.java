package trabalho1;
import java.util.Scanner;
public class vigesimo_setimo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número ");
		float num = sc.nextFloat();
		num = num%2;
		System.out.println();
		if (num==1||num==0) {
			System.out.print("número é inteiro");
		}else {
			System.out.print("número é decimal");
		}sc.close();
	}
}