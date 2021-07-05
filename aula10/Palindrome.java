import java.util.*;
import p2utils.Queue;
import p2utils.Stack;

public class Palindrome {
	public static void main(String [] args){
		boolean res = palindrome(" O galo nada no lago");
		System.out.print(res);
		
		}
	static boolean palindrome(String pal){
		Queue<Character> q = new Queue<Character>(); 
		Stack<Character> s = new Stack<Character>();
		
		for(int i=0;i<pal.length();i++){
			char c = Character.toLowerCase(pal.charAt(i));
			if(Character.isLetter(c) || Character.isDigit(c)){
				q.in(c);
				s.push(c);
				}
			}
		
		while(s.isEmpty() == false && q.isEmpty()==false){
			if(s.top() != q.peek()) return false;
			s.pop();
			q.out();
			
		}
		return true;
		
		
		}




	}
