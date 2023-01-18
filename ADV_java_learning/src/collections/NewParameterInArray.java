package collections;

import java.util.ArrayList;
import java.util.List;

public class NewParameterInArray
{
	private String name;
	private int age;
	
	
	public NewParameterInArray(String name, int age)
	{
		this.name = name;
		this.age = age;
		
	}
   public static void main(String args[])
   {
	 List<NewParameterInArray> object = new ArrayList<NewParameterInArray>();
	 object.add(new NewParameterInArray("HULI",123));
	 object.add(new NewParameterInArray("infokalash",456));
	 System.out.println(object);
	 
   }
}