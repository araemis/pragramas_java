package trabalho1;
import java.util.Scanner;
public class vigesimo_oitavo {
	public static void main(String[] args) {
		int [] num = new int[2];
		char op=0;
		float calc=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o "+1+"� n�mero ");
		num[0] = sc.nextInt();
		System.out.print("digite o "+2+"� n�mero ");
		num[1] = sc.nextInt();
		
		while(op!='*' && op!='+' && op!='-' && op!='/') {
		System.out.println("tipo da opera��o *,+,-,/");	
		op  = sc.next().charAt(0);	
		}
		if (op=='*') 
			calc = num[0]*num[1];
		else if(op=='+') 
			calc = num[0]+num[1];
		else if(op=='-') 
			calc = num[0]-num[1];
		else if (op=='/') 
			calc = num[0]/num[1];
		
		if (calc%2==0) 
			System.out.print("c�lculo:"+calc+", � par");
		else 
			System.out.print(calc+", � impar");
		
		if(calc>0) 
			System.out.print(", positivo");
		else 
			System.out.print(", negativo");
		
		calc = calc%2;
		if (calc==1||calc==0) 
			System.out.print(" e inteiro");
		else 
			System.out.print(" e decimal");
		sc.close();
	}}