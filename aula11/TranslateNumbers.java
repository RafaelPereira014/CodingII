import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import p2utils.*;

public class TranslateNumbers {
	public static void main(String[] args)throws IOException {
		KeyValueList<String> lst = new KeyValueList<String>();
		
		Scanner sc = new Scanner(new File("numbers.txt"));
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			String num = line.split(" - ")[0];
			String numTrad = line.split(" - ")[1];
			lst.set(num, numTrad);
		}
		sc.close();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lista de números: ");
		
		String list = input.nextLine();
		
		for(String s : list.split(" ")){
			try {
				System.out.print(lst.get(s) + "  ");
			} catch (NullPointerException e) {
				System.out.println("Número " + s + " não encontrado");
			}
		}
		
	}
}