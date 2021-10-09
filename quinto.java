package trabalho1;
import java.util.Scanner;
public class quinto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		String letra = sc.nextLine();
		char vogal = letra.charAt(0);
		int contar = letra.length();
		boolean validar=true;
		if (contar == 1) {
			if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u') {
			System.out.println("vogal");
			validar=false;}
		}if(validar==true)
			System.out.println("não é vogal");
		sc.close();
	}
}