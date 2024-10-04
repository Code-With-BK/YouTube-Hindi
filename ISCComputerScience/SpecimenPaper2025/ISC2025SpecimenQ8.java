import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 8
 * ISC 2025 Computer Science Boards Specimen Paper
 */

class LCM {
	
	private int n1;
	private int n2;
	private int large;
	private int sm;
	private int l;
	
	// static Scanner scanner = new Scanner(System.in);
	
	public LCM() {
		n1 = 0;
		n2 = 0;
		large = 0;
		sm = 0;
		l = 0;
	}
	
	public void accept() {
		// Scanner object to read from the user
		Scanner scanner = new Scanner(System.in);
		
		// ask the user to enter n1
		System.out.print("Enter n1: ");
		n1 = scanner.nextInt();
		
		// ask the user to enter n2
		System.out.print("Enter n2: ");
		n2 = scanner.nextInt();
		
		// set large and sm
		if( n1>n2 ) {
			large = n1;
			sm = n2;
		}
		// else if n2 is >= n1
		else {
			large = n2;
			sm = n1;
		}
	}
	
	public int getLCM() {
		if( sm==large ) {
			// return (n1 * n2)/sm;
			return (n1 * n2)/large;
		}
		// else if sm and large are not equal
		else {
			// replace the larger value by the difference
			if( large>sm ) {
				int diff = large - sm;
				large = diff;
			}
			// else if sm has the larger value
			else {
				int diff = sm - large;
				sm = diff;
			}
			return getLCM();
		}
	}
	
	public void display() {
		l = getLCM();
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("LCM : " + l);
	}
}

public class ISC2025SpecimenQ8 {
	public static void main(String args[]) {
		LCM lcm = new LCM();
		lcm.accept();
		lcm.display();
	}
}
