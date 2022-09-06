package javadailycode;
/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 */

public class Day9_FirstNonRepeatedCharactersUsingIndex {

	public static void main(String[] args) {
		
		String inputStr = "loveleetcode";
		boolean flag = true;
		
		for (char i : inputStr.toCharArray()) {
			if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: "+i);
				System.out.println("First non-repeating character index is: "+inputStr.indexOf(i));
				flag = false;
				break;
			}
		}
        if (flag) {
        	System.out.println("There is no non-repeating character in input string");
        }
	}

}
