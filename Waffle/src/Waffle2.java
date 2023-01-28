import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Waffle2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Waffle2 frame = new Waffle2();
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
	public Waffle2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\D4bby\\Downloads\\0d1e70fd160476a3f78496be79e0813e.png"));
		setTitle("Waffle Nanoom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 251, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Yu Mincho", Font.BOLD, 23));
		comboBox.setForeground(new Color(255, 132, 72));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-", "S", "M", "L"}));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(374, 442, 205, 52);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Size : ");
		lblNewLabel.setForeground(new Color(255, 132, 72));
		lblNewLabel.setBackground(new Color(255, 132, 72));
		lblNewLabel.setFont(new Font("Yu Mincho", Font.BOLD, 36));
		lblNewLabel.setBounds(262, 436, 120, 63);
		contentPane.add(lblNewLabel);
		
		JLabel lblSmall = new JLabel("Small");
		lblSmall.setForeground(new Color(255, 132, 72));
		lblSmall.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblSmall.setBackground(new Color(255, 132, 72));
		lblSmall.setBounds(101, 279, 126, 70);
		contentPane.add(lblSmall);
		
		JLabel lblSmall_1 = new JLabel("20 ฿");
		lblSmall_1.setForeground(new Color(255, 132, 72));
		lblSmall_1.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		lblSmall_1.setBackground(new Color(255, 132, 72));
		lblSmall_1.setBounds(111, 326, 95, 52);
		contentPane.add(lblSmall_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancel.setForeground(new Color(255, 132, 72));
		btnCancel.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(648, 574, 194, 52);
		contentPane.add(btnCancel);
		
		JButton btnNext = new JButton("Next");
		btnNext.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNext.setForeground(new Color(255, 132, 72));
		btnNext.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		btnNext.setBackground(Color.WHITE);
		btnNext.setBounds(418, 574, 194, 52);
		contentPane.add(btnNext);
		
		JLabel lblMedium = new JLabel("Medium");
		lblMedium.setForeground(new Color(255, 132, 72));
		lblMedium.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblMedium.setBackground(new Color(255, 132, 72));
		lblMedium.setBounds(374, 279, 147, 70);
		contentPane.add(lblMedium);
		
		JLabel lblSmall_1_2 = new JLabel("30 ฿");
		lblSmall_1_2.setForeground(new Color(255, 132, 72));
		lblSmall_1_2.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		lblSmall_1_2.setBackground(new Color(255, 132, 72));
		lblSmall_1_2.setBounds(415, 326, 95, 52);
		contentPane.add(lblSmall_1_2);
		
		JLabel lblLarge_1 = new JLabel("Large");
		lblLarge_1.setForeground(new Color(255, 132, 72));
		lblLarge_1.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblLarge_1.setBackground(new Color(255, 132, 72));
		lblLarge_1.setBounds(703, 279, 126, 70);
		contentPane.add(lblLarge_1);
		
		JLabel lblSmall_1_2_1 = new JLabel("40 ฿");
		lblSmall_1_2_1.setForeground(new Color(255, 132, 72));
		lblSmall_1_2_1.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		lblSmall_1_2_1.setBackground(new Color(255, 132, 72));
		lblSmall_1_2_1.setBounds(724, 326, 95, 52);
		contentPane.add(lblSmall_1_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\D4bby\\OneDrive\\เดสก์ท็อป\\photo gui\\1.jpg"));
		lblNewLabel_1.setBounds(38, 43, 206, 226);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\D4bby\\OneDrive\\เดสก์ท็อป\\photo gui\\9070d9b844463bdce79be44993f6dddb-300x400.png"));
		lblNewLabel_2.setBounds(295, 62, 226, 211);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\D4bby\\OneDrive\\เดสก์ท็อป\\photo gui\\33.jpg"));
		lblNewLabel_3.setBounds(657, 10, 249, 275);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Waffle Nanoom");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_4.setForeground(new Color(255, 132, 72));
		lblNewLabel_4.setFont(new Font("Yu Mincho", Font.BOLD, 18));
		lblNewLabel_4.setBounds(85, 586, 163, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\D4bby\\OneDrive\\เดสก์ท็อป\\photo gui\\0d1e70fd160476a3f78496be79e0813e-65x75.png"));
		lblNewLabel_1_1.setBounds(10, 551, 65, 75);
		contentPane.add(lblNewLabel_1_1);
	}
}
