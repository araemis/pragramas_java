package trabalho1;
import java.util.Scanner;
public class vigesimo_terceiro {
	public static void main(String[] args) {
		float media=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("idade do "+(i+1)+"º aluno ");
			int idade = sc.nextInt();
			media+=idade;
		}
		media /=3;
		if(media<25) {
			System.out.println("Turma Jovem");
		}else if(media>=25 && media<=40){
			System.out.println("Turma Adulta");
		}else {
			System.out.println("Turma Idosa");
		}sc.close();
	}}