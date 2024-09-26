/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 8
 * ICSE 2025 Computer Applications Boards Specimen Paper
 */

class Question8 {
	
	public void display() {
		for( int i=0; i<3; i++ ) {
//			boolean flag = false;
			for( int j=0; j<5; j++ ) {
//				if( flag ) {
//					System.out.print("2 ");
//				}
//				else {
//					System.out.print("1 ");
//				}
//				flag = !flag;
				if( j%2!=0 ) {
					System.out.print("2 ");
				}
				else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
	
	public void display(int n, int m) {
		if( m>n ) {
			int q = m/n;
			System.out.println(m + "/" + n + " = " + q);
		}
		else {
			int sum = 2*n + 3*m;
			System.out.println("(2 x " + n + ") + (3 x " + m + ") = " + sum);
		}
	}
	
	public double display(double a, double b, double c) {
		double p = (a+b)/c;
		double q = a+b+c;
		double z = p*q;
		System.out.println("z = " + z);
		return z;
	}
}

public class ICSE2025SpecimenQ8 {
	public static void main(String args[]) {
		Question8 question8 = new Question8();
		question8.display();
		System.out.println();
		
		int m = 41;
		int n = 50;
		question8.display(n,m);
		System.out.println();
		
		double a = 4;
		double b = 5;
		double c = 1;
		question8.display(a, b, c);
		
	}
}
