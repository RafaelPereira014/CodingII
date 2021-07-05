import java.io.*;
import java.util.scanner;

public class CopyFile {
	
	public static void main (String[] args) {
		//Criar in and out file
	
	if(args.length != 2){
		System.err.print("usage: java -ea CopyFile <source-file> <destination-file>");
		}
	if(args[0].equals(args[1])){
		System.err.print("Os ficheiros não podem ser iguais");
		}
		
	File in = new File(args[0]);
	File out = new File(args[1]);
	
	Scanner sc = new Scanner(in);
	PrintWriter pw = new PrintWriter(out);
	
	while(sc.hasNextLine()){
		pw.println(sc.nextLine);
		}
		
	sc.close();
	pw.close();
	
		
	}
}

