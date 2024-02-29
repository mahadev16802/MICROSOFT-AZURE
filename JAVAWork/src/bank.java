import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bank {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bank window = new bank();
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
	public bank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("WITHDRAW :");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblUsername.setBounds(10, 145, 137, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblAccountNumber = new JLabel("DEPOSIT :");
		lblAccountNumber.setForeground(Color.WHITE);
		lblAccountNumber.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblAccountNumber.setBounds(10, 108, 137, 14);
		frame.getContentPane().add(lblAccountNumber);
		
		JLabel lblBankBalance = new JLabel("BANK BALANCE :");
		lblBankBalance.setForeground(Color.WHITE);
		lblBankBalance.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblBankBalance.setBounds(10, 73, 137, 14);
		frame.getContentPane().add(lblBankBalance);
		
		JLabel lblWelcomeUser = new JLabel("WELCOME USER");
		lblWelcomeUser.setForeground(new Color(255, 255, 255));
		lblWelcomeUser.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		lblWelcomeUser.setBounds(143, 11, 161, 36);
		frame.getContentPane().add(lblWelcomeUser);
		
		textField = new JTextField();
		textField.setBounds(172, 73, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 108, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(172, 145, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("BALANCE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(297, 72, 111, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDeposit = new JButton("DEPOSIT");
		btnDeposit.setBounds(297, 107, 111, 23);
		frame.getContentPane().add(btnDeposit);
		
		JButton btnWithdraw = new JButton("WITHDRAW");
		btnWithdraw.setBounds(297, 144, 111, 23);
		frame.getContentPane().add(btnWithdraw);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
	}
}
