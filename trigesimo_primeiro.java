package trabalho1;
import java.util.Scanner;
public class trigesimo_primeiro {
	public static void main(String[] args) {
		float preco=0;
		float calc=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("kilo morango ");
		int mor = sc.nextInt();
		System.out.print("kilo maçã ");
		int mac = sc.nextInt();
		if (mor>0 && mor<=5) 
			preco = 2.5f;
		else if(mor>5) 
			preco = 2.2f;
		calc += (mor*preco);
		if (mac>0 && mac<=5) 
			preco = 1.8f;
		else if(mac>5) 
			preco = 1.5f;
		calc += (mac*preco);
		if (mor+mac>8 || calc>25) 
			calc -= (calc*0.1f);
		System.out.println();
		System.out.print("valor final: R$"+calc);
		sc.close();
	}}