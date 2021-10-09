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
			System.out.println("medidas pertencem a um triângulo");
			if (a==b && a==c && b==c)
				System.out.println("triângulo é equilátero");
			else if(a==b||a==c||b==c)
				System.out.println("triângulo é isósceles");
			else
				System.out.println("triângulo é escaleno");
		}else 
			System.out.println("triângulo inválido");
		sc.close();
	}}