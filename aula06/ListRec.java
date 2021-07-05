import java.io.File;
import static java.lang.System.*;

public class ListRec {
	
	public static void main (String[] args) {
		if(args.length > 1){
			err.println("Uso : java -ea ListRec [<Ficheiro>]");
			exit(1);
		}
		
		File in;
		
		if(args.length == 1) in = new File(args[0]);
		else in = new File(".");
		
		
		if(!in.exists()){
			err.println("ERRO : O diretorio \""+args[0]+"\" nao existe!");
			exit(2);

		}
	}
	
	public static void listDir(String dirName){
	
	assert path !=null && path.exists();
	
	out.println(path.getPath());
	if (path.isDirectory() && path.canRead()){
		File[] list = path.listFiles();
		for(int k=0;k<list.length;k++){
			listDir(list[k]);
			}
		
		}
	}
}

