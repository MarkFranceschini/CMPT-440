import java.util.ArrayList;

/**
 * file: Validator.java
 * author: Mark Franceschini
 * course: CMPT 440
 * due date: May 2, 2016
 * version: 1.0
 */

/**
 * This file creates a matrix from the DFA
 * created in milestone 2. It then traverses
 * the matrix and returns an ArrayList of type
 * matrix. This ArrayList is used in Editor.java
 */
public class Validator {
  // State definitions
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
  private static final int Q_11 = 11;
  private static final int Q_12 = 12;
  private static final int Q_13 = 13;
  private static final int Q_14 = 14;
  private static final int Q_15 = 15;
  private static final int Q_16 = 16;
  private static final int Q_17 = 17;
  private static final int Q_18 = 18;
  private static final int Q_19 = 19;
  private static final int Q_20 = 20;
  private static final int Q_21 = 21;
  private static final int Q_22 = 22;
  private static final int Q_23 = 23;
  private static final int Q_24 = 24;
  private static final int Q_25 = 25;
  private static final int Q_26 = 26;
  private static final int Q_27 = 27;
  private static final int Q_28 = 28;
  private static final int Q_29 = 29;
  private static final int Q_30 = 30;
  private static final int Q_31 = 31;
  private static final int Q_32 = 32;
  private static final int Q_33 = 33;
  private static final int Q_34 = 34;
  private static final int Q_35 = 35;
  private static final int Q_36 = 36;
  private static final int Q_37 = 37;
  private static final int Q_38 = 38;
  private static final int Q_39 = 39;
  private static final int Q_40 = 40;
  private static final int Q_41 = 41;
  private static final int Q_42 = 42;
  private static final int Q_43 = 43;
  private static final int Q_44 = 44;
  private static final int Q_45 = 45;
  private static final int Q_46 = 46;
  private static final int Q_47 = 47;
  private static final int Q_48 = 48;
  private static final int Q_49 = 49;
  private static final int Q_50 = 50;
  private static final int Q_51 = 51;
  private static final int Q_52 = 52;
  private static final int Q_53 = 53;
  private static final int Q_54 = 54;
  private static final int Q_55 = 55;
  private static final int Q_56 = 56;
  private static final int Q_57 = 57;
  private static final int Q_58 = 58;
  private static final int Q_59 = 59;
  private static final int Q_60 = 60;
  private static final int Q_61 = 61;
  private static final int Q_62 = 62;

  // Initializes state as Q_0
  private static int state = Q_0;

  // Create DFA matrix
  private static int[][] delta = {
      { Q_43, Q_62, Q_1, Q_43, Q_43, Q_43, Q_43, Q_62, Q_62, Q_27, Q_62, Q_62,
          Q_62, Q_38, Q_43, Q_62, Q_62 },
      { Q_62, Q_43, Q_62, Q_2, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_3, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_4, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_5, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_6, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_7, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_8, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_16, Q_62, Q_16, Q_16, Q_16, Q_16, Q_16, Q_62, Q_62, Q_62, Q_62, Q_9,
          Q_62, Q_62, Q_62, Q_19, Q_62 },
      { Q_62, Q_10, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_11, Q_11, Q_11, Q_11, Q_11, Q_11, Q_11, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_11, Q_11, Q_62, Q_62 },
      { Q_11, Q_12, Q_11, Q_11, Q_11, Q_11, Q_11, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_11, Q_11, Q_62, Q_62 },
      { Q_11, Q_11, Q_11, Q_11, Q_11, Q_11, Q_11, Q_62, Q_62, Q_62, Q_62, Q_13,
          Q_62, Q_11, Q_11, Q_62, Q_62 },
      { Q_62, Q_14, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_15, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_43, Q_62, Q_1, Q_43, Q_43, Q_43, Q_43, Q_62, Q_62, Q_27, Q_62, Q_62,
          Q_62, Q_38, Q_43, Q_62, Q_62 },
      { Q_62, Q_17, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_18, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_20, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_21, Q_62, Q_62, Q_62,
          Q_22, Q_62, Q_62, Q_62, Q_62 },
      { Q_43, Q_62, Q_1, Q_43, Q_43, Q_43, Q_43, Q_62, Q_62, Q_27, Q_62, Q_62,
          Q_62, Q_38, Q_43, Q_62, Q_62 },
      { Q_62, Q_23, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_24, Q_62, Q_24, Q_24, Q_24, Q_24, Q_24, Q_62, Q_62, Q_62, Q_62, Q_9,
          Q_62, Q_24, Q_24, Q_19, Q_62 },
      { Q_62, Q_25, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_26, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_43, Q_62, Q_1, Q_43, Q_43, Q_43, Q_43, Q_62, Q_62, Q_27, Q_62, Q_62,
          Q_62, Q_38, Q_43, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_28, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_29, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_30,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_31, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_32, Q_32, Q_32, Q_32, Q_32, Q_32, Q_32, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_32, Q_32, Q_62, Q_62 },
      { Q_32, Q_33, Q_32, Q_32, Q_32, Q_32, Q_32, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_32, Q_32, Q_62, Q_62 },
      { Q_32, Q_32, Q_32, Q_32, Q_32, Q_32, Q_32, Q_62, Q_62, Q_62, Q_62, Q_34,
          Q_62, Q_32, Q_32, Q_62, Q_62 },
      { Q_62, Q_35, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_36, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_37, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_43, Q_62, Q_1, Q_43, Q_43, Q_43, Q_43, Q_62, Q_62, Q_27, Q_62, Q_62,
          Q_62, Q_38, Q_43, Q_62, Q_62 },
      { Q_62, Q_43, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_39, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_40, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_41, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_42, Q_62, Q_42, Q_42, Q_42, Q_42, Q_42, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_42, Q_42, Q_62, Q_62 },
      { Q_43, Q_62, Q_1, Q_43, Q_43, Q_43, Q_43, Q_62, Q_62, Q_27, Q_62, Q_62,
          Q_62, Q_38, Q_43, Q_62, Q_62 },
      { Q_62, Q_44, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_45 },
      { Q_62, Q_46, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_47, Q_62, Q_47, Q_47, Q_47, Q_47, Q_47, Q_62, Q_62, Q_62, Q_62, Q_48,
          Q_62, Q_47, Q_47, Q_53, Q_62 },
      { Q_43, Q_62, Q_1, Q_43, Q_43, Q_43, Q_43, Q_62, Q_62, Q_27, Q_62, Q_62,
          Q_62, Q_38, Q_43, Q_62, Q_62 },
      { Q_62, Q_49, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_50, Q_50, Q_50, Q_50, Q_50, Q_50, Q_50, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_50, Q_50, Q_62, Q_62 },
      { Q_50, Q_51, Q_50, Q_50, Q_50, Q_50, Q_50, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_50, Q_50, Q_62, Q_62 },
      { Q_50, Q_50, Q_50, Q_50, Q_50, Q_50, Q_50, Q_62, Q_62, Q_62, Q_62, Q_52,
          Q_62, Q_50, Q_50, Q_62, Q_62 },
      { Q_43, Q_62, Q_1, Q_43, Q_43, Q_43, Q_43, Q_62, Q_62, Q_27, Q_62, Q_62,
          Q_62, Q_38, Q_43, Q_62, Q_62 },
      { Q_43, Q_54, Q_1, Q_43, Q_43, Q_43, Q_43, Q_62, Q_62, Q_27, Q_62, Q_62,
          Q_62, Q_38, Q_43, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_55, Q_62, Q_62, Q_62, Q_62 },
      { Q_62, Q_56, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_57, Q_62, Q_57, Q_57, Q_57, Q_57, Q_57, Q_62, Q_62, Q_62, Q_62, Q_58,
          Q_62, Q_57, Q_57, Q_53, Q_62 },
      { Q_43, Q_62, Q_1, Q_43, Q_43, Q_43, Q_43, Q_62, Q_62, Q_27, Q_62, Q_62,
          Q_62, Q_38, Q_43, Q_62, Q_62 },
      { Q_62, Q_59, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 },
      { Q_59, Q_60, Q_59, Q_59, Q_59, Q_59, Q_59, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_59, Q_59, Q_62, Q_62 },
      { Q_59, Q_59, Q_59, Q_59, Q_59, Q_59, Q_59, Q_62, Q_62, Q_62, Q_62, Q_61,
          Q_62, Q_59, Q_59, Q_62, Q_62 },
      { Q_43, Q_62, Q_1, Q_43, Q_43, Q_43, Q_43, Q_62, Q_62, Q_27, Q_62, Q_62,
          Q_62, Q_38, Q_43, Q_62, Q_62 },
      { Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62, Q_62,
          Q_62, Q_62, Q_62, Q_62, Q_62 }

  };
  // return an array of object
  // this object will contain a statment type eg string int comment...
  // it will also contain where in the line the statment begins and ends
  // can use this along with the math from the line to change text of individual words
  /**
   * @param in
   * @return ArrayList of Statements
   * Method that traverses the matrix
   * returns an ArrayList of Statements
   * depending on which points of the matrix
   * are traversed.
   */
  public ArrayList<Statement> validateString(String in) {
    ArrayList<Statement> statments = new ArrayList<>();
    state = Q_0;
    int start = -1;
    int end = -1;
    String type = null;
    for (int i = 0; i < in.length(); i++) {
      char c = in.charAt(i);
      int second = 0;
      switch (c) {
      case 'b':
      case 'c':
      case 'd':
      case 'e':
      case 'f':
      case 'g':
      case 'h':
      case 'j':
      case 'k':
      case 'l':
      case 'm':
      case 'o':
      case 'q':
      case 's':
      case 'u':
      case 'w':
      case 'x':
      case 'y':
      case 'z':
        second = Q_0;
        break;
      case ' ':
        second = Q_1;
        break;
      case 'p':
        second = Q_2;
        break;
      case 'r':
        second = Q_3;
        break;
      case 'i':
        second = Q_4;
        break;
      case 'n':
        second = Q_5;
        break;
      case 't':
        second = Q_6;
        break;
      case '(':
        second = Q_7;
        break;
      case ')':
        second = Q_8;
        break;
      case '*':
        second = Q_9;
        break;
      case '-':
        second = Q_10;
        break;
      case '"':
        second = Q_11;
        break;
      case '+':
        second = Q_12;
        break;
      case 'v':
        second = Q_13;
        break;
      case 'a':
        second = Q_14;
        break;
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        second = Q_15;
        break;
      case '=':
        second = Q_16;
        break;
      }
      // need to check that states here to look for indiviual expressino within the line;
      
      try {
        state = delta[state][second];
      } catch (ArrayIndexOutOfBoundsException ex) {
        state = Q_62;
      }
      switch (state){
      case Q_9:
      case Q_48:
      case Q_58:
        start = i;
        type = "string";
        break;
      case Q_13:
      case Q_52:
      case Q_61:
        end = i;
        break;
      case Q_19:
      case Q_53:
        type = "number";
        start = end = i;
        break;
      case Q_27:
        type = "comment";
        start = i;
        break;
      case Q_37:
        end = i;
        break;
      case Q_62:
        start = 666;
        end = 666;
        type = "error";
      }
      if (start != -1 && end != -1){
        Statement newStatement = new Statement();
        newStatement.setStart(start);
        newStatement.setEnd(end);
        newStatement.setText(type);
        statments.add(newStatement);
        start = -1;
        end = -1;
      }
    }
    return statments;
  }
}
