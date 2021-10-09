package trabalho1;
import java.util.Scanner;
public class primeiro{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    System.out.print("1º número ");
	    int n1 = sc.nextInt();
	    System.out.print("2º número ");
	    int n2 = sc.nextInt();
	    if (n1 > n2) 
	    	System.out.println("maior número: "+n1);
	    else if(n1 < n2)
	    	System.out.println("maior número: "+n2);
	    else 
	    	System.out.println("os dois números são iguais");
	    sc.close();
	}
}