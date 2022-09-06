package javadailycode;

public class Day8_ArrayContainsDuplicateUsingIndex {
	
	public static boolean containDuplicate(int[] nums, int k) {
		   boolean flag = false;
		   int ans = 0;

		   for(int i = 0; i < nums.length; i++) {
		      for(int j = i + 1; j < nums.length; j++) {
		         if(nums[i] == nums[j]) {
		            if( Math.abs(i - j) <= k) {
		            return true;
		            }
		         }
		      }   
		   }
		   return false;
		}

	public static void main(String[] args) {
		
		System.out.println(containDuplicate(new int[] {1,2,3,1}, 3));
		System.out.println(containDuplicate(new int[] {1,0,1,1}, 1));
		System.out.println(containDuplicate(new int[] {1,2,3,1,2,3}, 2));

	}

}
