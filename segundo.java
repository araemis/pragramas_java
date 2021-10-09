package trabalho1;
import java.util.Scanner;
public class segundo {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número ");
		num = sc.nextInt();
		if (num > 0)
			System.out.println("valor positivo");
		else if(num<0)
			System.out.println("valor negativo");
		else
			System.out.println("valor igual a zero");
		sc.close();
	}
}