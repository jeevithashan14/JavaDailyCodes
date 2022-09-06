package javadailycode;

/*
Given an integer array nums and an integer k, return true 
if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/

import java.util.HashMap;
import java.util.Map;

public class Day8_ArrayContainsDuplicateUsingHash {
	
	public static boolean containsDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i=0; i<nums.length;i++) {
			
			if(map.containsKey(nums[i])) {
				if (i-map.get(nums[i]) <= k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}

	public static void main(String[] args) {	
		
		System.out.println(containsDuplicate(new int[] {1,2,3,1}, 3));
		System.out.println(containsDuplicate(new int[] {1,0,1,1}, 1));
		System.out.println(containsDuplicate(new int[] {1,2,3,1,2,3}, 2));
	}

}
