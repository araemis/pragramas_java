package trabalho1;
import java.util.Scanner;
public class decimo_sexto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n1:");
		float n1 = sc.nextFloat();
		System.out.print("n2:");
		float n2 = sc.nextFloat();
		float media = (n1+n2)/2;
		if((n1>=0&&n1<=10)&&(n2>=0&&n2<=10)) {
			if(media >= 0 && media <= 3) 
				System.out.print("reprovado");
			else if(media >3 && media <= 6.9 )
				System.out.print("em exame");
			else if(media >= 7 && media <= 10)
				System.out.print("aprovado");
		}else 
			System.out.println("valor inválido");
		sc.close();
	}}