package trabalho1;
import java.util.Scanner;
public class visegimo_segundo{
	public static void main(String[] args) {
		int inteiro,cen,dez,uni;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite um número inteiro menor que 1000 ");
		inteiro = sc.nextInt();
		while(inteiro>=1000||inteiro<0) {
			System.out.print("digite um número inteiro menor que 1000:");
			inteiro = sc.nextInt();
		}
		cen = inteiro/100;
		dez = (inteiro%100)/10;
		uni = (inteiro%10)/1;
		if (cen==1) {
			System.out.print(cen+" centena");
		}else if (cen>=2 && cen<=9) {
			System.out.print(cen+" centenas");
		}
		if(cen!=0 && dez==0 && uni!=0) {
			System.out.print(" e ");
		}else if (cen!=0 && dez!=0 && uni==0) {
			System.out.print(" e ");
		}else if(cen!=0 && dez!=0 && uni!=0) {
			System.out.print(", ");
		}	
		if (dez==1) {
			System.out.print(dez+" dezena");
		}else if (dez>=2 && dez<=9) {
			System.out.print(dez+" dezenas");
		}
		if(cen!=0 && dez!=0 && uni!=0||cen==0 && dez!=0 && uni!=0) {
			System.out.print(" e ");
		}
		if (uni==1) {
			System.out.print(uni+" unidade");
		}else if (uni>=2 && uni<=9) {
			System.out.print(uni+" unidades");
	}sc.close();
	}}