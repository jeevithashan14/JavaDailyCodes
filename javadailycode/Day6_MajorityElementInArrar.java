package javadailycode;

import java.util.Arrays;

public class Day6_MajorityElementInArrar {

	public static int majorityElement(int[] nums) {		
		int len = nums.length;
		Arrays.sort(nums);		
		return nums[len/2];

	}
	
	public static void main (String[] args) {
		int []  nums = {3,2,3};
		System.out.println(majorityElement(nums));
	}

}
