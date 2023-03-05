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

public class Waffle3 extends JFrame {

	private JPanel contentPane;	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Waffle3 frame = new Waffle3();
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
	@SuppressWarnings("unlikely-arg-type")
	public Waffle3() {
		
		
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
		
		JRadioButton medium_Origin = new JRadioButton("Original");
		medium_Origin.setHorizontalAlignment(SwingConstants.CENTER);
		medium_Origin.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		medium_Origin.setBackground(new Color(254, 251, 205));
		medium_Origin.setForeground(new Color(255, 132, 72));
		medium_Origin.setBounds(301, 141, 149, 40);
		contentPane.add(medium_Origin);
		
		JRadioButton medium_Choc = new JRadioButton("Chocolate");
		medium_Choc.setHorizontalAlignment(SwingConstants.CENTER);
		medium_Choc.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		medium_Choc.setBackground(new Color(254, 251, 205));
		medium_Choc.setForeground(new Color(255, 132, 72));
		medium_Choc.setBounds(548, 188, 210, 93);
		contentPane.add(medium_Choc);
		
		JRadioButton medium_Strawberry = new JRadioButton("Strawberry");
		medium_Strawberry.setHorizontalAlignment(SwingConstants.CENTER);
		medium_Strawberry.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		medium_Strawberry.setBackground(new Color(254, 251, 205));
		medium_Strawberry.setForeground(new Color(255, 132, 72));
		medium_Strawberry.setBounds(295, 202, 202, 65);
		contentPane.add(medium_Strawberry);
		
		JRadioButton medium_Green = new JRadioButton("Green Tea");
		medium_Green.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		medium_Green.setHorizontalAlignment(SwingConstants.CENTER);
		medium_Green.setBackground(new Color(254, 251, 205));
		medium_Green.setForeground(new Color(255, 132, 72));
		medium_Green.setBounds(551, 133, 202, 57);
		contentPane.add(medium_Green);
		
		ButtonGroup group = new ButtonGroup();
		group.add(medium_Origin);
		group.add(medium_Choc);
		group.add(medium_Strawberry);
		group.add(medium_Green);
		
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
		lblTopping.setBounds(91, 297, 163, 54);
		contentPane.add(lblTopping);
		
		JComboBox<String> medium_Topping1 = new JComboBox<String>();
		medium_Topping1.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		medium_Topping1.addItem("-");
		medium_Topping1.addItem("Corn");
		medium_Topping1.addItem("Crab strick");
		medium_Topping1.addItem("Currant");
		medium_Topping1.addItem("Foytong");
		medium_Topping1.addItem("Pumpkin");
		medium_Topping1.addItem("Coconut");
		medium_Topping1.addItem("Taro");
		medium_Topping1.addItem("Purple Sweet Potato");
		medium_Topping1.addItem("Banana");
		medium_Topping1.addItem("Chocolate chip");
		medium_Topping1.addItem("Ham");
		medium_Topping1.addItem("Cheddar Cheese");
		medium_Topping1.addItem("Strawberryy Yam");
		//medium_Topping1.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		medium_Topping1.setToolTipText("");
		medium_Topping1.setBounds(264, 310, 330, 30);
		contentPane.add(medium_Topping1);
		
		JLabel lblTopping_2 = new JLabel("Topping :");
		lblTopping_2.setForeground(new Color(255, 132, 72));
		lblTopping_2.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping_2.setBackground(new Color(255, 132, 72));
		lblTopping_2.setBounds(91, 351, 163, 54);
		contentPane.add(lblTopping_2);
		
		JComboBox<String> medium_Topping2 = new JComboBox<String>();
		medium_Topping2.addItem("-");
		medium_Topping2.addItem("Corn");
		medium_Topping2.addItem("Crab strick");
		medium_Topping2.addItem("Currant");
		medium_Topping2.addItem("Foytong");
		medium_Topping2.addItem("Pumpkin");
		medium_Topping2.addItem("Coconut");
		medium_Topping2.addItem("Taro");
		medium_Topping2.addItem("Purple Sweet Potato");
		medium_Topping2.addItem("Banana");
		medium_Topping2.addItem("Chocolate chip");
		medium_Topping2.addItem("Ham");
		medium_Topping2.addItem("Cheddar Cheese");
		medium_Topping2.addItem("Strawberryy Yam");
		//medium_Topping2.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		medium_Topping2.setToolTipText("");
		medium_Topping2.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		medium_Topping2.setBounds(264, 364, 330, 30);
		contentPane.add(medium_Topping2);
		
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
		
		JLabel lblTopping_1 = new JLabel("Topping :");
		lblTopping_1.setForeground(new Color(255, 132, 72));
		lblTopping_1.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping_1.setBackground(new Color(255, 132, 72));
		lblTopping_1.setBounds(91, 415, 163, 54);
		contentPane.add(lblTopping_1);
		
		JComboBox<String> medium_Topping3 = new JComboBox<String>();
		medium_Topping3.addItem("-");
		medium_Topping3.addItem("Corn");
		medium_Topping3.addItem("Crab strick");
		medium_Topping3.addItem("Currant");
		medium_Topping3.addItem("Foytong");
		medium_Topping3.addItem("Pumpkin");
		medium_Topping3.addItem("Coconut");
		medium_Topping3.addItem("Taro");
		medium_Topping3.addItem("Purple Sweet Potato");
		medium_Topping3.addItem("Banana");
		medium_Topping3.addItem("Chocolate chip");
		medium_Topping3.addItem("Ham");
		medium_Topping3.addItem("Cheddar Cheese");
		medium_Topping3.addItem("Strawberryy Yam");
		//medium_Topping3.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		medium_Topping3.setToolTipText("");
		medium_Topping3.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		medium_Topping3.setBounds(264, 428, 330, 30);
		contentPane.add(medium_Topping3);
		
		
		JLabel lblPer = new JLabel("10 ฿ per topping");
		lblPer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPer.setForeground(new Color(255, 132, 72));
		lblPer.setFont(new Font("Yu Mincho", Font.BOLD, 16));
		lblPer.setBackground(new Color(255, 132, 72));
		lblPer.setBounds(301, 271, 257, 54);
		contentPane.add(lblPer);
				
		JTextField textDiscount = new JTextField();
		textDiscount.setText("Enter you code for discount 10 ฿");
		textDiscount.setBounds(267, 508, 371, 35);
		contentPane.add(textDiscount);
		textDiscount.setColumns(10);
		
		JButton medium_Next = new JButton("Confirm");
		medium_Next.addActionListener(new ActionListener() {
					
			int price = 60;
			String top1,top2,top3,flour;
			public void actionPerformed(ActionEvent arg0) {	
				if(textDiscount.getText().equals("11111")){
					price = price - 10;
				}
				
				if(medium_Green.isSelected()) {
					flour = "Green Tea"; 
				}else if(medium_Strawberry.isSelected()){
					flour = "Strawberry"; 
				}else if(medium_Choc.isSelected()) {
					flour = "Chocolate"; 
				}else {
					flour = "Original"; 
				}
				
				top1 = (String)medium_Topping1.getSelectedItem();
				top2 = (String)medium_Topping2.getSelectedItem();
				top3 = (String)medium_Topping3.getSelectedItem();
				
				if(top1.equals("-")) price = price-10;
				if(top2.equals("-")) price = price-10;
				if(top3.equals("-")) price = price-10;
				
				JOptionPane.showMessageDialog(lblPer,"Size : M\nFlout : "+flour+"\nTopping : "+
				top1+"\nTopping : "+top2+"\nTopping : "+top3+"\nPrice : "+price);	
				System.exit(0);
			}
		});
		medium_Next.setVerticalAlignment(SwingConstants.BOTTOM);
		medium_Next.setForeground(new Color(255, 132, 72));
		medium_Next.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		medium_Next.setBackground(Color.WHITE);
		medium_Next.setBounds(418, 586, 194, 52);
		contentPane.add(medium_Next);
		
		JButton medium_Back = new JButton("Back");
		medium_Back.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				Waffle1 back = new Waffle1 ();
				back.show();
				dispose();
			}
		});
		medium_Back.setVerticalAlignment(SwingConstants.BOTTOM);
		medium_Back.setForeground(new Color(255, 132, 72));
		medium_Back.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		medium_Back.setBackground(Color.WHITE);
		medium_Back.setBounds(648, 586, 194, 52);
		contentPane.add(medium_Back);
	}
	
}