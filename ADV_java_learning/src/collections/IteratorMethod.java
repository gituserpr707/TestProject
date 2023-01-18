package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorMethod 
{

	public static void main(String args[])
	{
		Map<Integer,String> mpobj = new HashMap<Integer,String>();
		mpobj.put(1, "rk");
		mpobj.put(2, "RK1");
		Set<Integer> setobj = mpobj.keySet();
		Iterator<Integer> iterobj = setobj.iterator();
		while(iterobj.hasNext())
		{
			Integer key = iterobj.next();
			String result = mpobj.get(key);
			String str = mpobj.get(setobj);
			
			System.out.println(result);
			System.out.println(str);
		}
		
	}
}
