package trabalho1;
import java.util.Scanner;
public class trigesimo_terceiro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] gab= new char[10];
		char [] suas= new char[10];
		int cont=0;
		String validade;
		int acertos=0;
		gab[0]='a';
		gab[1]='a';
		gab[2]='b';
		gab[3]='b';
		gab[4]='c';
		gab[5]='c';
		gab[6]='d';
		gab[7]='d';
		gab[8]='e';
		gab[9]='e';
		while(cont<10) {
			System.out.print("resposta da "+(cont+1)+"º questão ");
			suas [cont]= sc.next().charAt(0);
			cont++;}
		cont=0;
		while(cont<10) {
			if (suas[cont]==gab[cont]) {
				validade=":"+suas[cont]+": Correto";
				acertos++;
			}else {
				validade=":"+suas[cont]+": Errada, resposta Correto"+" ("+gab[cont]+")";
			}
			System.out.println("Q"+(cont+1)+validade);
			cont++;}
		System.out.println("Pontuação final: "+acertos);
		sc.close();
	}}