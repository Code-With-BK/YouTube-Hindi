/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 4
 * ICSE 2025 Computer Applications Boards Specimen Paper
 */ 
import java.util.Scanner;

class Question4 {

    // the value input by the user
    private double x;
    
    // method to accept input by the user
    public void accept() {
        Scanner scanner = new Scanner(System.in);

        // read an integer from the user
        System.out.print("Enter an value to search : ");
        x = scanner.nextDouble();
    }

    // binary search
    public int binarySearch() {
        // returns the index where this value is found, or returns -1 if the value not found

        // the list of values to search from
        double values[] = {5.6, 11.5, 20.8, 35.4, 43.1, 52.4, 66.6, 78.9, 80.0, 95.5};

        // binary search
        int lo = 0;
        int hi = values.length - 1;

        // as long as the range is valid
        while( lo<=hi ) {
            int mid = lo + (hi-lo)/2;
            if( values[mid]==x ) {
                return mid;
            }
            // else if the value x is larger than the value at mid index
            else if( x>values[mid] ) {
                lo = mid + 1;
            }
            // else if the value x is smaller than the value at mid index
            else {
                hi = mid - 1;
            }
        }

        // return -1 if the value was not found
        return -1;
    }

    public void display() {
        int index = binarySearch();
        // if the index is valid
        if( index>=0 ) {
            // search successful
            System.out.println("Search successful");
            System.out.println("Search element found at " + index);
        }
        else {
            System.out.println("Search element not found");
        }
    }
}

public class ICSE2025SpecimenQ4 {
    public static void main(String args[]) {
        Question4 question4 = new Question4();
        question4.accept();
        question4.display();
    }
}
