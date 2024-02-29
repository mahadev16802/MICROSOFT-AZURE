import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;

public class Mahadev {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mahadev window = new Mahadev();
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
	public Mahadev() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel.setBounds(49, 54, 153, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblPassword.setBounds(49, 79, 153, 14);
		frame.getContentPane().add(lblPassword);
		bank h2=new bank();
		t1 = new JTextField();
		t1.setBounds(197, 54, 88, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(197, 79, 88, 20);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(new Color(255, 255, 128));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = t1.getText();
				String password = p1.getText();
				if(user.equals("avinash") && password.equals("1234"))
				{
					h2.setVisible(true);
					frame.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Login failed ,Tryagain");
				}
				
			}
		});
		btnNewButton.setBounds(196, 121, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblLoginPage = new JLabel ("SBI LOGIN PAGE");
		lblLoginPage.setForeground(new Color(255, 255, 128));
		lblLoginPage.setFont(new Font("Segoe UI Emoji", Font.BOLD, 19));
		lblLoginPage.setBounds(161, 11, 153, 32);
		frame.getContentPane().add(lblLoginPage);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\omline lab\\Downloads\\istockphoto-1367512711-612x612.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
