package trabalho1;
import java.util.Scanner;
public class decimo_oitavo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("lado 1 ");
		int a = sc.nextInt();
		System.out.print("lado 2 ");
		int b = sc.nextInt();
		System.out.print("lado 3 ");
		int c = sc.nextInt();
		if(a+b>c && a+c>b && c+b>a) {
			System.out.println("medidas pertencem a um tri�ngulo");
			if (a==b && a==c && b==c)
				System.out.println("tri�ngulo � equil�tero");
			else if(a==b||a==c||b==c)
				System.out.println("tri�ngulo � is�sceles");
			else
				System.out.println("tri�ngulo � escaleno");
		}else 
			System.out.println("tri�ngulo inv�lido");
		sc.close();
	}}