import java.util.Scanner;

/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 7
 * ISC 2025 Computer Science Boards Specimen Paper
 */

class Mixarray {
	
	private int arr[];
	private int cap;
	
	// private static Scanner scanner = new Scanner(System.in);
	
	public Mixarray(int mm) {
		cap = mm;
		arr = new int[cap];
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		
		// ask the user to enter cap number of integers
		System.out.print("Enter " + cap + " integers: ");
		for( int i=0; i<cap; i++ ) {
			arr[i] = scanner.nextInt();
		}
	}
	
	public Mixarray mix(Mixarray P, Mixarray Q) {
		Mixarray M = new Mixarray(6);
		int index = 0;
		
		// copy first three values from P
		for( int i=0; i<3; i++ ) {
			M.arr[index++] = P.arr[i];
		}
//		M.arr[0] = P.arr[0];
//		M.arr[1] = P.arr[1];
//		M.arr[2] = P.arr[2];
		
		
		// copy the next 3 values from Q
		for( int i=0; i<3; i++ ) {
			M.arr[index++] = Q.arr[i];
		}
//		M.arr[3] = Q.arr[0];
//		M.arr[4] = Q.arr[1];
//		M.arr[5] = Q.arr[2];
		
		return M;
	}
	
	public void display() {
		System.out.print("Array: [");
		for( int i : arr ) {
			System.out.print(i + " ");
		}
		System.out.println("] ");
	}
}

public class ISC2025SpecimenQ7 {
	public static void main(String args[]) {
		Mixarray P = new Mixarray(4);
		P.input();
		
		Mixarray Q = new Mixarray(3);
		Q.input();
		
		Mixarray M = P.mix(P, Q);
		// Mixarray M = Q.mix(P, Q);
		
		// show the objects
		System.out.print("P ");
		P.display();
		
		System.out.print("Q ");
		Q.display();
		
		System.out.print("Mix ");
		M.display();
	}
}
