package trabalho1;
import java.util.Scanner;
public class decimo_quinto {
	public static void main(String[] args) {
		String origem=null;
		Scanner sc = new Scanner(System.in);
		System.out.print("preço do produto ");
		int preco = sc.nextInt();
		System.out.print("origem: 1-Sul, 2-Norte 3-Leste, 4-Oeste, 5 ou 6-nordeste 7 ou 8-Centro-oeste ");
		int codigo = sc.nextInt();
		
		switch(codigo) {
		case 1:origem="Sul"; break;
		case 2:origem="Norte";break;
		case 3:origem="Leste";break;
		case 4:origem="Oeste";break;
		case 5:case 6:origem="nordeste";break;
		case 7:case 8:origem="Centro-oeste";break;
		default:origem="Importado";
		}
		System.out.println();
		System.out.println("Preço do produto: "+preco);
		System.out.print("Origem do produto: "+origem);
		sc.close();
}}