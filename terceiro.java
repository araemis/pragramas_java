package trabalho1;
import java.util.Scanner;
public class terceiro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu sexo F-Feminino ou M-Masculino ");
		String sexo = sc.nextLine();
		char val = sexo.charAt(0);
		int contar = sexo.length();
		boolean validar = true;
		if (contar==1) {
			if(val == 'F') {
				System.out.print(sexo+" - Feminino");	
				validar=false;
			}else if(val == 'M') {
				System.out.print(sexo+" - Masculino");
				validar=false;}
		}if(validar==true) {
			System.out.print("letra inválida");}
		sc.close();
	}}