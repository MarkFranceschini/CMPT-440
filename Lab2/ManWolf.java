/**
 * file: ManWolf.java
 * author: Mark Franceschini
 * course: CMPT 440
 * due date: February 15, 2016
 * version: 1.0
 */

public class ManWolf {
  // Defines all possible States
  private static final int Q_0 = 0;
  private static final int Q_1 = 1;
  private static final int Q_2 = 2;
  private static final int Q_3 = 3;
  private static final int Q_4 = 4;
  private static final int Q_5 = 5;
  private static final int Q_6 = 6;
  private static final int Q_7 = 7;
  private static final int Q_8 = 8;
  private static final int Q_9 = 9;
  private static final int Q_10 = 10;
  
  // Initializes state as Q_0
  private static int state = Q_0;
  
  // Create matrix
  private static int[][] delta = { { Q_10, Q_10, Q_1, Q_10 }, { Q_2, Q_10, Q_0, Q_10 },
    { Q_1, Q_3, Q_10, Q_5 }, { Q_10, Q_2, Q_4, Q_10 },
	{ Q_10, Q_10, Q_3, Q_7 }, { Q_10, Q_10, Q_6, Q_3 },
	{ Q_10, Q_7, Q_5, Q_10 }, { Q_8, Q_6, Q_10, Q_4 },
	{ Q_7, Q_10, Q_9, Q_10 }, { Q_10, Q_10, Q_9, Q_10 },
	{ Q_10, Q_10, Q_10, Q_10 } };
  /**
   * testSolution
   * This method takes in the user input as a String
   * it then 
   * @param String in
   * @return boolean
   */
  public boolean testSolution(String in){
    for (int i = 0; i < in.length(); i++) {
	  char c = in.charAt(i);
	  int second;
	  switch (c) {
	    case 'n': 
		  second = Q_0;
		  break;
		case 'w': 
		  second = Q_1;
		  break;
		case 'g': 
		  second = Q_2;
		  break;
		case 'c': 
		  second = Q_3;
		  break;
		default:
		  second = Q_10;
		  break;
	  }
	  try {
		state = delta[state][second];
	  } catch (ArrayIndexOutOfBoundsException ex) {
		state = Q_10;
	  }
	}
	if (state == Q_9) {
	  return true;
	} else {
	  return false;
	}
	  
    
  }
}
