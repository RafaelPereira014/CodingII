import p2utils.*;
import java.util.*;
import java.io.*;
import static java.lang.System.*;

class CheckPasswd {
	public static void main(String[] args)throws IOException  {
		Scanner sc = new Scanner(new File(args[0]));
		KeyValueList<String> lst = new KeyValueList<String>();
		while(sc.hasNextLine()){
			lst.set(sc.next(),sc.next());
		}
			Scanner ler = new Scanner(in);
			System.out.print("Login: ");
			String login = ler.nextLine();
			System.out.print("Pass: ");
			String pass1 = ler.nextLine();

			if(list.contains(login) && list.get(login).equals(pass)){
				System.out.print("Autenticação sucedida");
			}else{
				System.out.print("Autenticação negada");
		}

	}
}