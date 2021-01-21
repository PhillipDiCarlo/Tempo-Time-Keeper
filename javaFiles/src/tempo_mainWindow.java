import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.Button;

public class tempo_mainWindow {

	private JFrame frame;
	private JTextField monthTextField;
	private JTextField dayTextField;
	private JTextField yearTextField;
	private JTextField codeTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tempo_mainWindow window = new tempo_mainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tempo_mainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 780, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel monthLabel = new JLabel("Enter Month: MM");
		monthLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		monthLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		monthLabel.setBounds(71, 13, 115, 14);
		frame.getContentPane().add(monthLabel);
		
		JLabel dayLabel = new JLabel("Enter Day: DD");
		dayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		dayLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		dayLabel.setBounds(276, 13, 115, 14);
		frame.getContentPane().add(dayLabel);
		
		JLabel yearLabel = new JLabel("Enter Year: YYY");
		yearLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		yearLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		yearLabel.setBounds(502, 13, 106, 14);
		frame.getContentPane().add(yearLabel);
		
		monthTextField = new JTextField();
		monthTextField.setBounds(201, 11, 86, 20);
		frame.getContentPane().add(monthTextField);
		monthTextField.setColumns(10);
		
		dayTextField = new JTextField();
		dayTextField.setBounds(406, 11, 86, 20);
		frame.getContentPane().add(dayTextField);
		dayTextField.setColumns(10);
		
		yearTextField = new JTextField();
		yearTextField.setBounds(623, 11, 86, 20);
		frame.getContentPane().add(yearTextField);
		yearTextField.setColumns(10);
		
		TextArea mainTextArea = new TextArea();
		mainTextArea.setBounds(27, 105, 380, 328);
		frame.getContentPane().add(mainTextArea);
		
		TextArea chargeCodeText = new TextArea();
		chargeCodeText.setBounds(423, 105, 331, 250);
		frame.getContentPane().add(chargeCodeText);
		
		JLabel lblTypeChargeCode = new JLabel("Search charge code here:");
		lblTypeChargeCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTypeChargeCode.setBounds(423, 373, 161, 14);
		frame.getContentPane().add(lblTypeChargeCode);
		
		JButton beginButton = new JButton("Begin");
		beginButton.setBounds(429, 38, 95, 36);
		frame.getContentPane().add(beginButton);
		
		codeTextField = new JTextField();
		codeTextField.setBounds(580, 371, 129, 20);
		frame.getContentPane().add(codeTextField);
		codeTextField.setColumns(10);
		
		JButton searchButton = new JButton("Search");
		searchButton.setBounds(580, 410, 95, 36);
		frame.getContentPane().add(searchButton);
		
		JButton todaysDateButton = new JButton("Today's Date");
		todaysDateButton.setBounds(267, 38, 95, 36);
		frame.getContentPane().add(todaysDateButton);
	}
}
