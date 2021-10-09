package trabalho1;
import java.util.Scanner;
public class vigesimo_quinto {
	public static void main(String[] args) {
		int count=0;
		int uni=0;
		String nota=null;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite um valor entre 10 e 600 ");
		int num = sc.nextInt();
		while (num<10 || num>600) {
			System.out.print("digite um valor entre 10 e 600 ");
			num = sc.nextInt();
		}
		int cen = num/100;
		int cinq = (num%100)/50;
		int dez = (num%50)/10;
		int cin = (num%10)/5;
		int um = (num%5)/1;
		for (int i=0; i<5;i++) {
			if (i==0) {
				count = cen;
				uni = 100;
			}else if(i==1) {
				count = cinq;
				uni = 50;
			}else if (i==2) {
				count = dez;
				uni = 10;
			}else if (i==3) {
				count = cin;
				uni = 5;
			}else if (i==4) {
				count = um;
				uni = 1;
			}
			if (count==1) 
				nota = "uma";
			else if (count==2) 
				nota = "duas";
			else if (count==3) 
				nota = "três";
			else if (count==4) 
				nota = "quatro";
			else if (count==5) 
				nota = "cinco";
			else if (count==6) 
				nota = "seis";
			else if (count==7) 
				nota = "sete";
			else if (count==8) 
				nota = "oito";
			else if (count==9) 
				nota = "nove";
			
			if (count==1) 
				System.out.print(nota+" nota de "+uni);
			else if (count>=2 && count<=9) 
				System.out.print(nota+" notas de "+uni);
			
			if(i!=4)
				if (count!=0) 
					System.out.print(", ");
		}sc.close();	
}}