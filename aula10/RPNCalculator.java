import static java.lang.System.*;
import java.util.Scanner;
import p2utils.*;

public class RPNCalculator {
	
	public static void main(String[] args){
		Stack<Double> stack = new Stack();
		Scanner sc = new Scanner(in);
		
		while(sc.hasNext()){
			String s = sc.next();
			
			try {
				if(s.equals("+")){
					double a = stack.top();
					stack.pop();
					double b = stack.top();
					stack.pop();
					stack.push(b+a);
					}
				else if (s.equals("-")) {
					double a = stack.top();
					stack.pop();
					double b = stack.top();
					stack.pop();
					stack.push(b-a);
				}
				else if (s.equals("*")) {
					double a = stack.top();
					stack.pop();
					double b = stack.top();
					stack.pop();
					stack.push(b*a);
				}
				else if (s.equals("/")) {
					double a = stack.top();
					stack.pop();
					double b = stack.top();
					stack.pop();
					stack.push(b/a);
				}
				else if (s.equals("%")) {
					double a =stack.top();
					stack.pop();
					double b = stack.top();
					stack.pop();
					stack.push(b%a);
				}
				else {
					stack.push(Double.parseDouble(s));
				}
			}catch(NullPointerException e){
							out.println("ERROR: one operand missing!");
							exit(1);
						}catch(NumberFormatException e){
							out.println("ERROR: invalid operator!");
							exit(2);
						}
			}
	
	}





}
