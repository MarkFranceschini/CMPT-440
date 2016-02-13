/**
 * file: driverDFA.java
 * author: Mark Franceschini
 * course: CMPT 440
 * due date: February 15, 2016
 * version: 1.0
 */

import java.util.Scanner;

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
