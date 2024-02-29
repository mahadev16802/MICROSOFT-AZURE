import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registration {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField pc1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegistration = new JLabel("REGISTRATION");
		lblRegistration.setForeground(Color.WHITE);
		lblRegistration.setFont(new Font("Verdana", Font.BOLD, 16));
		lblRegistration.setBounds(144, 11, 146, 20);
		frame.getContentPane().add(lblRegistration);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel_1.setBounds(33, 70, 86, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblPassword.setBounds(33, 101, 86, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblBranch = new JLabel("BRANCH");
		lblBranch.setForeground(Color.WHITE);
		lblBranch.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblBranch.setBounds(33, 132, 86, 14);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblGender.setBounds(33, 164, 86, 14);
		frame.getContentPane().add(lblGender);
		
		JLabel lblCity = new JLabel("CITY");
		lblCity.setForeground(Color.WHITE);
		lblCity.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblCity.setBounds(33, 196, 86, 14);
		frame.getContentPane().add(lblCity);
		
		tb1 = new JTextField();
		tb1.setColumns(10);
		tb1.setBounds(167, 70, 86, 20);
		frame.getContentPane().add(tb1);
		
		pc1 = new JPasswordField();
		pc1.setBounds(167, 99, 86, 22);
		frame.getContentPane().add(pc1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "ECE", "IT", "EEE"}));
		cb1.setBounds(167, 131, 86, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBackground(new Color(255, 0, 0));
		r1.setBounds(167, 163, 86, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBackground(new Color(255, 0, 255));
		r2.setBounds(255, 163, 86, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup rgb = new ButtonGroup();
		rgb.add(r1);
		rgb.add(r2);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"HYD", "CHENNAI", "MUMBAI", "BANGLORE"}));
		cb2.setBounds(167, 195, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton b1 = new JButton("SUBMIT");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = tb1.getText();
				String branch =(String) cb1.getSelectedItem();
				String city = (String) cb2.getSelectedItem();
				
				
				String gender = "";
				
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{
					gender="female";
				}
				JOptionPane.showMessageDialog(lblNewLabel , " name "+user+"\n branch "+branch+"\n city "+city+"\n gender "+gender);
				
				
			}
		});
		b1.setFont(new Font("Verdana", Font.BOLD, 11));
		b1.setBounds(167, 227, 86, 23);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\omline lab\\Downloads\\istockphoto-1367512711-612x612.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}

}
