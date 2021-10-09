package trabalho1;
import java.util.Scanner;
public class decimo {
	public static void main(String[] args) {
		int num;
		int maior=0;
		int menor=0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<3; i ++) {
			System.out.print(i+1+"º número ");
			num = sc.nextInt();
			if (i==0) {
				maior = num;
				menor = num;
			}else if (num>maior) 
				maior = num;
			else if(num<menor) 
				menor = num;
		}
		System.out.println("maior: "+maior);
		System.out.println("menor: "+menor);
		sc.close();
	}}