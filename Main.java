 import java.util.Scanner;
/**
 *This program prompts the user to type in a positive number, and stops once a negative is entered
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for input 
    Scanner input = new Scanner(System.in);

    //decaler the integer variable
    int integer; 
    //question loop
    do{
    //prompt user for positive integer 
    System.out.println("Please enter a positive integer. Enter a negative integer to quit");
    integer = input.nextInt(); 
    //determine if integer is positive or negative
    if(integer < 0){
      System.out.println("Please enter a positive integer. Enter a negative integer to quit");
    }  

    } 

    while(integer > 0);
    //outside the loop means user exited
    System.out.println("All done!");
    
   
  

    
  }
}  
