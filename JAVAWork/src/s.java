import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class s {

	private JFrame frame;
	
	int items=0;
	int bill=0;
	int res=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					s window = new s();
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
	public s() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 582, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblECommerceApp = new JLabel(" E -COMMERCE APP");
		lblECommerceApp.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblECommerceApp.setBounds(179, 11, 192, 14);
		frame.getContentPane().add(lblECommerceApp);
		
		JLabel lblNewLabel_2_1 = new JLabel(" RS:200");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(202, 146, 73, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JButton j1 = new JButton(" BUY");
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res=JOptionPane.showConfirmDialog(j1, " Total no of items "+items+"\n Total bill is"+bill);

				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(j1, "booking confirmed");
				}
				else if(res==JOptionPane.NO_OPTION)
				{
					JOptionPane.showMessageDialog(j1, "not confirmed");
					
				}
				else {
					JOptionPane.showMessageDialog(j1, "CANCELLED");
				}
				
			}
		});
		j1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		j1.setBounds(233, 202, 89, 23);
		frame.getContentPane().add(j1);
		
		JLabel l1 = new JLabel(" CART");
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l1.setBounds(202, 265, 73, 14);
		frame.getContentPane().add(l1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				items=items+1;
				l1.setText("CART :"+items);
				bill=bill+200;
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\omline lab\\Downloads\\images (1).jpg"));
		btnNewButton_1.setBounds(10, 60, 182, 241);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				l1.setText("CART :"+items);	
				bill=bill+400;
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\omline lab\\Downloads\\download (2).jpg"));
		btnNewButton_1_1.setBounds(381, 60, 175, 241);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel(" RS:400");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(298, 147, 73, 14);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JButton b2 = new JButton(" CLEAR");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setText("CART :0");
				items=0;
				bill=0;
			}
		});
		b2.setBounds(285, 262, 73, 23);
		frame.getContentPane().add(b2);
	}
}
