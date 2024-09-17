/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java program to convert a decimal value(base 10) to binary value(base 2)
 * 
 * Example 1:
 * Input:
 * n = 10
 * Output: 
 * 1010
 * 
 * Example 2:
 * Input:
 * n = 16
 * Output:
 * 10000
 * 
 */

public class DecimalToBinary {

    static String decimalToBinary(int n) {
        String binaryValue = "";
        if( n==0 ) {
            binaryValue = "0";
        }
        else {
            while( n!=0 ) {
                int r = n%2;
                binaryValue = r + binaryValue;
                n = n/2;
            }
        }
        return binaryValue;
    }

    public static void main(String args[]) {
        int integers[] = {7, 16, 18, 21, 100, 125, 0};
        for( int i=0; i<integers.length; i++ ){
            int x = integers[i];
            System.out.println("(" + x + ")₁₀ = (" + decimalToBinary(x) + ")₂");
        }
    }
}
