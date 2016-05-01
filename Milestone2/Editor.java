import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
/**
 * file: Editor.java
 * author: Mark Franceschini
 * course: CMPT 440
 * due date: May 2, 2016
 * version: 1.0
 */
public class Editor extends JFrame {
  StyledDocument doc = new DefaultStyledDocument();
  private JPanel contentPane;
  private final JTextPane textEditor = new JTextPane(doc);

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Editor frame = new Editor();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Editor() {
    jbInit();
  }

  private void jbInit() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 811, 531);
    
    setJMenuBar(menuBar);
    
    menuBar.add(mnPreferences);
    mntmAbyss.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        do_mntmAbyss_actionPerformed(e);
      }
    });
   
    
    mnPreferences.add(mntmAbyss);
    mntmOrignal.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        do_mntmOrignal_actionPerformed(e);
      }
    });
    
    mnPreferences.add(mntmOrignal);
    mntmCoffee.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        do_mntmCoffee_actionPerformed(e);
      }
    });
    
    mnPreferences.add(mntmCoffee);
    mntmSolarizedLight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        do_mntmSolarizedLight_actionPerformed(e);
      }
    });
    
    mnPreferences.add(mntmSolarizedLight);
    mntmFengshui.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        do_mntmFengshui_actionPerformed(e);
      }
    });
    
    mnPreferences.add(mntmFengshui);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    scrollPane.setBounds(49, 13, 674, 425);
    
    contentPane.add(scrollPane);
        textEditor.setFont(new Font("Tahoma", Font.PLAIN, 29));
        textEditor.setBackground(Color.WHITE);
        scrollPane.setViewportView(textEditor);
    
        textEditor.addKeyListener(new KeyAdapter() {
          @Override
          public void keyPressed(KeyEvent e) {
            do_textEditor_keyPressed(e);
          }
        });

    textEditor.setForeground(Color.BLACK);
    textEditor.setSelectedTextColor(Color.BLACK);
  }

  // Set color variables
  Color stringColor = Color.BLUE;
  Color numColor = Color.GREEN;
  Color commentColor = Color.ORANGE;
  Color errorColor = Color.RED;
  Color defualtColor = Color.BLACK;
  /**
   * @param start
   * @param end
   * @param c
   * Method that changes the color of
   * key words such as strings nums and
   * comments
   */
  private void colorChange(int start, int end, Color c) {
    SimpleAttributeSet set = new SimpleAttributeSet();
    StyleConstants.setForeground(set, c);
    doc.setCharacterAttributes(start, (end - start) + 1, set, true);
    // Reset text to black
    StyleContext sc = StyleContext.getDefaultStyleContext();
    AttributeSet bset = sc.addAttribute(SimpleAttributeSet.EMPTY,
        StyleConstants.Foreground, Color.BLACK);
    textEditor.setCharacterAttributes(bset, false);

  }
  /**
   * 
   * @param textToChange
   * @return array of statements
   * Method that takes in string Array
   * and creates an array of Statements
   * using the strings length
   */
  private Statement[] createStatement(String[] textToChange) {
    Statement[] temp = new Statement[textToChange.length];
    int start = 0;
    int end = 0;
    for (int i = 0; i < textToChange.length; i++) {
      start = end;
      end = 0;
      end = start + textToChange[i].length() + 1;
      Statement state = new Statement();
      state.setStart(start);
      state.setEnd(end);
      state.setText(textToChange[i]);
      temp[i] = state;
    }
    return temp;
  }

  // Creates timer
  Timer validateTimer = new Timer();
  private final JScrollPane scrollPane = new JScrollPane();
  private final JMenuBar menuBar = new JMenuBar();
  private final JMenu mnPreferences = new JMenu("Preferences");
  private final JMenuItem mntmAbyss = new JMenuItem("Abyss");
  private final JMenuItem mntmOrignal = new JMenuItem("Orignal");
  private final JMenuItem mntmCoffee = new JMenuItem("Coffee");
  private final JMenuItem mntmSolarizedLight = new JMenuItem("Solarized Light");
  private final JMenuItem mntmFengshui = new JMenuItem("Fengshui");

  /**
   * @param e
   * Action method that occurs
   * when key is pressed
   * works with a timer so that
   * it is not constantly changing color
   * of text before user is done typing.
   */
  protected void do_textEditor_keyPressed(KeyEvent e) {
    // Ensures that all next text shows up as black
    SimpleAttributeSet set = new SimpleAttributeSet();
    StyleConstants.setForeground(set, defualtColor);
    doc.setCharacterAttributes(textEditor.getDocument().getLength(), 0, set, true);
    
    validateTimer.cancel();
    TimerTask task = new TimerTask() {
      private int i = 0;
      @Override
      public void run() {
        colorSorter(i);
        i++;
      }
    };
    validateTimer = new Timer();
    validateTimer.scheduleAtFixedRate(task, 0, 750);

  }
  /**
   * @param b
   * makes instance of Validator class and then
   * calls the validateString method on the
   * text currently in the editor
   * the sorts the text by type and calls the 
   * changeColor method 
   */
  public void colorSorter(int b){
    if (b == 1) {
      Validator vally = new Validator();
      // Split string into an array splits by new line
      String[] temp = textEditor.getText().split("\\r?\\n");
      Statement[] statementsArray = createStatement(temp);
      ArrayList<Statement> returnStates = new ArrayList<>();
      // Loop through the array of lines validating each line
      for (int i = 0; i < statementsArray.length; i++) {
        returnStates = vally.validateString(statementsArray[i].getText());
        for(int a = 0; a < returnStates.size();a++){
          switch (returnStates.get(a).getText()) {
          case "string":
            colorChange(statementsArray[i].getStart() + returnStates.get(a).getStart(),
                statementsArray[i].getStart() + returnStates.get(a).getEnd(), stringColor);
            break;
          case "number":
            colorChange(statementsArray[i].getStart() + returnStates.get(a).getStart(),
                statementsArray[i].getStart() + returnStates.get(a).getEnd(), numColor);
            break;
          case "comment":
            colorChange(statementsArray[i].getStart() + returnStates.get(a).getStart(),
                statementsArray[i].getStart() + returnStates.get(a).getEnd(), commentColor);
            break;
          case "error":
            colorChange(statementsArray[i].getStart(),
                statementsArray[i].getEnd() -1 , errorColor);
            break;
          }
        }
        
        int len = textEditor.getDocument().getLength();
        textEditor.setCaretPosition(len);
      }
    }

  }
  // Abyss theme
  protected void do_mntmAbyss_actionPerformed(ActionEvent e) {
    textEditor.setBackground(new Color(0, 51, 102));
    stringColor = new Color (102, 255, 51);
    numColor = new Color(255, 0, 102);
    commentColor = new Color(255, 204, 0);
    colorSorter(1);
  }
  // Orignal theme
  protected void do_mntmOrignal_actionPerformed(ActionEvent e) {
    textEditor.setBackground(Color.WHITE);
    stringColor = Color.BLUE;
    numColor = Color.GREEN;
    commentColor = Color.ORANGE;
    colorSorter(1);
  }
  // Coffee theme
  protected void do_mntmCoffee_actionPerformed(ActionEvent e) {
    textEditor.setBackground(new Color (111, 78, 55));
    stringColor = new Color (50, 71, 38);
    numColor = new Color (105, 44, 37);
    commentColor = new Color (56, 89, 112);
    colorSorter(1);
  }
  // Solarized light theme
  protected void do_mntmSolarizedLight_actionPerformed(ActionEvent e) {
    textEditor.setBackground(new Color (255, 218, 179));
    stringColor = new Color (230, 0, 172);
    numColor = new Color (179, 179, 0);
    commentColor = new Color (0, 102, 255);
    colorSorter(1);
  }
  // Fengshui theme
  protected void do_mntmFengshui_actionPerformed(ActionEvent e) {
    textEditor.setBackground(new Color (64, 64, 64));
    stringColor = new Color (51, 102, 153);
    numColor = new Color (153, 0, 153);
    commentColor = new Color (255, 102, 0);
    colorSorter(1);
  }
}
