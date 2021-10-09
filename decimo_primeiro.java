package trabalho1;
import java.util.Scanner;
public class decimo_primeiro {
	public static void main(String[] args) {
		char turno;
		Scanner sc = new Scanner(System.in);
		System.out.print("em que turno você estuda, M-Matutino ou V-Vespertino ou N- Noturno ");
		turno = sc.next().charAt(0);
		if (turno == 'M') {
			System.out.print("Bom dia!");
		}else if (turno == 'V') {
			System.out.print("boa tarde!");
		}else if(turno == 'N'){
			System.out.print("Boa noite!");
		}else {
			System.out.print("Informção incorretamente");
		}sc.close();	
	}}