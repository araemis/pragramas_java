package trabalho1;
import java.util.Scanner;
public class decimo_segundo {
	public static void main(String[] args) {
		double sal,per=0,sal_aum,sal_final;
		Scanner sc = new Scanner(System.in);
		System.out.print("sal�rio entre 280,00 e 1500,00 ");
		sal = sc.nextInt();
		if (sal>0) {
			if(sal<=280)
				per = 0.2;
			else if (sal>280 && sal<700)
				per = 0.15;
			else if(sal>=700 && sal<1500)
				per = 0.1;
			else 
				per = 0.05;
			sal_aum = (sal*per);
			sal_final = (sal_aum+sal);
			System.out.println("s�lario inical R$"+sal);
			System.out.println("percentual de aumento aplicado R$"+per);
			System.out.println("valor do aumento R$"+sal_aum);
			System.out.println("sal�rio ap�s o aumento R$"+sal_final);
		}else 
			System.out.println("s�lario incorreto");
		sc.close();	

	}}