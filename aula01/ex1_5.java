
import java.util.Scanner;

public class ex1_5 {
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int list,n=0;
		
		do{
			System.out.print("Lista de numeros: ");
			list=sc.nextInt();
			n++;
			list=contas(list,n);
		}while(lista!=0);
	}
	
	public static void contas(int list,int n)
	{
		
		double media;
		int soma;
		
		if(list==0){
			System.out.println("Soma=0");
			System.out.print("Não é possivel calcular a média.");
		}
		
		for(int i=0;i<n;i++){
			soma+=list[i];
			media=soma/n;
			}
		System.out.println("Soma: "+soma);
		System.out.print("Media: "+media);	
		
		
		
		
		
		
		
		
	}
}

