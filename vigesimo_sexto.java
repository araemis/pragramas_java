package trabalho1;
import java.util.Scanner;
public class vigesimo_sexto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("digite um n�mero inteiro ");
		int num = sc.nextInt();
		System.out.println();
		if (num%2==0) {
		System.out.print("n�mero digitado � par");
		}else {
			System.out.print("n�mero digitado � impar");
		}sc.close();
	}
}