/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 9
 * ISC 2025 Computer Science Boards Specimen Paper
 */

class Recycle {
	private int ele[];
	private int cap;
	private int front;
	private int rear;
	
	public Recycle(int max) {
		cap = max;
		ele = new int[cap];
		front = rear = 0;
	}
	
	public void pushfront(int v) {
		// complete
		// if there is a space to add at front
		if( front!=0 ) {
			ele[front-1] = v;
			front--;
		}
		// else cannot add to front
		else {
			System.out.println("full from front");
		}
	}
	
	public int popfront() {
		if( front==rear ) {
			return -999;
		}
		else {
			// popping from the front on the same index where front is
			int poppedElement = ele[front];
			front++;
			return poppedElement;
		}
	}
	
	public void pushrear(int v) {
		if( rear==cap ) {
			System.out.println("full from rear");
		}
		else {
			// add at rear where the rear index is
			ele[rear++] = v;
		}
	}
	
	public int poprear() {
		// complete
		// if the dequeue is empty
		if( front==rear ) {
			return -999;
		}
		// else if the dequeue is not empty
		else {
			// get the value at rear
			int poppedElement = ele[--rear];
			return poppedElement;
		}
	}
	
	public void display() {
		if( front==-1 ) {
			System.out.printf("%-3s","f");
		}
		else {
			System.out.printf("%-3s","");
		}
		for( int i=0; i<cap; i++ ) {
			if( i==front && i==rear ) {
				System.out.printf("%-3s","fr");
			}
			else if( i==front ) {
				System.out.printf("%-3s","f");
			}
			else if( i==rear ) {
				System.out.printf("%-3s","r");
			}
			else {
				System.out.printf("%-3s","");
			}
		}
		if( rear==cap ) {
			System.out.printf("%-3s","r");
		}
		System.out.println();
	
		System.out.printf("%-3s","");
		for( int i=0; i<cap; i++ ) {
			System.out.printf("%-3d",ele[i]);
		}
		
		System.out.println("\n");
	}
}

public class ISC2025SpecimenQ9 {
	public static void main(String args[]) {
		Recycle recycle = new Recycle(10);
		recycle.display();
		recycle.pushfront(98);
		
		recycle.pushrear(10);
		recycle.display();
		
		recycle.pushrear(34);
		recycle.display();
		
		recycle.pushrear(19);
		recycle.display();
		
		System.out.println("Pop from front: " + recycle.popfront());
		recycle.display();
		
		recycle.pushfront(98);
		recycle.display();
		
		System.out.println("Pop from front: " + recycle.popfront());
		recycle.display();
		System.out.println("Pop from front: " + recycle.popfront());
		recycle.display();
		System.out.println("Pop from front: " + recycle.popfront());
		recycle.display();
		
	}
}
