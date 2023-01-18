package com.Arrays;

class bubble
{
	public static int[] sort(int arr[])
	{
		int n=arr.length;
	for (int i=0;i<arr.length-1;i++)
       {
    	   for(int j=0;j<arr.length-i-1;j++)
    	   {
    		   if(arr[j]>arr[j+1])
    		   {
    			   int temp =arr[j];
    			   arr[j]=arr[j+1];
    			   arr[j+1]=temp;
    		   }
    	   }
    	   
       }
	return arr;
	
	}
}
public class PracticeBubbleSort {

	public static void main(String args[])
	{
		int arr[]= {10,52,71,69,48,10};
		bubble.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	 
	 
}
