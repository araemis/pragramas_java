package trabalho1;
import java.util.Scanner;
public class decimo_setimo {
	public static void main(String[] args) {
		char conceito=0;
		String resultado=null;
		Scanner sc = new Scanner(System.in);
		System.out.print("n1:");
		float n1 = sc.nextFloat();
		System.out.print("n2:");
		float n2 = sc.nextFloat();
		float media = (n1+n2)/2;
		if((n1>=0&&n1<=10)&&(n2>=0&&n2<=10)) {
			if(media >= 0 && media < 4){
				conceito = 'E';
				resultado = "REPROVADO";
			}else if(media >= 4 && media < 6){
				conceito = 'D';
				resultado = "REPROVADO";
			}else if(media >= 6 && media < 7.5){
				conceito = 'C';
				resultado = "APROVADO";
			}else if(media >=7.5 && media <= 9 ){
				conceito = 'B';
				resultado = "APROVADO";
			}else {
				conceito = 'A';
				resultado = "APROVADO";}
			System.out.println();
			System.out.println("notas:"+n1+", "+n2);
			System.out.println("média:"+media);
			System.out.println("=conceito:"+conceito +", "+resultado);
		}else {
			System.out.println("valor inválido");
		}
		sc.close();
	}}