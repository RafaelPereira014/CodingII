import static java.lang.System.*;
import java.util.Scanner;

public class TestComplex {
  // Exemplo simples de utilização da class Complex
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    double re=0,im=0;
    
    if(args.length==0){
		System.out.print("Re: ");
		re=sc.nextDouble();
		System.out.print("Im: ");
		im=sc.nextDouble();
	}else if(args.length==1){
		re=Double.parseDouble(args[0]);
		im=0;
	}else if(args.length==2){
		re=Double.parseDouble(args[0]);
		im=Double.parseDouble(args[1]);
	}else{
		System.out.print("Erro.");
		}
	 Complex a = new Complex(re,im);
    // Vamos usar métodos do objeto a
    out.printf("(%.2f+%.2fi)\n", a.real(), a.imag());
    out.println("  parte real = " + a.real());
    out.println("  parte imaginaria = " + a.imag());
    out.println("  modulo = " + a.abs());
    out.printf("  argumento = %.2f\n", a.arg());
    
   
  }

}
