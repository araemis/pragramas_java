package trabalho1;
import java.util.Scanner;
public class primeiro{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    System.out.print("1� n�mero ");
	    int n1 = sc.nextInt();
	    System.out.print("2� n�mero ");
	    int n2 = sc.nextInt();
	    if (n1 > n2) 
	    	System.out.println("maior n�mero: "+n1);
	    else if(n1 < n2)
	    	System.out.println("maior n�mero: "+n2);
	    else 
	    	System.out.println("os dois n�meros s�o iguais");
	    sc.close();
	}
}