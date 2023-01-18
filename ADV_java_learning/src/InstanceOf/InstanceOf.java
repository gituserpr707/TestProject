package InstanceOf;

import oops.Main;

public class InstanceOf 
{

	public static void main(String args[])
	
	{
//		
		
		Main m = new Main();    //creating simple object 
		if(m instanceof Main)    // m is the instance and Main is the Type and Instanceof is the keyword
		{
		
			System.out.println("yes is is");
		}
		else
		{
			System.out.println("no it is not");
		}
		
		
//		result of the instanceof keyword always will be in the boolean
		
		
		String str= "hello";
		boolean result = str instanceof String ;
		System.out.println(result);
	}
}
