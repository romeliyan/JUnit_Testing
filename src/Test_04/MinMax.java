package Test_04;

import java.util.Arrays;

public class MinMax {
	
	//get the Minimum Number
	public int getMin(int[] nums) {
		
		int min = nums[0];
		
		for(int i =1 ; i < nums.length ; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		
		return min;
	}
	
	//get the Minimum Number - method II
	public int getMinimum(int[] nums) {
		
		Arrays.sort(nums);
		int min = nums[0];
		return min;
	}
	
	
	//get the Maximum Number
	public int getMax(int[] nums) {
		
		Arrays.sort(nums);
		int max = nums[nums.length-1];
		return max;
	}
	
}
