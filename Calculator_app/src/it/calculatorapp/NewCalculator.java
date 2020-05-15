package it.calculatorapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class NewCalculator {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton_2_ON;
	private JRadioButton rdbtnNewRadioButton_2_OFF;
	private JButton btnNewButton_1_0;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_2;
	private JButton btnNewButton_1_3;
	private JButton btnNewButton_1_4;
	private JButton btnNewButton_1_5;
	private JButton btnNewButton_1_6;
	private JButton btnNewButton_1_7;
	private JButton btnNewButton_1_8;
	private JButton btnNewButton_1_9;
	private JButton btnNewButton_2_clear;
	private JButton btnNewButton_2_backspace;
	private JButton btnNewButton_3_1;
	private JButton btnNewButton_3_2;
	private JButton btnNewButton_3_3;
	private JButton btnNewButton_3_4;
	private JButton btnNewButton_3_5;
	private JButton btnNewButton_puntodec;
	private JLabel lblNewLabel;

	double result, num;
	int calculation;
	
	/**
	 * Create the application.
	 */
	public NewCalculator() {
		initialize();
		
		rdbtnNewRadioButton_2_ON.setEnabled(false);	
	}
	
	
	public void arithmetic_operation() {
		
		switch(calculation) {
		
		case 1:
			result = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			break;
		case 2:
			result = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			break;
		case 3:
			result = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			break;
		case 4:
			result = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(result));
			break;
		}
	}
	
	

	public void enable() {
		
		textField.setEnabled(true);
		textField.setBackground(Color.WHITE);
		
		btnNewButton_1_0.setEnabled(true);
		btnNewButton_1_1.setEnabled(true);
		btnNewButton_1_2.setEnabled(true);
		btnNewButton_1_3.setEnabled(true);
		btnNewButton_1_4.setEnabled(true);
		btnNewButton_1_5.setEnabled(true);
		btnNewButton_1_6.setEnabled(true);
		btnNewButton_1_7.setEnabled(true);
		btnNewButton_1_8.setEnabled(true);
		btnNewButton_1_9.setEnabled(true);
		btnNewButton_2_clear.setEnabled(true);
		btnNewButton_2_backspace.setEnabled(true);
		btnNewButton_3_1.setEnabled(true);
		btnNewButton_3_2.setEnabled(true);
		btnNewButton_3_3.setEnabled(true);
		btnNewButton_3_4.setEnabled(true);
		btnNewButton_3_5.setEnabled(true);
		btnNewButton_puntodec.setEnabled(true);
		
		rdbtnNewRadioButton_2_ON.setEnabled(false);
		rdbtnNewRadioButton_2_OFF.setEnabled(true);
	}
	
	
	
	public void disable() {
		
		textField.setEnabled(false);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setText("");
		
		btnNewButton_1_0.setEnabled(false);
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_2.setEnabled(false);
		btnNewButton_1_3.setEnabled(false);
		btnNewButton_1_4.setEnabled(false);
		btnNewButton_1_5.setEnabled(false);
		btnNewButton_1_6.setEnabled(false);
		btnNewButton_1_7.setEnabled(false);
		btnNewButton_1_8.setEnabled(false);
		btnNewButton_1_9.setEnabled(false);
		btnNewButton_2_clear.setEnabled(false);
		btnNewButton_2_backspace.setEnabled(false);
		btnNewButton_3_1.setEnabled(false);
		btnNewButton_3_2.setEnabled(false);
		btnNewButton_3_3.setEnabled(false);
		btnNewButton_3_4.setEnabled(false);
		btnNewButton_3_5.setEnabled(false);
		btnNewButton_puntodec.setEnabled(false);
		
		rdbtnNewRadioButton_2_ON.setEnabled(true); // enable Button ON
		rdbtnNewRadioButton_2_OFF.setEnabled(false); // enable Button ON
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 387, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(24, 51, 323, 55);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(294, 13, 53, 26);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		/*-------------------- TASTI NUMERICI -------------------------*/
		// 0
		btnNewButton_1_0 = new JButton("0");
		btnNewButton_1_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+"0";
				textField.setText(number);
			}
		});
		btnNewButton_1_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_0.setBounds(24, 383, 76, 40);
		frame.getContentPane().add(btnNewButton_1_0);
		
		//1
		btnNewButton_1_1 = new JButton("1");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+"1";
				textField.setText(number);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(24, 323, 76, 40);
		frame.getContentPane().add(btnNewButton_1_1);
		
		//2
		btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+"2";
				textField.setText(number);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(107, 323, 76, 40);
		frame.getContentPane().add(btnNewButton_1_2);
		
		//3
		btnNewButton_1_3 = new JButton("3");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+"3";
				textField.setText(number);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_3.setBounds(189, 323, 76, 40);
		frame.getContentPane().add(btnNewButton_1_3);
		
		//4
		btnNewButton_1_4 = new JButton("4");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+"4";
				textField.setText(number);
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_4.setBounds(24, 263, 76, 40);
		frame.getContentPane().add(btnNewButton_1_4);
		
		//5
		btnNewButton_1_5 = new JButton("5");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+"5";
				textField.setText(number);
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_5.setBounds(107, 263, 76, 40);
		frame.getContentPane().add(btnNewButton_1_5);
		
		//6
		btnNewButton_1_6 = new JButton("6");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+"6";
				textField.setText(number);
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_6.setBounds(189, 263, 76, 40);
		frame.getContentPane().add(btnNewButton_1_6);
		
		//7
		btnNewButton_1_7 = new JButton("7");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+"7";
				textField.setText(number);
			}
		});
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_7.setBounds(24, 205, 76, 40);
		frame.getContentPane().add(btnNewButton_1_7);
		
		//8
		btnNewButton_1_8 = new JButton("8");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+"8";
				textField.setText(number);
			}
		});
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_8.setBounds(107, 205, 76, 40);
		frame.getContentPane().add(btnNewButton_1_8);
		
		//9
		btnNewButton_1_9 = new JButton("9");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+"9";
				textField.setText(number);
			}
		});
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_9.setBounds(189, 205, 76, 40);
		frame.getContentPane().add(btnNewButton_1_9);
		
		//10
		btnNewButton_puntodec = new JButton(".");
		btnNewButton_puntodec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		btnNewButton_puntodec.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_puntodec.setBounds(107, 383, 76, 40);
		frame.getContentPane().add(btnNewButton_puntodec);
		
		
		/*------------------------ TASTI FUNZIONI VARIE ---------------------*/
		
		//ON
		rdbtnNewRadioButton_2_ON = new JRadioButton("ON");
		rdbtnNewRadioButton_2_ON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enable();
			}
		});
		rdbtnNewRadioButton_2_ON.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonGroup_1.add(rdbtnNewRadioButton_2_ON);
		rdbtnNewRadioButton_2_ON.setBounds(24, 130, 76, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2_ON);
		
		//OFF
		rdbtnNewRadioButton_2_OFF = new JRadioButton("OFF");
		rdbtnNewRadioButton_2_OFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disable();
			}
		});
		rdbtnNewRadioButton_2_OFF.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonGroup_1.add(rdbtnNewRadioButton_2_OFF);
		rdbtnNewRadioButton_2_OFF.setBounds(24, 156, 76, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2_OFF);
		
		//C
		btnNewButton_2_clear = new JButton("C");
		btnNewButton_2_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_2_clear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_clear.setBounds(189, 139, 76, 40);
		frame.getContentPane().add(btnNewButton_2_clear);
						
		// <--		
		btnNewButton_2_backspace = new JButton("<--");
		btnNewButton_2_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int length = textField.getText().length();
				int number = textField.getText().length()-1;
				String store;
						
				if(length > 0) {
							
					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(number); // in number è contenuta la stringa - l'ultimo carattere
					store= back.toString(); // conevrto il contenuto di back di nuovo in una string chiamata store e poi
					textField.setText(store); // visualizzo la stringa store
					
				}
				textField.setText(textField.getText());
			}
		});		
		btnNewButton_2_backspace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_backspace.setBounds(107, 139, 76, 40);
		frame.getContentPane().add(btnNewButton_2_backspace);
			

		
		
		
		/*---------------------------- OPERATORI --------------------------*/
		
		//+
		btnNewButton_3_1 = new JButton("+");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 1;
				textField.setText("");
				lblNewLabel.setText(num + "+");		
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3_1.setBounds(271, 139, 76, 40);
		frame.getContentPane().add(btnNewButton_3_1);
		
		//-
		btnNewButton_3_2 = new JButton("-");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 2;
				textField.setText("");
				lblNewLabel.setText(num + "-");	
			}
		});
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3_2.setBounds(271, 205, 76, 40);
		frame.getContentPane().add(btnNewButton_3_2);
		
		//*
		btnNewButton_3_3 = new JButton("*");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 3;
				textField.setText("");
				lblNewLabel.setText(num + "*");	
			}
		});
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3_3.setBounds(271, 263, 76, 40);
		frame.getContentPane().add(btnNewButton_3_3);
		
		//(/)
		btnNewButton_3_4 = new JButton("/");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 4;
				textField.setText("");
				lblNewLabel.setText(num + "/");	
			}
		});
		btnNewButton_3_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3_4.setBounds(271, 323, 76, 40);
		frame.getContentPane().add(btnNewButton_3_4);
		
		//=
		btnNewButton_3_5 = new JButton("=");
		btnNewButton_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
				lblNewLabel.setText("");
			}
		});
		btnNewButton_3_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3_5.setBounds(189, 383, 158, 40);
		frame.getContentPane().add(btnNewButton_3_5);
		
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewCalculator window = new NewCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
