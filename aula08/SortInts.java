import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;

public class SortInts
{
  public static void main(String[] args) throws IOException {
    
   assert args.length>0;
    SortedListInt lista = new SortedListInt();  
    for(int i=0;i<args.length;i++){
		File file = new File (args[i]);
	  
		try{
			
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()){
				try {
				lista.insert(Integer.parseInt(sc.next()));
				}
				 catch(NumberFormatException e) {}
				}

		}
		catch(FileNotFoundException e){
			out.println("Ficheiro não encontrado");
			System.exit(0);
		}


	}
	
	while(lista.isEmpty() == false)
	for(int y=0; y<lista.size();y++){
		out.println(lista.first());
		lista.removeFirst();
		}

}
}

