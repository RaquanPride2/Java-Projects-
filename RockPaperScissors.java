/*RockPaperScissors.java
To run program:
javac RockPaperScissors.java
java RockPaperScissors
*/
import java.util.Random;
import java.util.Scanner; 

public class RockPaperScissors{
  public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
    while (true) {
      String[] rps = {"r", "p", "s"};
      String computerMove = rps[new Random().nextInt(rps.length)];
  
      //inputs 
      String playerMove;

      // the while loop allows us to play over and over
      while(true) {
      System.out.println("What is your move? Use (r, p, or s) to begin");
       playerMove = scanner.nextLine(); 
        if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
      break;
      }
        System.out.println(playerMove + "invalid move."); 
      }
  
      System.out.println("Computer played: " + computerMove);
  
      if (playerMove.equals(computerMove)) {
        System.out.println("This game was a tie!"); 
      }
        //win/lose conditions for choosing rock 
      else if (playerMove.equals("r")) {
        if (computerMove.equals("p")) {
          System.out.println("You lose!"); 
          
        } else if (computerMove.equals("s")){
          System.out.println("You win!"); 
        }
      }
  
        //win/lose conditions for choosing paper
      else if (playerMove.equals("p")) {
        if (computerMove.equals("r")) {
          System.out.println("You win!"); 
          
        } else if (computerMove.equals("s")){
          System.out.println("You lose!"); 
        }
      }
   
        //win/lose conditions for choosing scissors 
      else if (playerMove.equals("s")) {
        if (computerMove.equals("p")) {
          System.out.println("You win!"); 
          
        } else if (computerMove.equals("r")){
          System.out.println("You lose!"); 
        }
      }
       System.out.println("Play again? (y/n)");
    String playAgain = scanner.nextLine();

      if (!playAgain.equals("y")) {
        break;
      }

      }
   

    
  }
}
;