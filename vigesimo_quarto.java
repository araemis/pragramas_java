package trabalho1;
import java.util.Scanner;
public class vigesimo_quarto{
	public static void main(String[] args) {
		float media =0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<3; i ++) {
		System.out.print((i+1)+"� nota: ");
		int nota = sc.nextInt();
		media += nota;
		}
		media /= 3;
		
		if(media<7 && media>=0)
			System.out.println("Reprovado com m�dia: "+media);
		else if(media>=7 && media<10)
			System.out.println("Aprovado com m�dia: "+media);
		else if(media==10)
			System.out.println("Aprovado com Distin��o com m�dia: "+media);
		else 
			System.out.println("valores informados incorretamente");
		
		sc.close();
}}