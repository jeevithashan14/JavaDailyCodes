package javadailycode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
   Note:
      Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
        Example 1:
        Input: [4,1,2,1,2]
        Output: 4  
*/

public class Day3_SingleNumberInArray {
	
	public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        Iterator<Integer> itr = set.iterator();
        return itr.next();
    }	

	public static void main(String[] args) {
		// int nums[] = {1};
		// int nums[] = {2,2,1};
		int nums[] = {4,1,2,1,2};
		 System.out.println(singleNumber(nums));
	}

}
