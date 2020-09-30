//import necessary classes
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

/**
* This program generated a random number.
* using a user generated max value
*
* @author  Ben Falsetto
* @version 1.0
* @since   2020-09-30
*/
public class RollDice {
  
  /**
   * Main portion of code.
  */
  
  public static void main(String[] args) {
    
    //declare and initialize variables
    boolean invalid = true;
    int min = 0;
    int userMax = 0;
    
    //prompt the user for the max value
    System.out.println("Enter the maximum integer that could be generated");
    
    //get the user input and test whether it is a valid input
    while (invalid == true) {
      try {
        
        //create the scanner and get userMax
        Scanner input = new Scanner(System.in);
        userMax = input.nextInt();
        invalid = false;
      } catch (Exception e) {
        
        //tell the user that the input is invalid
        System.out.println("Selected value out of range, please enter an integer");
        invalid = true;
      }
    }
    
    //generate the random number
    int randVal = (int) (min + (Math.random() * userMax + 1));
    
    //tell the user what the random value is
    System.out.println("Random Value: " + randVal);
  }
}