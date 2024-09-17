
/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java program to convert a binary value to its corresponding decimal equivalent
 * 
 * Example 1:
 * Input:
 * b = "1010"
 * Output: 
 * 10
 * 
 * Example 2:
 * Input:
 * b = "10000"
 * Output:
 * 16
 */
public class BinaryToDecimal { 
    static int binaryToDecimal1(String binaryValue) {
        int power = 0;
        int sum = 0;
        for( int i=binaryValue.length()-1; i>=0; i--,power++ ) {
            char bit = binaryValue.charAt(i);
            if( bit=='1' ) {
                sum += (int)Math.pow(2,power);
            }
        }
        return sum;
    }

    static int setIthBit(int n, int i) {
        return (n|(1<<i));
    }

    static int binaryToDecimal2(String binaryValue) {
        int n = 0;
        int index = 0;
        for( int i=binaryValue.length()-1; i>=0; i--,index++ ) {
            char bit = binaryValue.charAt(i);
            if( bit=='1' ) {
                n = setIthBit(n, index);
            }
        }
        return n;
    }

    public static void main(String args[]) {
        String binaryValues[] = {"111", "10000", "1010", "1111101"};
        for( int i=0; i<binaryValues.length; i++ ) {
            String binaryValue = binaryValues[i];
            int decimalValue = binaryToDecimal2(binaryValue);
            System.out.println("(" + binaryValue + ")₂ = (" + decimalValue + ")₁₀");
        }
    }
}
