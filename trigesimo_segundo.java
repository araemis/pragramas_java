package trabalho1;
import java.util.Scanner;
public class trigesimo_segundo {
	public static void main(String[] args) {
		int [] Icarne = new int[3];
		String [] Scarne = new String[3];
		float [] preco = new float[3];
		int quant=0;
		char meio;
		float Dpreco=0;
		float total_carne=0;
		float desc=0;
		char tipo=0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<3;i--) {
				System.out.print("f-File Duplo, a-alcatra, p-picanha:");
				tipo= sc.next().charAt(0);
				while(tipo!='f' && tipo!='a' && tipo!='p') {
					System.out.print("f-File Duplo, a-alcatra, p-picanha:");
					tipo= sc.next().charAt(0);
				}
				System.out.print("quantidade kg:");
				quant= sc.nextInt();
				while(quant<0) {
					System.out.print("quantidade kg:");
					quant= sc.nextInt();
				}
			if (quant>=0 || quant<=5) {
				if(tipo=='f') {
					Icarne[0] = quant;
					Scarne[0] = "File Duplo";
					Dpreco = 4.9f;
					preco[0] = quant*Dpreco;
				}else if(tipo=='a') {
					Icarne[1] = quant;
					Scarne[1] = "Alcatra";
					Dpreco = 5.9f;
					preco[1] = quant*Dpreco;
				}else if(tipo=='p') {
					Icarne[2] = quant;
					Scarne[2] = "Picanha";
					Dpreco = 6.9f;
					preco[2] = quant*Dpreco;
				}
				}else if (quant>5) {
				if(tipo=='f') {
					Icarne[0] = quant;
					Scarne[0] = "File Duplo";
					Dpreco = 5.8f;
					preco[0] = quant*Dpreco;
				}else if(tipo=='a') {
					Icarne[1] = quant;
					Scarne[1] = "Alcatra";
					Dpreco = 6.8f;
					preco[1] = quant*Dpreco;
				}else if(tipo=='p') {
					Icarne[2] = quant;
					Scarne[2] = "Picanha";
					Dpreco = 7.8f;
					preco[2] = quant*Dpreco;
				}
				}
			total_carne	= total_carne + preco[0]+preco[1]+preco[2];
			System.out.print("(s ou S)-sim e (N ou n)-não:");
			tipo= sc.next().charAt(0);
			while(tipo!='s' && tipo!='S' && tipo!='n' && tipo!='N') {
				System.out.print("(s ou S)-sim e (N ou n)-não:");
				tipo= sc.next().charAt(0);
			}
			if (tipo=='N' || tipo=='n') {
				i=4;
			}
		}
		System.out.print("forma de pagamento D-debito, C-credito, R-dinheiro ou T-cartão Tabajara:");
		meio = sc.next().charAt(0);
		while(meio!='D' && meio!='C' && meio!='R' && meio!='T') {
			System.out.print("forma de pagamento D-debito, C-credito, R-dinheiro ou CT-cartão Tabajara:");
			tipo = sc.next().charAt(0);
		}
		if(meio=='T') {
			desc = 0.05f*total_carne;
			total_carne = total_carne - desc;
		}
		for (int i=0; i<3; i++) {
			if (Icarne[i]!=0) {
				System.out.println(Icarne[i]+" kg de "+Scarne[i]+", valor total "+preco[i]);
			}
		}sc.close();
		System.out.println("tipo de pagamento:"+meio);
		System.out.printf("desconto: %.2f\n", (desc));
		System.out.println("valor final:"+total_carne);
		System.out.println();
}}