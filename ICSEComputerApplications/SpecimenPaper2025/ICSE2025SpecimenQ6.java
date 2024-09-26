import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 6
 * ICSE 2025 Computer Applications Boards Specimen Paper
 */

class Question6 {
	
	// 2D array
	private int arr[][];
	
	// to store the size of the array
	private int size;
	
	// the constructor
	public Question6() {
		size = 4;
		arr = new int[size][size];
	}
	
	// method to accept values into the 2D array
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		
		// read 4 values for each row
		for( int i=0; i<size; i++ ) {
			// ask the user to enter 4 integers for this row
			System.out.print("Enter 4 integers for row " + (i+1) + " : ");
			for( int j=0; j<size; j++ ) {
				arr[i][j] = scanner.nextInt();
			}
		}
	}
	
	// method to find the sum of a row
	public int findRowSum(int row[]) {
		int rowSum = 0;
		for( int i : row ) {
			rowSum += i;
		}
		return rowSum;
	}
	
	// method to print the row sums
	public void printRowSums() {
		// for each row
		for( int i=0; i<size; i++ ) {
			// find the sum
			int rowSum = findRowSum(arr[i]);
			// print row sum
			System.out.print("Sum of row " + (i+1) + " = " + rowSum);
			
			// print elements of this row
			System.out.print("(");
			for( int j=0; j<size; j++ ) {
				System.out.print(arr[i][j]);
				if( j+1<size ) {
					System.out.print("+");
				}
			}
			System.out.println(")");
		}
	}
}

public class ICSE2025SpecimenQ6 {
	public static void main(String args[]) {
		Question6 question6 = new Question6();
		question6.accept();
		question6.printRowSums();
	}
}
