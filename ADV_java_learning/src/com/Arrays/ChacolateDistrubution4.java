package com.Arrays;

import java.util.Arrays;

public class ChacolateDistrubution4 {
	
	public static int distrubution(int[] arr,int m,int n)
	{
		
		/*
		 * The idea is based on the observation that to minimize the difference,
		 *  we must choose consecutive elements from a sorted packet. 
		 *  We first sort the array arr[0..n-1], 
		 *  then find the subarray of size m with the minimum difference between the last and first elements
		 */
		
		
		int max_value=Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i=0;i<n-m;i++)
		{
			//get minimum value in the given array
			int min=arr[i];
			//get the max value from the sub array
			int max=arr[i+m-1];
			// find the difference between max and min
			int diffrence = max-min;
			//swap if min<max_value, return min value
			if((min<max_value))
			{
				max_value=min;
			 
			}
		}
		
		return max_value;
	}
	public static void main(String args[])
	{
		int[] nums = { 7, 3, 2, 4, 9, 12, 56};
		int n=nums.length;
		int m=3;
		System.out.println(distrubution(nums,m,n));
		;
	}
	
	

}
