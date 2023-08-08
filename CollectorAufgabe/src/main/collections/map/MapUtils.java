package main.collections.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class MapUtils {
	
	/**
	 * Creates and a returns a Map with the following entries: - "milk": 5 -
	 * "bread": 3 - "honey": 1
	 */
	public static Map<String, Integer> createShoppingList() {
		Map<String,Integer> shopping=new HashMap<String,Integer>();
		shopping.put("milk", 5);
		shopping.put("bread", 3);
		shopping.put("honey", 1);
		System.out.println(shopping);
		return shopping;
	}
	
	
	/**
	 * Return the keys of the given Map.
	 */
	public static Set<String> getKeys(Map<String, Integer> stringToIntegerMap) {
		Set <String> keys = new HashSet<String>();
		
		keys=stringToIntegerMap.keySet();
		return keys;
		
	}

	/**
	 * Get the biggest value of the given Map.
	 *
	 * @throws NoSuchElementException if the given Map is empty.
	 */
	public static Integer getBiggestValue(Map<String, Integer> stringToIntegerMap) {
		int size = stringToIntegerMap.size();
		
		if(size>0) {
			ArrayList<Integer> values= new ArrayList<>(stringToIntegerMap.values());
			 int maximum = values.get(0);
		        for (int i = 1; i < values.size(); i++) {
		            if (maximum < values.get(i))
		                maximum = values.get(i);
		        }
		        return maximum;
		}
		else {throw new NoSuchElementException("no such element");}
	}

}
