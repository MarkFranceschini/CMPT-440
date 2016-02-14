/**
 * file: driverDFA.java
 * author: Mark Franceschini
 * course: CMPT 440
 * due date: February 15, 2016
 * version: 1.0
 */


/**
 * driverDFA
 * This class takes in an arugment from the user in the
 * main method and then calls testSolution from the class
 * ManWolf with that argument. The user is then notified if
 * their input is valid.
 *
 */

public class driverDFA {
  public static void main(String[] args) throws java.lang.Exception {
    ManWolf man = new ManWolf();
    if(man.testSolution(args[0])) {
      System.out.println("That is a solution.");
    }else{
      System.out.println("That is not a solution");
    }
  }
}
