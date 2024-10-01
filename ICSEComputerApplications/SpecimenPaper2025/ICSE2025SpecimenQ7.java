import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 7
 * ICSE 2025 Computer Applications Boards Specimen Paper
 */

class Question7 {
	
	// the value to be input by the user
	private int n;
	
//	public Question7(int number) {
//		this.n = number;
//	}

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		
		// ask the user to enter an integer
		System.out.print("Enter an integer : ");
		n = scanner.nextInt();
	}
	
	// helper function to get the sum of digits string
	private String getDigitSumString() {
		String s = "";
		String nStr = "" + n;
		for( int i=0; i<nStr.length(); i++ ) {
			char ch = nStr.charAt(i);
			s += ch;
			if( i+1<nStr.length() ) {
				s += "+";
			}
		}
		return s;
	}
	
	public int getNumDigits() {
		return ("" + n).length();
	}
	
	public int getDigitSum() {
		int sum = 0;
		String nStr = "" + n;
		for( int i=0; i<nStr.length(); i++  ) {	// n = 1021, nStr = "1021"
			char ch = nStr.charAt(i);		// ch= '1', '0', '2', '1'
			int digit = ch - '0';
			sum += digit;
		}
		return sum;
	}
	
	public boolean isSUPERSPY() {
		return getNumDigits() == getDigitSum();
	}
	
	public void display() {
		if( isSUPERSPY() ) {
			System.out.println("SUPERSPY number [SUM OF THE DIGITS = " + getDigitSumString() + " = " + getDigitSum() + ",");
			System.out.println("                 NUMBER OF DIGITS = " + getNumDigits() + "]");
		}
		else {
			System.out.print("Not a SUPERSPY number");
			System.out.println("[" + getDigitSumString() + " is not equal to " + getNumDigits() + "]");
		}
	}
}

public class ICSE2025SpecimenQ7 {
	public static void main(String args[]) {
		// Question7 question7 = new Question7(300);
		Question7 question7 = new Question7();
		question7.accept();
		question7.display();
	}
}
