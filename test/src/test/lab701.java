package test;
import java.util.*;


public class lab701 {
	
	static Scanner sc = new Scanner(System.in);
	static Test701 pb = new Test701();
	
	public static void main(String[] args) {
		inputSize();
	}
	public static void inputSize() {
		System.out.print("Money Total : "+pb.getTotal());
		System.out.print("Please difine size of PiggyBank:");
		pb.setPiggyBank(sc.nextInt());
		System.out.print("Size of your PiggyBank:"+
							pb.getPiggyBank());
		
		
		inputCoin();
	}
	public static void inputCoin() {
		while(true) {
			System.out.println("====================================");
			System.out.println("Menu of PiggyBank");
			System.out.println("====================================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("====================================");
			System.out.print("Please Select Meni[1-5] : ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.print("Insert 1 baht Money: ");
				pb.addOne(sc.nextInt());
				System.out.print("Money Total: "+pb.getTotal());
			}
		
		}
	}

}
