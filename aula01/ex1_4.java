import static java.lang.System.*;
import java.util.Scanner;

public class ex1_4 {
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String f;
		
		do{
			System.out.print("linha: ");
			f=sc.nextLine();
			f=traduzir(f);
		}while(f!=null);
			
		
		
	}
	
	public static String traduzir(String f)
	{
		Scanner sc=new Scanner(System.in);
		String traducao="";
		
		for(int i=0;i<f.length();i++){
				char t=f.charAt(i);
				if(t=='r' || t=='R');
				else if(t=='l') traducao+='u';
				else if(t=='L') traducao+='U';
				else traducao+=t;
				}
			System.out.println("Resultado: "+traducao);
			
			return traducao;
		}
		
		
		
	}
	


