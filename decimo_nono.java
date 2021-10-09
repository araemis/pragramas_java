package trabalho1;
import java.util.Scanner;
public class decimo_nono {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("valor do a ");
		float a = sc.nextFloat();
		if(a==0) {
			System.out.println("equação encerrada, pois a=0");
		}else {
			System.out.print("valor do b ");
			float b = sc.nextFloat();
			System.out.print("valor do c ");
			float c = sc.nextFloat();
			float delta = b*b-4*a*c;
			if (delta>0) 
				System.out.println("equação possui duas raiz reais");
			else if(delta==0) 
				System.out.println("equação possui apenas uma raiz real");
			else 
				System.out.println("equação não possui raizes reais");
		}sc.close();
	}}