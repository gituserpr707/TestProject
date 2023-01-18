package com.Arrays;

class PrintReverse
{
public static void printReverse(int[] arr)
	{
	int n=arr.length;
	//printing in reverse order element
	for(int i=n-1;i>=0;i--)
	{
		System.out.println(arr[i]);
;		
	}
	
		
	}
}
public class Reverse {
	public static void main(String args[])
	{
       int arr[]= {10,52,71,69,48,10};
       PrintReverse Reverse= new PrintReverse();
 
       Reverse.printReverse(arr);
      
	}


}
