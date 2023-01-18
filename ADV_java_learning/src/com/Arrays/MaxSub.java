package com.Arrays;


public class MaxSub {
	static void maxSubArraySum(int a[], int size)
    {
        int max_sum=0;   //initilise with 0
        int current_sum=0;  //initilise with 0
        
        for(int i=0;i<a.length;i++)
        {
        	current_sum+=a[i];  
        	if(current_sum > max_sum)
        	{
        		max_sum=current_sum;
        	}
        	if(current_sum<0){
        		current_sum=0;
        		
        	}
        }
        System.out.println("Maximum contiguous sum is "
                           + max_sum);
        System.out.println("Maximum contiguous sum is "
                + current_sum);
    
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int a[] = { 5,-4,-2,6,-1 };
        int n = a.length;
        maxSubArraySum(a, n);
    }
	

}
