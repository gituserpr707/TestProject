package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


 class Node1
{
	int data;
	Node1 left;
	Node1 right;

	Node1(int data)	
	{
		this.data=data;
		this.left=null;
		this.right=null;
		
	}
	
}
class  level
{
	public static int printing(Node1 root)
	{
		if (root==null)
			
		{
			return 0;
		}
		else
		{
		 int l=printing(root.left);
		 int h=printing(root.right);
		 return (l>h?l:h)+1;
		 
		}
		
		
 	}
}
public class PrintAllSubArrray {
	
		public static void main(String args[])
		{
			Node1 root=null;
			root=new Node1(10);
			root.left=new Node1(20);
			root.right=new Node1(25);
			root.left.left=new Node1(89);
			root.left.right=new Node1(45);
			root.right.left=new Node1(88);
			root.right.right=new Node1(36);
			level.printing(root);
		
	}
}
	
	