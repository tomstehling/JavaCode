package main.collections.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamUtils {

	/**
	 * Filter the keys from the given Map, that are < 10, sort them in ascending
	 * order and collect them into a List.
	 */
	public static List<Integer> fetchKeysSmallerThanTen(Map<Integer, String> integerToStringMap) {
		List<Integer> list=new ArrayList<>(integerToStringMap.keySet()
				.stream()
				.filter(num->num<10).sorted().collect(Collectors.toList()));
		System.out.println(list);
		return list;
	}

	/**
	 * Multiply every element in the given Set by 2, sort them in descending order
	 * and return them as a LinkedHashSet.
	 */
	public static LinkedHashSet<Integer> doubleAndSort(Set<Integer> integerSet) {
		List<Integer> linked = new ArrayList<>(integerSet.stream().sorted().map(i->2*i).collect(Collectors.toList()));
		LinkedHashSet<Integer> set=new LinkedHashSet<>(linked);
		
		System.out.println("this is linked"+set);
		return set;
		
	}

	/**
	 * Compute the product of all elements in the given Collection. If the
	 * Collection is empty, return 1 as it is the neutral element for
	 * multiplication.
	 */
	public static Integer product(Collection<Integer> integerList) {
		if(integerList.size()!=0) {
			int product= integerList.stream().reduce((i1,i2) -> i1*i2).get();
			return product;
		}
		else {return 1;}
	}
}
