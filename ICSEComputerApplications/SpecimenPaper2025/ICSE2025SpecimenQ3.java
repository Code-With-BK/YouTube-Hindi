import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 3
 * ICSE 2025 Computer Applications Boards Specimen Paper
 */

class Bank {
	
	// data members
	private double p;
	private double n;
	private double r;
	private double a;
	
	public void accept() {
		// scanner class object to read values from the user
		Scanner scanner = new Scanner(System.in);
		
		// ask the user to enter the principal amount
		System.out.print("Enter principal amount: ");
		p = scanner.nextDouble();
		
		// ask the user to enter the time period
		System.out.print("Enter the time period: ");
		n = scanner.nextDouble();
	}
	
	public void calculate() {
		// calculate rate first
		if( n<=0.5 ) {
			r = 9;
		}
		else if( n<=1 ) {
			r = 10;
		}
		else if( n<=3 ) {
			r = 11;
		}
		else {
			r = 12;
		}
		
		// calculate amount
		a = p*Math.pow(1 + r/100, n);
	}
	
	public void display() {
		// print the header
		System.out.printf("%-15s %-10s %-6s %-15s\n", "Principal", "Time", "Rate", "Amount");
		
		// print the values
		System.out.printf("%-15s %-10s %-6s %-15s\n", "Rs. " + p, n + " years", r + "%", "Rs. " + String.format("%.2f", a));
	}
}

public class ICSE2025SpecimenQ3 {
	public static void main(String args[]) {
		Bank bank = new Bank();
		bank.accept();
		bank.calculate();
		bank.display();
	}
}
