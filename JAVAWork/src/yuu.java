import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class yuu {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yuu window = new yuu();
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
	public yuu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(" MOVIE TICKETS");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(134, 40, 171, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" NAME:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(110, 90, 82, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setToolTipText("YOUR GOOD NAME");
		t1.setForeground(new Color(0, 0, 0));
		t1.setBounds(202, 87, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel(" MOVIE NAME:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(111, 130, 96, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel(" NUMBER OF TICKETS:");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2_1_1.setBounds(68, 155, 139, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setToolTipText("");
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		cb2.setBounds(202, 151, 86, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setToolTipText("");
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SAALAR", "RRR", "BAHUBALI2", "EAGLE", "KGF"}));
		cb1.setBounds(202, 121, 86, 22);
		frame.getContentPane().add(cb1);
		
		JButton b = new JButton("BOOK");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  name = t1.getText();
				String  moviename =(String) cb1.getSelectedItem();
				 
				String  tickets = (String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int res=0;
				res= JOptionPane.showConfirmDialog(b, " name "+name+"\n movie: "+moviename+"\n no of tickets "+tickets+"\n bill is"+nt*300);
				
				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(b, "booking confirmed");
				}
				else if(res==JOptionPane.NO_OPTION)
				{
					JOptionPane.showMessageDialog(b, "not confirmed");
				}
				else {
					JOptionPane.showMessageDialog(b, "CANCELLED");
				}
				
			}
			
		});
		b.setBounds(167, 195, 89, 23);
		frame.getContentPane().add(b);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("ENTER YOUR GOOD NAME");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\omline lab\\Downloads\\istockphoto-1367512711-612x612.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
