package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetKeyMethod
{
	public static void main(String args[])
	{
//	    create and instantiate map object 
		Map<Integer,String> mapObj = new HashMap<Integer,String>();
		mapObj.put(1, "IK");
		mapObj.put(2, "info");
		mapObj.put(3, "kalash");
		mapObj.put(4, "infokalash");
		
//		create map.keySet method to print all the values
//		to print all the keys 
		Set<Integer> setkey = mapObj.keySet();  
		
//		Set<String> setValues = mapObj.keySet(); 
		Iterator<Integer> iterObj = mapObj.keySet().iterator();
		while(iterObj.hasNext())
		{
			Integer key = iterObj.next();
			String value = mapObj.get(key);
			System.out.println(value);
		}
//		iteration through the for each method
		for(Integer key:mapObj.keySet())
		{ 
			System.out.println("result by using the for loop");
			System.out.println(mapObj.get(key));
		}
		
//		result of the map.keySet()
		System.out.println("The elements of keys");
		System.out.println(setkey);  
	
		
		
		
	}

}
