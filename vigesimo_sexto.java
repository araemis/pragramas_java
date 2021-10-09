package trabalho1;
import java.util.Scanner;
public class vigesimo_sexto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("digite um número inteiro ");
		int num = sc.nextInt();
		System.out.println();
		if (num%2==0) {
		System.out.print("número digitado é par");
		}else {
			System.out.print("número digitado é impar");
		}sc.close();
	}
}