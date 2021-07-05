
import static java.lang.System.*;
import java.util.Scanner;

public class PlayGuessGame2 {
  private static final Scanner scin = new Scanner(System.in);

  public static void help(GuessGame game) {
    assert game != null;
    out.printf("Find the secret number in range [%d,%d]!\n",
                game.min(), game.max());
    out.printf("Available commands:\n");
    out.printf("  <number>   (new attempt to guess secret)\n");
    out.printf("  count      (show current number of attempts)\n");
    //out.printf("  show       (show all attempts done)\n");
    out.printf("  help       (information on command usage)\n");
    out.printf("  quit       (exits the program)\n");
  }

  public static void main(String[] args) {
    if (args.length != 0 && args.length != 2) {
      out.println("Usage: PlayGuessGame [ <min> <max> ]");
      out.println("(by default range [0,20] is used)");
      exit(1);
    }
    int min = 0;
    int max = 20;
    if (args.length == 2) {
      min = Integer.parseInt(args[0]);
      max = Integer.parseInt(args[1]);
    }
    GuessGame game = new GuessGame(min, max);

    out.println();
    help(game);
    out.println();
    boolean okok = false;
    int n=0;
    while (!game.finished() || okok==false) {
      out.print("Command? ");
      String command = scin.next();
      out.println();
      switch (command) {
      case "quit":
        exit(1);
        break;
      case "help":
        help(game);
        break;
      case "count":
        count(game);
        break;
      default:
		//~ while (okok ==false) {
		
		try{
			n = Integer.parseInt(command);
			if (!(min <= n && n <= max)){
			System.err.printf("Value must be in range [%d, %d]\n", min, max);
			break;
		}
			okok =true;
		}
		catch (NumberFormatException e) {

			System.err.println("invalid input format");
			break;
		}
			//~ }
    	playGame(game, n);
        break;
      }
      out.println();
    }
    out.printf("Game finished in %d attempts\n", game.numAttempts());
  }
  
  public static void count (GuessGame game) {
	  out.println("Number of attempts: " + game.numAttempts()); 
  }
  
  public static void playGame (GuessGame game, int n) {
	  game.play(n);
	  if (game.attemptIsHigher()) {
		  out.println(n + " is too high!");
	  }
	  else if (game.attemptIsLower()) {
		  out.println(n + " is too low!");
	  }
  }
}
