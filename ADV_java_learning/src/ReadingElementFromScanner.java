import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ReadingElementFromScanner {
	
//	https://www.folkstalk.com/tech/input-string-a-list-in-java-with-code-examples/
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	ArrayList <Integer> al2 = new ArrayList<Integer>();
	System.out.println("enter the item in list");
	while(sc.hasNextInt())
	{
	al2.add(sc.nextInt());
	}
	Iterator it1 = al2.iterator();
	/*loop will be terminated when it will not get integer value */
	     while(it1.hasNext())
	{
	 System.out.println(it1.next());
	}
	}
	}

