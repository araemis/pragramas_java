package trabalho1;
import java.util.Scanner;
public class setimo {
	public static void main(String[] args) {
		int num [] = new int [3];
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<3;i++) {
			System.out.print("digite o "+(i+1)+"º um número ");
			int n= sc.nextInt();
			if (i==0) {
				num [0]=n; //maior número.
				num [1]=n; //meio  número.
				num [2]=n; //menor número.
			}else if(n >num [0]) {
				num [1]=num [0];
				num [0]=n;
			}else if(n <num [2]) {
				num [1]=num [2];
				num [2]=n;
			}else {
				num [1]=n;
			}
		}sc.close();
			System.out.print(+num[0]+" "+num[1]+" "+num[2]);
	}}