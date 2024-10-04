import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 6
 * ISC 2025 Computer Science Boards Specimen Paper
 */

class StringOp {
	
	private String str;
	private String msk;
	private String nstr;
	
	public StringOp() {
		str = "";
		msk = "";
		nstr = "";
	}
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		
		// ask the user to enter a string
		System.out.print("Enter input string: ");
		str = scanner.nextLine();
		
		// ask the user to enter mask string
		System.out.print("Enter mask string: ");
		msk = scanner.nextLine();
		
		// convert both the strings to lower case
		str = str.toLowerCase();
		msk = msk.toLowerCase();
	}
	
	public void form() {
		// set temp to str
		String temp = str;
		
		// for each character in mask
		for( int i=0; i<msk.length(); i++ ) {
			char ch = msk.charAt(i);
			
			// set nstr to blank
			nstr = "";
			
			// remove all occurrences of ch from temp and store it into nstr
			for( int j=0; j<temp.length(); j++ ) {
				if( ch!=temp.charAt(j) ) {
					nstr += temp.charAt(j);
				}
			}
			
			// set temp to nstr
			temp = nstr;
		}
	}
	
	public void display() {
		System.out.println("Original String: " + str);
		System.out.println("Mask String: " + msk);
		System.out.println("New String: " + nstr);
	}
}

public class ISC2025SpecimenQ6 {
	public static void main(String args[]) {
		StringOp stringOp = new StringOp();
		stringOp.accept();
		stringOp.form();
		stringOp.display();
	}
}
