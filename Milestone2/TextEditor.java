import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TextEditor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextEditor frame = new TextEditor();
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
	public TextEditor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea editor = new TextArea();
		editor.setBounds(149, 28, 535, 327);
		contentPane.add(editor);
		
		Button button = new Button("TEST BUTTOn");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// get string from textArea
				Validator vally = new Validator();
				System.out.println(vally.validateString(editor.getText()));
			}
		});
		button.setBounds(339, 386, 129, 24);
		contentPane.add(button);
	}
}
