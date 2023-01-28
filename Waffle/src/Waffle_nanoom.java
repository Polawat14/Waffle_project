import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Waffle_nanoom extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Waffle_nanoom frame = new Waffle_nanoom();
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
	public Waffle_nanoom() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\D4bby\\Downloads\\0d1e70fd160476a3f78496be79e0813e.png"));
		setTitle("Waffle Nanoom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(254, 251, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Waffle Nanoom");
		lblNewLabel.setForeground(new Color(255, 132, 72));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Yu Mincho", Font.BOLD, 60));
		lblNewLabel.setBounds(221, 41, 473, 137);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Yu Mincho", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(255, 132, 72));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(137, 531, 194, 52);
		contentPane.add(btnNewButton);
		
		JLabel lblQueue = new JLabel("Queue : 1");
		lblQueue.setForeground(new Color(255, 132, 72));
		lblQueue.setFont(new Font("Yu Mincho", Font.BOLD, 24));
		lblQueue.setBounds(746, 10, 130, 52);
		contentPane.add(lblQueue);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\D4bby\\Downloads\\0d1e70fd160476a3f78496be79e0813e.png"));
		lblNewLabel_1.setBounds(268, 145, 527, 376);
		contentPane.add(lblNewLabel_1);
		
		JButton btnClose = new JButton("Close");
		btnClose.setVerticalAlignment(SwingConstants.BOTTOM);
		btnClose.setForeground(new Color(255, 132, 72));
		btnClose.setFont(new Font("Yu Mincho", Font.BOLD, 20));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(573, 531, 194, 52);
		contentPane.add(btnClose);
	}
}
