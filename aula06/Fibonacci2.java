import static java.lang.System.*;

public class Fibonacci2 {

  public static void main(String[] args) {
    if (args.length < 1) {
      out.println("USO: java -ea Fibonacci N [N ...]");
      exit(1);
    }

    // Alguns testes:
    assert fibonacci(0) == 0;
    assert fibonacci(1) == 1;
    assert fibonacci(2) == 1;
    assert fibonacci(5) == 5;

    for(int i = 0; i < args.length; i++) {
      int n = Integer.parseInt(args[i]);
      long time = nanoTime();  // System.nanoTime() gives the time in ns.
      int f = fibonacci(n);
      time = nanoTime() - time;
      out.printf("fibonacci(%d) = %d (%d ns)\n", n, f, time);
    }
  }


	static int [] fibs = new int[47];
	
  public static int fibonacci(int n) {
    assert n >= 0;
    assert n < fibs.length;
    
    if(n==0)   fibs[n] = 0;
    
    else if (n==1) fibs[n] = 1;
    
    else if (fibs[n]==0)  fibs[n] = fibonacci(n-2)+fibonacci(n-1);
    
    return fibs[n];
  }

}