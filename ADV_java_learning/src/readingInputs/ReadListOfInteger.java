package readingInputs;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadListOfInteger {
	 public static void main(String[] args){
	      Scanner scan = new Scanner(System.in);
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      while(scan.hasNextInt()){
	         list.add(scan.nextInt());
	      }
	      Integer[] nums = new  Integer[list.size()];
	      nums = list.toArray(nums);
	      for(int i = 0;i < nums.length; i++){
	      System.out.println(nums[i]);
	      }   
	}

}
