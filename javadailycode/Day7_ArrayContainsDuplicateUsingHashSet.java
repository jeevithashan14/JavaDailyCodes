package javadailycode;

import java.util.HashSet;
import java.util.Set;

/*
Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

public class Day7_ArrayContainsDuplicateUsingHashSet {
	
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> setNums = new HashSet<Integer>();
		//for(int i=0; i<nums.length;i++ ) {
		for (int num : nums) {
			//if(setNums.contains(nums[i])) {
			if(setNums.contains(num)) {
				return true;
			}	
			else {
				//setNums.add(nums[i])
				setNums.add(num);
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		System.out.println(containsDuplicate(new int[] {1,2,3,1}));
		System.out.println(containsDuplicate(new int[] {1,2,3,4}));
		System.out.println(containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));

	}

}
