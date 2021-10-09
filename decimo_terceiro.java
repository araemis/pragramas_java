package trabalho1;
import java.util.Scanner;
public class decimo_terceiro {
	public static void main(String[] args) {
		float IR=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("valor por hora trabalhada ");
		int horas = sc.nextInt();
		System.out.print("quantidade de horas trabalhadas no mês ");
		int horas_mes = sc.nextInt();
		int salario = horas * horas_mes;
		if(salario>0)
			if(salario<=900) 
				 IR = 0;
			else if (salario<=1500) 
				 IR = 0.05f;
			else if(salario<=2500)
				 IR = 0.1f;
			else 
				 IR = 0.2f;
		else 
			System.out.println("sálario incorreto");
		
		int 	ir = (int)(IR*100);
				IR = (IR*salario);
		float 	sind = (0.03f *salario);
		float 	INSS = (0.1f * salario);
		float 	fgts = (0.11f*salario);
		float 	desc = (IR+INSS+sind);
		float 	sal_liq = (salario-desc);
		System.out.println("Salário Bruto:"+"("+horas+"*"+horas_mes+"):R$"+salario);
		System.out.println("(-) IR("+ir+"%):R$"+IR);
		System.out.println("(-) Sindicato("+3+"%):R$"+sind);
		System.out.println("(-) INSS ("+10+"%) : R$"+INSS);
		System.out.println("FGTS ("+11+"%) : R$"+fgts);
		System.out.println("total de descontos:"+desc);
		System.out.println("Salário Liquido:"+sal_liq);
	sc.close();
	}}