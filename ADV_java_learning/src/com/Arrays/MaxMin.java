package com.Arrays;

class FindMaxMin
{
	//logic - finding the max
	public static int findMax(int arr[])
	{
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	return max;
	
		
	}
	//logic - finding the min 
	public static int findMin(int arr[])
	{
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	return min;
	
		
	}
}
public class MaxMin {

	public static void main(String args[])
	{
       int arr[]= {10,52,71,69,48,10};
       FindMaxMin maxminobj= new FindMaxMin();
     //calling the method
       System.out.println(maxminobj.findMax(arr));
       System.out.println(maxminobj.findMin(arr));
	}

	
}
