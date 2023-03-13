import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
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

		JLabel lblLarge = new JLabel("Large");
		lblLarge.setForeground(new Color(255, 132, 72));
		lblLarge.setFont(new Font("Yu Mincho", Font.BOLD, 60));
		lblLarge.setBackground(new Color(255, 132, 72));
		lblLarge.setBounds(355, 24, 175, 117);
		contentPane.add(lblLarge);

		JRadioButton large_Origin = new JRadioButton("Original");
		large_Origin.setHorizontalAlignment(SwingConstants.CENTER);
		large_Origin.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		large_Origin.setBackground(new Color(254, 251, 205));
		large_Origin.setForeground(new Color(255, 132, 72));
		large_Origin.setBounds(301, 141, 149, 40);
		contentPane.add(large_Origin);

		JRadioButton large_Choco = new JRadioButton("Chocolate");
		large_Choco.setHorizontalAlignment(SwingConstants.CENTER);
		large_Choco.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		large_Choco.setBackground(new Color(254, 251, 205));
		large_Choco.setForeground(new Color(255, 132, 72));
		large_Choco.setBounds(548, 188, 210, 93);
		contentPane.add(large_Choco);

		JRadioButton large_Strawberry = new JRadioButton("Strawberry");
		large_Strawberry.setHorizontalAlignment(SwingConstants.CENTER);
		large_Strawberry.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		large_Strawberry.setBackground(new Color(254, 251, 205));
		large_Strawberry.setForeground(new Color(255, 132, 72));
		large_Strawberry.setBounds(295, 202, 202, 65);
		contentPane.add(large_Strawberry);

		JRadioButton large_Green = new JRadioButton("Green Tea");
		large_Green.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		large_Green.setHorizontalAlignment(SwingConstants.CENTER);
		large_Green.setBackground(new Color(254, 251, 205));
		large_Green.setForeground(new Color(255, 132, 72));
		large_Green.setBounds(551, 133, 202, 57);
		contentPane.add(large_Green);

		ButtonGroup group = new ButtonGroup();
		group.add(large_Origin);
		group.add(large_Choco);
		group.add(large_Strawberry);
		group.add(large_Green);

		JLabel lblFlour = new JLabel("Flour :");
		lblFlour.setForeground(new Color(255, 132, 72));
		lblFlour.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblFlour.setBackground(new Color(255, 132, 72));
		lblFlour.setBounds(137, 128, 119, 65);
		contentPane.add(lblFlour);

		JLabel lblTopping = new JLabel("Topping :");
		lblTopping.setForeground(new Color(255, 132, 72));
		lblTopping.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping.setBackground(new Color(255, 132, 72));
		lblTopping.setBounds(91, 280, 163, 54);
		contentPane.add(lblTopping);

		JComboBox<String> large_Topping1 = new JComboBox<String>();
		large_Topping1.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		large_Topping1.addItem("-");
		large_Topping1.addItem("Corn");
		large_Topping1.addItem("Crab strick");
		large_Topping1.addItem("Currant");
		large_Topping1.addItem("Foytong");
		large_Topping1.addItem("Pumpkin");
		large_Topping1.addItem("Coconut");
		large_Topping1.addItem("Taro");
		large_Topping1.addItem("Purple Sweet Potato");
		large_Topping1.addItem("Banana");
		large_Topping1.addItem("Chocolate chip");
		large_Topping1.addItem("Ham");
		large_Topping1.addItem("Cheddar Cheese");
		large_Topping1.addItem("Strawberryy Yam");
		//large_Topping1.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		large_Topping1.setToolTipText("");
		large_Topping1.setBounds(264, 287, 330, 30);
		contentPane.add(large_Topping1);

		JLabel lblTopping_2 = new JLabel("Topping :");
		lblTopping_2.setForeground(new Color(255, 132, 72));
		lblTopping_2.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping_2.setBackground(new Color(255, 132, 72));
		lblTopping_2.setBounds(91, 335, 163, 54);
		contentPane.add(lblTopping_2);

		JComboBox<String> large_Topping2 = new JComboBox<String>();
		large_Topping2.addItem("-");
		large_Topping2.addItem("Corn");
		large_Topping2.addItem("Crab strick");
		large_Topping2.addItem("Currant");
		large_Topping2.addItem("Foytong");
		large_Topping2.addItem("Pumpkin");
		large_Topping2.addItem("Coconut");
		large_Topping2.addItem("Taro");
		large_Topping2.addItem("Purple Sweet Potato");
		large_Topping2.addItem("Banana");
		large_Topping2.addItem("Chocolate chip");
		large_Topping2.addItem("Ham");
		large_Topping2.addItem("Cheddar Cheese");
		large_Topping2.addItem("Strawberryy Yam");
		//large_Topping2.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		large_Topping2.setToolTipText("");
		large_Topping2.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		large_Topping2.setBounds(264, 351, 330, 30);
		contentPane.add(large_Topping2);

		JLabel lblNewLabel = new JLabel("Waffle Nanoom");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setForeground(new Color(255, 132, 72));
		lblNewLabel.setFont(new Font("Yu Mincho", Font.BOLD, 18));
		lblNewLabel.setBounds(85, 586, 163, 40);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Waffle4.class.getResource("/resource/0d1e70fd160476a3f78496be79e0813e-65x75.png")));
		lblNewLabel_1.setBounds(10, 575, 65, 75);
		contentPane.add(lblNewLabel_1);

		JLabel lblTopping_1 = new JLabel("Topping :");
		lblTopping_1.setForeground(new Color(255, 132, 72));
		lblTopping_1.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping_1.setBackground(new Color(255, 132, 72));
		lblTopping_1.setBounds(91, 399, 163, 54);
		contentPane.add(lblTopping_1);

		JComboBox<String> large_Topping3 = new JComboBox<String>();
		large_Topping3.addItem("-");
		large_Topping3.addItem("Corn");
		large_Topping3.addItem("Crab strick");
		large_Topping3.addItem("Currant");
		large_Topping3.addItem("Foytong");
		large_Topping3.addItem("Pumpkin");
		large_Topping3.addItem("Coconut");
		large_Topping3.addItem("Taro");
		large_Topping3.addItem("Purple Sweet Potato");
		large_Topping3.addItem("Banana");
		large_Topping3.addItem("Chocolate chip");
		large_Topping3.addItem("Ham");
		large_Topping3.addItem("Cheddar Cheese");
		large_Topping3.addItem("Strawberryy Yam");
		//large_Topping3.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		large_Topping3.setToolTipText("");
		large_Topping3.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		large_Topping3.setBounds(264, 412, 330, 30);
		contentPane.add(large_Topping3);

		JLabel lblTopping_1_1 = new JLabel("Topping :");
		lblTopping_1_1.setForeground(new Color(255, 132, 72));
		lblTopping_1_1.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping_1_1.setBackground(new Color(255, 132, 72));
		lblTopping_1_1.setBounds(91, 463, 163, 54);
		contentPane.add(lblTopping_1_1);

		JComboBox<String> large_Topping4 = new JComboBox<String>();
		large_Topping4.addItem("-");
		large_Topping4.addItem("Corn");
		large_Topping4.addItem("Crab strick");
		large_Topping4.addItem("Currant");
		large_Topping4.addItem("Foytong");
		large_Topping4.addItem("Pumpkin");
		large_Topping4.addItem("Coconut");
		large_Topping4.addItem("Taro");
		large_Topping4.addItem("Purple Sweet Potato");
		large_Topping4.addItem("Banana");
		large_Topping4.addItem("Chocolate chip");
		large_Topping4.addItem("Ham");
		large_Topping4.addItem("Cheddar Cheese");
		large_Topping4.addItem("Strawberryy Yam");
		//large_Topping4.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		large_Topping4.setToolTipText("");
		large_Topping4.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		large_Topping4.setBounds(264, 476, 330, 30);
		contentPane.add(large_Topping4);


		JLabel lblPer = new JLabel("10 ฿ per topping");
		lblPer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPer.setForeground(new Color(255, 132, 72));
		lblPer.setFont(new Font("Yu Mincho", Font.BOLD, 16));
		lblPer.setBackground(new Color(255, 132, 72));
		lblPer.setBounds(305, 251, 257, 54);
		contentPane.add(lblPer);

		JTextField textDiscount = new JTextField();
		textDiscount.setText("Enter you code for discount 10 ฿");
		textDiscount.setBounds(248, 527, 371, 35);
		contentPane.add(textDiscount);
		textDiscount.setColumns(10);

		JButton large_Next = new JButton("Confirm");
		large_Next.addActionListener(new ActionListener() {
			int price = 80;
			String top1,top2,top3,top4,flour;
			public void actionPerformed(ActionEvent e) {

				if(textDiscount.getText().equals("11111")){
					price = price - 10;
				}

				if(large_Green.isSelected()) {
					flour = "Green Tea"; 
				}else if(large_Strawberry.isSelected()){
					flour = "Strawberry"; 
				}else if(large_Choco.isSelected()) {
					flour = "Chocolate"; 
				}else {
					flour = "Original"; 
				}

				top1 = (String)large_Topping1.getSelectedItem();
				top2 = (String)large_Topping2.getSelectedItem();
				top3 = (String)large_Topping3.getSelectedItem();
				top4 = (String)large_Topping4.getSelectedItem();

				if(top1.equals("-")) price = price-10;
				if(top2.equals("-")) price = price-10;
				if(top3.equals("-")) price = price-10;
				if(top4.equals("-")) price = price-10;


				JOptionPane.showMessageDialog(lblPer,"Size : M\nFlout : "+flour+"\nTopping : "+
				top1+"\nTopping : "+top2+"\nTopping : "+top3+"\nTopping : "+top4+"\nPrice : "+price, "Bill",JOptionPane.PLAIN_MESSAGE);	
				System.exit(0);
			}
		});
		large_Next.setVerticalAlignment(SwingConstants.BOTTOM);
		large_Next.setForeground(new Color(255, 132, 72));
		large_Next.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		large_Next.setBackground(Color.WHITE);
		large_Next.setBounds(418, 575, 194, 63);
		contentPane.add(large_Next);

		JButton large_Back = new JButton("Back");
		large_Back.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				Waffle1 back = new Waffle1 ();
				back.show();
				dispose();
			}
		});
		large_Back.setVerticalAlignment(SwingConstants.BOTTOM);
		large_Back.setForeground(new Color(255, 132, 72));
		large_Back.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		large_Back.setBackground(Color.WHITE);
		large_Back.setBounds(648, 575, 194, 63);
		contentPane.add(large_Back);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(128, 64, 64));
		panel_1_1_1.setBounds(503, 211, 41, 30);
		contentPane.add(panel_1_1_1);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 185, 92));
		panel_1_1.setBounds(504, 141, 41, 30);
		contentPane.add(panel_1_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 64));
		panel_1.setBounds(248, 141, 41, 30);
		contentPane.add(panel_1);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 81, 85));
		panel.setBounds(248, 211, 41, 30);
		contentPane.add(panel);
	}

}