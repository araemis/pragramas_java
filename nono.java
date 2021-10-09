package trabalho1;
import java.util.Scanner;
public class nono {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float calc=0;
		String ideal=null;
		String sex=null;
		System.out.print("altura em cm ");
		short alt = sc.nextShort();
		System.out.print("peso em kg ");
		short peso = sc.nextShort();
		System.out.print("sexo, h-homem ou m-mulher ");
		char sexo = sc.next().charAt(0);
		if (sexo=='h'||sexo=='m') {
			if (sexo == 'h') {
				sex="homem";
				calc = (72.7F*alt/100)-58;
			}else if (sexo =='m'){
				sex="mulher";
				calc = (62.1F*alt/100)-44.7F;
			}
			if (calc > peso){
				ideal = "você está abaixo do peso ideal";
			}else if(calc < peso){
				ideal = "você está acima do peso ideal";
			}else {
				ideal = "você está no peso ideal";}
			System.out.println("altura: "+alt+" cm");
			System.out.println("peso: "+peso+" kg");  
			System.out.println("sexo: "+sex);
			System.out.printf("peso ideal: %.2f",calc);
			System.out.println();
			sc.close();
			System.out.println(ideal);
	}else 
		System.out.println("valor invalido");
	}}