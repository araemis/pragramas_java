package trabalho1;
import java.util.Scanner;
public class decimo_quarto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�emro que representa os dias da semana (1-Domingo, 2- Segunda...7-sabado) ");
		int dia = sc.nextInt();
//		if(dia == 1)
//			System.out.print(dia+" - domingo");
//		else if(dia%2==0) 
//			System.out.print(dia+" - segunda");
//		else if(dia%3==0) 
//			System.out.print(dia+" - ter�a");
//		else if(dia%4==0) 
//			System.out.print(dia+" - quarta");
//		else if(dia%5==0) 
//			System.out.print(dia+" - quinta");
//		else if(dia%6==0)
//			System.out.print(dia+" - sexta");
//		else if (dia%7==0) 
//			System.out.print(dia+" - sabado");
//		else 
//			System.out.print("valor inv�lido");
		
		switch(dia) {
		case 1:
			System.out.print(dia+" - domingo");
			break;
		case 2:
			System.out.print(dia+" - segunda");
			break;
		case 3:
			System.out.print(dia+" - ter�a");
			break;
		case 4:
			System.out.print(dia+" - quarta");
			break;
		case 5:
			System.out.print(dia+" - quinta");
			break;
		case 6:
			System.out.print(dia+" - sexta");
			break;
		case 7:
			System.out.print(dia+" - sabado");
			break;
		default: 
			System.out.print("valor inv�lido");
		}sc.close();
	}}