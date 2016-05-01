/**
 * file: Statement.java
 * author: Mark Franceschini
 * course: CMPT 440
 * due date: May 2, 2016
 * version: 1.0
 */

/**
 * Statement class that contains a
 * string and two ints. This class
 * is used to determine what words
 * are colored.
 *
 */
public class Statement {
  String text;
  int start;
  int end;
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  public int getStart() {
    return start;
  }
  public void setStart(int start) {
    this.start = start;
  }
  public int getEnd() {
    return end;
  }
  public void setEnd(int end) {
    this.end = end;
  }
  

}
