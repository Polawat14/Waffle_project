import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.print.DocFlavor.STRING;
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

public class Waffle1 extends JFrame {
	public  String Size ="";


	private JPanel contentPane;
;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Waffle1 frame = new Waffle1();
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

	public Waffle1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\D4bby\\Downloads\\0d1e70fd160476a3f78496be79e0813e.png"));
		setTitle("Waffle Nanoom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 251, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

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
		lblNewLabel_1.setIcon(new ImageIcon(Waffle1.class.getResource("/resource/1.jpg")));
		lblNewLabel_1.setBounds(38, 43, 206, 226);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Waffle1.class.getResource("/resource/9070d9b844463bdce79be44993f6dddb-300x400.png")));
		lblNewLabel_2.setBounds(295, 62, 226, 211);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Waffle1.class.getResource("/resource/33.jpg")));
		lblNewLabel_3.setBounds(657, 10, 249, 275);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Waffle Nanoom");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_4.setForeground(new Color(255, 132, 72));
		lblNewLabel_4.setFont(new Font("Yu Mincho", Font.BOLD, 18));
		lblNewLabel_4.setBounds(85, 586, 163, 40);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Waffle1.class.getResource("/resource/0d1e70fd160476a3f78496be79e0813e-65x75.png")));
		lblNewLabel_1_1.setBounds(10, 575, 65, 75);
		contentPane.add(lblNewLabel_1_1);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancel.setForeground(new Color(255, 132, 72));
		btnCancel.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(648, 575, 194, 63);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnCancel);

		JButton GOWaffle3 = new JButton("M");
		GOWaffle3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GOWaffle3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Waffle3 goS = new Waffle3();
				goS.show();
				dispose();
			}
		});
		GOWaffle3.setBounds(374, 416, 143, 63);
		contentPane.add(GOWaffle3);

		JButton GOWaffle2 = new JButton("S");
		GOWaffle2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GOWaffle2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Waffle2 goS = new Waffle2();
				goS.show();
				dispose();
			}
		});
		GOWaffle2.setBounds(63, 416, 143, 63);
		contentPane.add(GOWaffle2);

		JButton GOWaffle4 = new JButton("L");
		GOWaffle4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Waffle4 goS = new Waffle4();
				goS.show();
				dispose();
			}
		});
		GOWaffle4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GOWaffle4.setBounds(676, 416, 143, 63);
		contentPane.add(GOWaffle4);
	}
}