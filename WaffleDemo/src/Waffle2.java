import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Waffle2 extends JFrame {
	
	
	private JPanel contentPane;
	private JTextField textDiscount;
	private int price = 40;

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
		
		JLabel lblSmall = new JLabel("Small");
		lblSmall.setForeground(new Color(255, 132, 72));
		lblSmall.setFont(new Font("Yu Mincho", Font.BOLD, 60));
		lblSmall.setBackground(new Color(255, 132, 72));
		lblSmall.setBounds(367, 24, 330, 117);
		contentPane.add(lblSmall);
		
		JLabel lblTopping = new JLabel("Topping :");
		lblTopping.setForeground(new Color(255, 132, 72));
		lblTopping.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping.setBackground(new Color(255, 132, 72));
		lblTopping.setBounds(91, 285, 163, 54);
		contentPane.add(lblTopping);
		
		JComboBox<String> small_Topping1 = new JComboBox<String>();
		small_Topping1.setFont(new Font("Yu Mincho", Font.BOLD, 20));
		small_Topping1.addItem("-");
		small_Topping1.addItem("Corn");
		small_Topping1.addItem("Crab strick");
		small_Topping1.addItem("Currant");
		small_Topping1.addItem("Foytong");
		small_Topping1.addItem("Pumpkin");
		small_Topping1.addItem("Coconut");
		small_Topping1.addItem("Taro");
		small_Topping1.addItem("Purple Sweet Potato");
		small_Topping1.addItem("Banana");
		small_Topping1.addItem("Chocolate chip");
		small_Topping1.addItem("Ham");
		small_Topping1.addItem("Cheddar Cheese");
		small_Topping1.addItem("Strawberryy Yam");
		//small_Topping1.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		small_Topping1.setToolTipText("");
		small_Topping1.setBounds(264, 291, 330, 44);
		contentPane.add(small_Topping1);
		
		JRadioButton small_origin = new JRadioButton("Original");
		small_origin.setHorizontalAlignment(SwingConstants.CENTER);
		small_origin.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		small_origin.setBackground(new Color(254, 251, 205));
		small_origin.setForeground(new Color(255, 132, 72));
		small_origin.setBounds(301, 141, 149, 40);
		contentPane.add(small_origin);
		
		JRadioButton small_Choc = new JRadioButton("Chocolate");
		small_Choc.setHorizontalAlignment(SwingConstants.CENTER);
		small_Choc.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		small_Choc.setBackground(new Color(254, 251, 205));
		small_Choc.setForeground(new Color(255, 132, 72));
		small_Choc.setBounds(548, 188, 210, 93);
		contentPane.add(small_Choc);
		
		JRadioButton small_Strawberry = new JRadioButton("Strawberry");
		small_Strawberry.setHorizontalAlignment(SwingConstants.CENTER);
		small_Strawberry.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		small_Strawberry.setBackground(new Color(254, 251, 205));
		small_Strawberry.setForeground(new Color(255, 132, 72));
		small_Strawberry.setBounds(295, 202, 202, 65);
		contentPane.add(small_Strawberry);
		
		JRadioButton small_Green = new JRadioButton("Green Tea");
		small_Green.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		small_Green.setHorizontalAlignment(SwingConstants.CENTER);
		small_Green.setBackground(new Color(254, 251, 205));
		small_Green.setForeground(new Color(255, 132, 72));
		small_Green.setBounds(551, 133, 202, 57);
		contentPane.add(small_Green);
		
		ButtonGroup group = new ButtonGroup();
		group.add(small_origin);
		group.add(small_Choc);
		group.add(small_Strawberry);
		group.add(small_Green);
		
		JLabel lblFlour = new JLabel("Flour :");
		lblFlour.setForeground(new Color(255, 132, 72));
		lblFlour.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblFlour.setBackground(new Color(255, 132, 72));
		lblFlour.setBounds(137, 128, 119, 65);
		contentPane.add(lblFlour);
		
		
		
		JLabel lblTopping_2 = new JLabel("Topping :");
		lblTopping_2.setForeground(new Color(255, 132, 72));
		lblTopping_2.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping_2.setBackground(new Color(255, 132, 72));
		lblTopping_2.setBounds(91, 350, 163, 54);
		contentPane.add(lblTopping_2);
		
		JComboBox<String> small_Topping2 = new JComboBox<String>();
		small_Topping2.addItem("-");
		small_Topping2.addItem("Corn");
		small_Topping2.addItem("Crab strick");
		small_Topping2.addItem("Currant");
		small_Topping2.addItem("Foytong");
		small_Topping2.addItem("Pumpkin");
		small_Topping2.addItem("Coconut");
		small_Topping2.addItem("Taro");
		small_Topping2.addItem("Purple Sweet Potato");
		small_Topping2.addItem("Banana");
		small_Topping2.addItem("Chocolate chip");
		small_Topping2.addItem("Ham");
		small_Topping2.addItem("Cheddar Cheese");
		small_Topping2.addItem("Strawberryy Yam");
		//small_Topping2.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		small_Topping2.setToolTipText("");
		small_Topping2.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		small_Topping2.setBounds(264, 349, 330, 44);
		contentPane.add(small_Topping2);
		
		
		
		JLabel lblNewLabel = new JLabel("Waffle Nanoom");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setForeground(new Color(255, 132, 72));
		lblNewLabel.setFont(new Font("Yu Mincho", Font.BOLD, 18));
		lblNewLabel.setBounds(85, 586, 163, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\D4bby\\OneDrive\\เดสก์ท็อป\\photo gui\\0d1e70fd160476a3f78496be79e0813e-65x75.png"));
		lblNewLabel_1.setBounds(10, 575, 65, 75);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPer = new JLabel("10 ฿ per topping");
		lblPer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPer.setForeground(new Color(255, 132, 72));
		lblPer.setFont(new Font("Yu Mincho", Font.BOLD, 16));
		lblPer.setBackground(new Color(255, 132, 72));
		lblPer.setBounds(301, 256, 257, 54);
		contentPane.add(lblPer);
		
		textDiscount = new JTextField();
		textDiscount.setText("Enter you code for discount 10 ฿");
		textDiscount.setBounds(241, 507, 371, 35);
		contentPane.add(textDiscount);
		textDiscount.setColumns(10);
		
		Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		JButton small_Next = new JButton("Confirm");
		small_Next.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			
			String top1,top2,top3,flour;
			public void actionPerformed(ActionEvent e) {
				
				if(textDiscount.getText().equals("11111")){
					price = price - 10;
				}
				
				if(small_Green.isSelected()) {
					flour = "Green Tea"; 
				}else if(small_Strawberry.isSelected()){
					flour = "Strawberry"; 
				}else if(small_Choc.isSelected()) {
					flour = "Chocolate"; 
				}else {
					flour = "Original"; 
				}
				
				top1 = (String)small_Topping1.getSelectedItem();
				top2 = (String)small_Topping2.getSelectedItem();
								
				if(top1.equals("-")) price = price-10;
				if(top2.equals("-")) price = price-10;
				
				
				JOptionPane.showMessageDialog(lblPer,"Size : M\nFlout : "+flour+"\nTopping : "+
				top1+"\nTopping : "+top2+"\nPrice : "+price);	
				System.exit(0);
			}
		});
		
		
		
		small_Next.setVerticalAlignment(SwingConstants.BOTTOM);
		small_Next.setForeground(new Color(255, 132, 72));
		small_Next.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		small_Next.setBackground(Color.WHITE);
		small_Next.setBounds(418, 586, 194, 52);
		contentPane.add(small_Next);
		
		JButton small_Back = new JButton("Back");
		small_Back.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				Waffle1 back = new Waffle1 ();
				back.show();
				dispose();
			}
		});
		small_Back.setVerticalAlignment(SwingConstants.BOTTOM);
		small_Back.setForeground(new Color(255, 132, 72));
		small_Back.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		small_Back.setBackground(Color.WHITE);
		small_Back.setBounds(648, 586, 194, 52);
		contentPane.add(small_Back);
		
		
		
		
		
		
		
	}
}
