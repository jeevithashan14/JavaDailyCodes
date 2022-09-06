package javadailycode;

import java.util.HashSet;

/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not. 

Example 1:

Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
As we reached to 1, 19 is a Happy Number.

Example 2:

Input: n = 2
Output: false
 */

public class Day4_HappyNumber {
	
    public static boolean isHappyNumber(int n) {
        HashSet<Integer> set = new HashSet();
        set.add(n);
        int sum = n;
        while(sum!=1){
            sum = getDigitSqrSum(sum);
            if(set.contains(sum)){
                return false;
            } else {
                set.add(sum);
            }
        }
        return true;
    }
    
    public static int getDigitSqrSum(int n){
        int sum = 0;
        while(n!=0){
            int d = n%10;
            sum+=(d*d);
            n=n/10;
        }
        return sum;
    }  

	public static void main(String[] args) {
		System.out.println("Is 19 happy number? "+isHappyNumber(19));
		System.out.println("Is 2 happy number? "+isHappyNumber(2));
	}
}
