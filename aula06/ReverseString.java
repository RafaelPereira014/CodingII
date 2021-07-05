import static java.lang.System.*;


public class ReverseString {
	
	public static void main (String[] args) {
	
	System.out.println(reverseString(args[0]));
	
	}
	
	public static String reverseString(String c){
	
	if(c.length()==0){
		return c;
	}
	
	return reverseString(c.substring(1))+c.charAt(0);
	}
}

