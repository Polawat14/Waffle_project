import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Waffle4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Waffle4 frame = new Waffle4();
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
	public Waffle4() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\D4bby\\Downloads\\0d1e70fd160476a3f78496be79e0813e.png"));
		setTitle("Waffle Nanoom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 251, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSmall = new JLabel("Medium");
		lblSmall.setForeground(new Color(255, 132, 72));
		lblSmall.setFont(new Font("Yu Mincho", Font.BOLD, 60));
		lblSmall.setBackground(new Color(255, 132, 72));
		lblSmall.setBounds(315, 24, 257, 117);
		contentPane.add(lblSmall);
		
		JLabel lblTopping = new JLabel("Topping :");
		lblTopping.setForeground(new Color(255, 132, 72));
		lblTopping.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping.setBackground(new Color(255, 132, 72));
		lblTopping.setBounds(91, 297, 163, 54);
		contentPane.add(lblTopping);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(264, 310, 330, 30);
		contentPane.add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Original");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		rdbtnNewRadioButton.setBackground(new Color(254, 251, 205));
		rdbtnNewRadioButton.setForeground(new Color(255, 132, 72));
		rdbtnNewRadioButton.setBounds(301, 141, 149, 40);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnChocolate = new JRadioButton("Chocolate");
		rdbtnChocolate.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnChocolate.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		rdbtnChocolate.setBackground(new Color(254, 251, 205));
		rdbtnChocolate.setForeground(new Color(255, 132, 72));
		rdbtnChocolate.setBounds(548, 188, 210, 93);
		contentPane.add(rdbtnChocolate);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Strawberry");
		rdbtnNewRadioButton_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		rdbtnNewRadioButton_1_1.setBackground(new Color(254, 251, 205));
		rdbtnNewRadioButton_1_1.setForeground(new Color(255, 132, 72));
		rdbtnNewRadioButton_1_1.setBounds(295, 202, 202, 65);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("Green Tea");
		rdbtnNewRadioButton_1_1_1.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		rdbtnNewRadioButton_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_1.setBackground(new Color(254, 251, 205));
		rdbtnNewRadioButton_1_1_1.setForeground(new Color(255, 132, 72));
		rdbtnNewRadioButton_1_1_1.setBounds(551, 133, 202, 57);
		contentPane.add(rdbtnNewRadioButton_1_1_1);
		
		JLabel lblFlour = new JLabel("Flour :");
		lblFlour.setForeground(new Color(255, 132, 72));
		lblFlour.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblFlour.setBackground(new Color(255, 132, 72));
		lblFlour.setBounds(137, 128, 119, 65);
		contentPane.add(lblFlour);
		
		JButton btnNext_2 = new JButton("Next");
		btnNext_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNext_2.setForeground(new Color(255, 132, 72));
		btnNext_2.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		btnNext_2.setBackground(Color.WHITE);
		btnNext_2.setBounds(418, 574, 194, 52);
		contentPane.add(btnNext_2);
		
		JButton btnCancel = new JButton("Back");
		btnCancel.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCancel.setForeground(new Color(255, 132, 72));
		btnCancel.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(648, 574, 194, 52);
		contentPane.add(btnCancel);
		
		JLabel lblTopping_2 = new JLabel("Topping :");
		lblTopping_2.setForeground(new Color(255, 132, 72));
		lblTopping_2.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping_2.setBackground(new Color(255, 132, 72));
		lblTopping_2.setBounds(91, 351, 163, 54);
		contentPane.add(lblTopping_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		comboBox_1.setBounds(264, 364, 330, 30);
		contentPane.add(comboBox_1);
		
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
		
		JLabel lblTopping_1 = new JLabel("Topping :");
		lblTopping_1.setForeground(new Color(255, 132, 72));
		lblTopping_1.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping_1.setBackground(new Color(255, 132, 72));
		lblTopping_1.setBounds(91, 415, 163, 54);
		contentPane.add(lblTopping_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		comboBox_2.setToolTipText("");
		comboBox_2.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		comboBox_2.setBounds(264, 428, 330, 30);
		contentPane.add(comboBox_2);
		
		JLabel lblPer = new JLabel("10 ฿ per topping");
		lblPer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPer.setForeground(new Color(255, 132, 72));
		lblPer.setFont(new Font("Yu Mincho", Font.BOLD, 16));
		lblPer.setBackground(new Color(255, 132, 72));
		lblPer.setBounds(315, 468, 257, 54);
		contentPane.add(lblPer);
	}
}
