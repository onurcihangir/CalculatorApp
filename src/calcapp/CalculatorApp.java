package calcapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalculatorApp {

	private JFrame frmCalculator;
	
	double firstNum;
	double secondNum;
	double result;
	String operation;
	String answer;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp window = new CalculatorApp();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 340, 430);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 10, 306, 70);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
//		NUMBERS
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(136, 345, 59, 41);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn0.getText();
				textField.setText(enterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(73, 294, 59, 41);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn1.getText();
				textField.setText(enterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(136, 294, 59, 41);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn2.getText();
				textField.setText(enterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(199, 294, 59, 41);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn3.getText();
				textField.setText(enterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(73, 243, 59, 41);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn4.getText();
				textField.setText(enterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(136, 243, 59, 41);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn5.getText();
				textField.setText(enterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(199, 243, 59, 41);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn6.getText();
				textField.setText(enterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(73, 192, 59, 41);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(136, 192, 59, 41);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn8.getText();
				textField.setText(enterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(199, 192, 59, 41);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn9.getText();
				textField.setText(enterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn9);
		
//		OPERATIONS
		
		JButton btnDiv = new JButton("÷");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "÷";
			}
		});
		btnDiv.setBounds(262, 141, 59, 41);
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btnDiv);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setBounds(263, 243, 59, 41);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAdd.setBounds(263, 294, 59, 41);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btnAdd);
		
		JButton btnMul = new JButton("×");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "×";
			}
		});
		btnMul.setBounds(263, 192, 59, 41);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btnMul);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnMod.setBounds(199, 141, 59, 41);
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btnMod);
		
		JButton btnDel = new JButton("←");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bckspc = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					bckspc = strB.toString();
					textField.setText(bckspc);
				}
			}
		});
		btnDel.setBounds(263, 90, 59, 41);
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btnDel);
		
		JButton btnClear = new JButton("C");
		btnClear.setBounds(199, 90, 59, 41);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btnNeg = new JButton("±");
		btnNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(String.valueOf(textField.getText()));
				temp *= -1;
				textField.setText(String.valueOf(temp));
			}
		});
		btnNeg.setBounds(73, 345, 59, 41);
		btnNeg.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btnNeg);
		
		JButton btnComma = new JButton(",");
		btnComma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().contains(",")) {
					textField.setText(textField.getText() + btnComma.getText());
				}
			}
		});
		btnComma.setBounds(199, 345, 59, 41);
		btnComma.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btnComma);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "×") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "÷") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "%") {
					result = (firstNum/100) * secondNum ;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "xⁿ") {
					result = Math.pow(firstNum, secondNum);
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setBounds(263, 345, 59, 41);
		btnEqual.setForeground(Color.BLACK);
		btnEqual.setToolTipText("");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btnEqual);
		
		JButton btnSqrt = new JButton("√");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(String.valueOf(textField.getText()));
				temp = Math.sqrt(temp);
				textField.setText(String.valueOf(temp)); 
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSqrt.setBounds(136, 141, 59, 41);
		frmCalculator.getContentPane().add(btnSqrt);
		
		JButton btnPowTen = new JButton("10ⁿ");
		btnPowTen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(String.valueOf(textField.getText()));
				temp = Math.pow(10, temp);
				textField.setText(String.valueOf(temp));
			}
		});
		btnPowTen.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPowTen.setBounds(10, 243, 59, 41);
		frmCalculator.getContentPane().add(btnPowTen);
		
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(String.valueOf(textField.getText()));
				temp = Math.log10(temp);
				textField.setText(String.valueOf(temp));
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLog.setBounds(10, 294, 59, 41);
		frmCalculator.getContentPane().add(btnLog);
		
		JButton btnLn = new JButton("ln");
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(String.valueOf(textField.getText()));
				temp = Math.log(temp);
				textField.setText(String.valueOf(temp));
			}
		});
		btnLn.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLn.setBounds(10, 345, 59, 41);
		frmCalculator.getContentPane().add(btnLn);
		
		JButton btnDivX = new JButton("1/x");
		btnDivX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(String.valueOf(textField.getText()));
				temp = 1 / temp;
				textField.setText(String.valueOf(temp));
			}
		});
		btnDivX.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDivX.setBounds(73, 141, 59, 41);
		frmCalculator.getContentPane().add(btnDivX);
		
		JButton btnPowN = new JButton("xⁿ");
		btnPowN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "xⁿ";
			}
		});
		btnPowN.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPowN.setBounds(10, 192, 59, 41);
		frmCalculator.getContentPane().add(btnPowN);
		
		JButton btnPow2 = new JButton("x²");
		btnPow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(String.valueOf(textField.getText()));
				temp = Math.pow(temp, 2);
				textField.setText(String.valueOf(temp));
			}
		});
		btnPow2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPow2.setBounds(10, 141, 59, 41);
		frmCalculator.getContentPane().add(btnPow2);
		
		JComboBox cmbTrigonometry = new JComboBox();
		cmbTrigonometry.setBounds(10, 90, 185, 41);
		frmCalculator.getContentPane().add(cmbTrigonometry);
		cmbTrigonometry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cmbTrigonometry.getSelectedIndex() == 0) {
					double temp = Double.parseDouble(String.valueOf(textField.getText()));
					temp = Math.sin(temp);
					textField.setText(String.valueOf(temp));
				}
				else if(cmbTrigonometry.getSelectedIndex() == 1) {
					double temp = Double.parseDouble(String.valueOf(textField.getText()));
					temp = Math.cos(temp);
					textField.setText(String.valueOf(temp));
				}
				else if(cmbTrigonometry.getSelectedIndex() == 2) {
					double temp = Double.parseDouble(String.valueOf(textField.getText()));
					temp = Math.tan(temp);
					textField.setText(String.valueOf(temp));
				}
				else if(cmbTrigonometry.getSelectedIndex() == 3) {
					double temp = Double.parseDouble(String.valueOf(textField.getText()));
					temp = 1 / Math.sin(temp);
					textField.setText(String.valueOf(temp));
				}
				else if(cmbTrigonometry.getSelectedIndex() == 4) {
					double temp = Double.parseDouble(String.valueOf(textField.getText()));
					temp = 1 / Math.cos(temp);
					textField.setText(String.valueOf(temp));
				}
				else if(cmbTrigonometry.getSelectedIndex() == 5) {
					double temp = Double.parseDouble(String.valueOf(textField.getText()));
					temp = Math.asin(temp);
					textField.setText(String.valueOf(temp));
				}
				else if(cmbTrigonometry.getSelectedIndex() == 6) {
					double temp = Double.parseDouble(String.valueOf(textField.getText()));
					temp = Math.acos(temp);
					textField.setText(String.valueOf(temp));
				}
				else if(cmbTrigonometry.getSelectedIndex() == 7) {
					double temp = Double.parseDouble(String.valueOf(textField.getText()));
					temp = Math.atan(temp);
					textField.setText(String.valueOf(temp));
				}
				else if(cmbTrigonometry.getSelectedIndex() == 8) {
					double temp = Double.parseDouble(String.valueOf(textField.getText()));
					temp = 1 / Math.asin(temp);
					textField.setText(String.valueOf(temp));
				}
				else if(cmbTrigonometry.getSelectedIndex() == 9) {
					double temp = Double.parseDouble(String.valueOf(textField.getText()));
					temp = 1 / Math.acos(temp);
					textField.setText(String.valueOf(temp));
				}
			}
		});
		cmbTrigonometry.setFont(new Font("Tahoma", Font.BOLD, 14));
		cmbTrigonometry.setModel(new DefaultComboBoxModel(new String[] {"sin", "cos", "tan", "sec", "csc", "arcsin", "arccos", "arctan", "arcsec", "arccsc"}));
	}
}
