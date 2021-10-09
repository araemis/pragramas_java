package trabalho1;
import java.util.Scanner;
public class vigesimo_primeiro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] data = new int [3];
		for(int i=0; i<3; i++) {
			switch(i){
				case 0:
					System.out.print("digite o dia ");
					data [i] = sc.nextInt();
				break;
				case 1:
					System.out.print("digite o mês ");
					data [i]= sc.nextInt();
				break;
				case 2:
					System.out.print("digite o ano ");
					data [i]= sc.nextInt();
			}}
		if(data[0]>=1&&data[0]<=31 && data[1]>=1&&data[1]<=12 && data[2]>=1000&&data[2]<=9999)
			System.out.println(data[0]+"/"+data[1]+"/"+data[2]);
		else
			System.out.println("informação inválida");
		sc.close();
}}