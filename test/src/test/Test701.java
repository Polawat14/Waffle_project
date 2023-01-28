package test;

public class Test701 {
	public int one;
	public int two;
	public int five;
	public int ten;
	public int size;
	
	public void setPiggyBank(int s) {
		size = s;
		clear();
	}
	public void clear() {
		one = two = five = ten =0;
	}
	public int getTotal() {
		return one + (two*2)+(five*5)+(ten*10);
	}
	public int getPiggyBank() {
		return size;
	}
	public void addOne(int c) {
		if(getTotal()+ c <=size) {
			one+=c;
		}else {
			System.out.println("PiggyBank Full");
		}
	}
	public void addTwo(int c) {
		if(getTotal()+(c*2) <=size) {
			two+=c;
		}else {
			System.out.println("PiggyBank Full");
		}
	}
	public void addFive(int c) {
		if(getTotal()+(c*5) <=size) {
			five+=c;
		}else {
			System.out.println("PiggyBank Full");
		}
	}
	public void addTen(int c) {
		if(getTotal()+(c*10) <=size) {
			ten+=c;
		}else {
			System.out.println("PiggyBank Full");
		}
	}
}