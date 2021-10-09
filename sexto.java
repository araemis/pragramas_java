package trabalho1;
import java.util.Scanner;
public class sexto {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite um Número ");
		num = sc.nextInt();
		if(num%2==0) {
			System.out.println("número é par ");
			num=num*2+1;
		}else { 
			System.out.println("número é ímpar ");
			num*=2;
		}
		
		System.out.println("após a transformação: "+num);
		sc.close();
	}}