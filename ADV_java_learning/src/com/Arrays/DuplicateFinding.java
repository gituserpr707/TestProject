package com.Arrays;

public class DuplicateFinding {
	public static void containsDuplicate(int[] nums, int len) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}

			}
		}

		// If count reaches the 
		if (count > 1) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
		

	}

	public static void main(String args[]) {
		int[] nums = { 1, 2, 3, 4 };
		int n=nums.length;
		containsDuplicate(nums,n);
	}
}
