package trabalho1;
import java.util.Scanner;
public class sexto {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite um N�mero ");
		num = sc.nextInt();
		if(num%2==0) {
			System.out.println("n�mero � par ");
			num=num*2+1;
		}else { 
			System.out.println("n�mero � �mpar ");
			num*=2;
		}
		
		System.out.println("ap�s a transforma��o: "+num);
		sc.close();
	}}