package trabalho1;
import java.util.Scanner;
public class vigesimo_nono {
	public static void main(String[] args) {
		long veredito=0;
		char perg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Reponda as quest�es s-sim ou n-n�o");
		for(int i=0; i<5;i++) {
			if (i==0) 
				System.out.print("Telefonou para a v�tima? ");
			else if(i==1) 
				System.out.print("Esteve no local do crime? ");
			else if(i==2) 
				System.out.print("Mora perto da v�tima? ");
			else if(i==3) 
				System.out.print("Devia para a v�tima? ");
			else if(i==4) 
				System.out.print("J� trabalhou com a v�tima? ");
		perg = sc.next().charAt(0);
		while (perg!='s' && perg!='n') {
			perg = sc.next().charAt(0);
		}
		if (perg=='s') 
		veredito ++;		
		}
		System.out.println();
		if(veredito==2) 
			System.out.println("Suspeita");
		else if(veredito==3 || veredito==4) 
			System.out.println("C�mplice");
		else if(veredito==5) 
			System.out.println("Assassino");
		else 
			System.out.println("inocente");
		sc.close();
}}