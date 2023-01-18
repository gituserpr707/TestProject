package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapIterator 
{

	public static void main(String args[])
	{
		Map<String,String> mapping = Stream.of(new String [][] {{"ik","Infokalash"},{"Pk","prashant"}}).collect(Collectors.toMap(p ->p[0],p -> p[1]));
		Set<Map.Entry<String, String>> eachEntry = mapping.entrySet();
		Iterator <Map.Entry<String,String>> iterator = eachEntry.iterator();
		System.out.println("the map keys and values");
		System.out.println("key   values");
		while(iterator.hasNext())
		{
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
	}
}
