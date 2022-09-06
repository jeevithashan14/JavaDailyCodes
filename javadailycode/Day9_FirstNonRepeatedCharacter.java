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

import java.util.HashSet;
import java.util.Set;

public class Day9_FirstNonRepeatedCharacter {
	
        public static int repeatCharacter(String s) {        
        
        Set<String> set=new HashSet<String>();         
        
        for (int i = 0; i < s.length(); i++) {        	
            String temp = String.valueOf(s.charAt(i));            
         
        String sub=s.substring(i+1);
                if (set.add(temp) && !sub.contains(temp)) {
                    return i;
                }
        }
        return -1;
    }

	public static void main(String[] args) {
		
		System.out.println("First non-repeated charcter: "+repeatCharacter("leetcode"));
		System.out.println("First non-repeated charcter: "+repeatCharacter("loveleetcode"));
		System.out.println("First non-repeated charcter: "+repeatCharacter("aabb"));

	}

}
