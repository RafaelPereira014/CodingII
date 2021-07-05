import java.util.Scanner;

public class ex1_1 {
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		double n,N;
		char op;
		double resultado=0;
		
		
		System.out.println("\nOperação a calcular");
		System.out.print("Numero: ");
		n=sc.nextDouble();
		System.out.print("Operador: ");
		op=sc.next().charAt(0);
		System.out.print("Numero: ");
		N=sc.nextDouble();
		
		System.out.println();
		
		if(op=='+') resultado=n+N;
		if(op=='-') resultado=n-N;
		if(op=='*') resultado=n*N;
		if(op=='/') resultado=n/N;
		
		System.out.print("Resultado: "+resultado);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

