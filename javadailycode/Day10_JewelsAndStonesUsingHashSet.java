package javadailycode;

import java.util.HashSet;
import java.util.Set;

/*
 You're given strings jewels representing the types of stones that are jewels, and 
 stones representing the stones you have. Each character in stones is a type of stone you have. 
 You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
 */

public class Day10_JewelsAndStonesUsingHashSet {
	
	public static int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		Set<Character> setJewels = new HashSet<Character>();
		for(char jewel : jewels.toCharArray()) {
			for (char stone : stones.toCharArray()) {
				if(jewel == stone) {
					count++;
				}
			}
	 } 
                return count;
    }


	public static void main(String[] args) {
		    
		System.out.println(numJewelsInStones("aA","aAAbbbb"));
		System.out.println(numJewelsInStones("z","ZZ"));

	}

}
