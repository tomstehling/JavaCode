package main.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListUtils {

	/**
	 * Create and return a LinkedList with the following Strings: "This", "is",
	 * "my", "first", "LinkedList".
	 */
	public static List<String> createLinkedList() {
		List<String> list = new LinkedList<>();
		list.add("This");
		list.add("is");
		list.add("my");
		list.add("first");
		list.add("LinkedList");
		return list;
	}

	/**
	 * Get the 5th element of the given List.
	 *
	 * @throws IndexOutOfBoundsException if integerList.size() < 5
	 */
	public static Integer getFifthElement(List<Integer> integerList) throws IndexOutOfBoundsException {
	if(integerList.size()>=5) {
		int i=integerList.get(4);
		System.out.println(i);
		
		return i;
	}
	else {throw new IndexOutOfBoundsException("Index out of Bounds");}
	}

	/**
	 * Sort the given List in ascending order and return it.
	 */
	public static List<Integer> sortAscending(List<Integer> integerList) {
		List<Integer> order= new ArrayList<>();
		integerList.sort(null);
		return integerList;
		
	}

}
