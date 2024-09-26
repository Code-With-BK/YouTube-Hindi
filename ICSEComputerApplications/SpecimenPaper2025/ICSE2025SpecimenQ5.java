import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 5
 * ICSE 2025 Computer Applications Boards Specimen Paper
 */

class Question5 {
	
	// string to be read input by the user
	private String str;
	
	// the new converted string
	private String newstr;
	
	// constructor
//	public Question5(String s) {
//		str = s;
//		newstr = "";
//	}
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		
		// ask the user to enter a string
		System.out.print("Enter a string: ");
		str = scanner.nextLine();
	}
	
	public void convert() {
		newstr = "";
		
		// to store str in upper case
		String strUC = str.toUpperCase();
		
		// convert
		for( int i=0; i<strUC.length(); i++ ) {
			char ch = strUC.charAt(i);
			
			// if this character is a vowel
			if( ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ) {
				char nextChar = (char)(ch + 1);
				newstr += nextChar;
			}
			// else if ch is a consonant
			else if ( /*ch>='A' && ch<='Z'*/ Character.isLetter(ch) ) {
				char prevChar = (char)(ch - 1);
				newstr += prevChar;
			}
			// else if ch is not a letter
			else {
				newstr += ch;
			}
		}
	}
	
	public void display() {
		System.out.println("Original String : " + str);
		System.out.println("Converted String: " + newstr);
		
	}
}

public class ICSE2025SpecimenQ5 {
	public static void main(String args[]) {
		// Question5 question5 = new Question5("Java@2024");
		Question5 question5 = new Question5();
		question5.accept();
		question5.convert();
		question5.display();
	}
}
