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

public class Waffle6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Waffle6 frame = new Waffle6();
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
	public Waffle6() {
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
		
		JButton btnNewButton = new JButton("Check bill");
		btnNewButton.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		btnNewButton.setForeground(new Color(255, 132, 72));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(444, 574, 194, 52);
		contentPane.add(btnNewButton);
		
		JLabel lblQueue = new JLabel("Queue : 1");
		lblQueue.setForeground(new Color(255, 132, 72));
		lblQueue.setFont(new Font("Yu Mincho", Font.BOLD, 24));
		lblQueue.setBounds(746, 10, 130, 52);
		contentPane.add(lblQueue);
		
		JButton btnClose = new JButton("Back");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClose.setForeground(new Color(255, 132, 72));
		btnClose.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(648, 574, 194, 52);
		contentPane.add(btnClose);
		
		JLabel lblNewLabel = new JLabel("Waffle Nanoom");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setForeground(new Color(255, 132, 72));
		lblNewLabel.setFont(new Font("Yu Mincho", Font.BOLD, 18));
		lblNewLabel.setBounds(85, 586, 163, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\D4bby\\OneDrive\\เดสก์ท็อป\\photo gui\\0d1e70fd160476a3f78496be79e0813e-65x75.png"));
		lblNewLabel_1.setBounds(10, 551, 65, 75);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblOrder = new JLabel("Order");
		lblOrder.setVerticalAlignment(SwingConstants.BOTTOM);
		lblOrder.setForeground(new Color(255, 132, 72));
		lblOrder.setFont(new Font("Yu Mincho", Font.BOLD, 60));
		lblOrder.setBounds(361, 31, 194, 137);
		contentPane.add(lblOrder);
		
		JLabel lblNewLabel_2 = new JLabel("1. {size}\r\n    {flour}\r\n    {topping}\t");
		lblNewLabel_2.setFont(new Font("Yu Mincho", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(66, 179, 393, 102);
		contentPane.add(lblNewLabel_2);
		
		JButton btnPromotionCode = new JButton("Promotion Code");
		btnPromotionCode.setVerticalAlignment(SwingConstants.BOTTOM);
		btnPromotionCode.setForeground(new Color(255, 132, 72));
		btnPromotionCode.setFont(new Font("Yu Mincho", Font.BOLD, 18));
		btnPromotionCode.setBackground(Color.WHITE);
		btnPromotionCode.setBounds(240, 574, 194, 52);
		contentPane.add(btnPromotionCode);
	}
}

