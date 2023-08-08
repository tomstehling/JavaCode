package main.collections.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class SetUtils {

	
	
		
	/**
	 * Get the biggest element of the given Set and return it.
	 *
	 * @throws NoSuchElementException if the given Set is empty.
	 */
	public static Integer getBiggestInteger(Set<Integer> integerSet) {
		
			int size=integerSet.size();
			if (size!=0) {
				int biggestInteger=0;
				for (Integer i : integerSet) { 
				
					if (i > biggestInteger) {
						biggestInteger=i;
	
					}
					
				
					
				}
				//System.out.println("bI"+biggestInteger);
				//System.out.println(size);
				return biggestInteger;
				}
			else {throw new NoSuchElementException("no element in Set");}
			
		
			
	}
		

	/**
	 * Create and return a TreeSet, that contains the Integers from 1 to 9 in
	 * descending order.
	 */
	public static TreeSet<Integer> createTreeSet() {
		
		TreeSet<Integer> tree=new TreeSet<Integer>(new Comparator <Integer>() {
			public int compare (Integer i ,Integer i2) {
			if (i>i2) return -1;
			else if (i<i2) return 1;
			else return 0;
			}});
		
			for (int i=1;i<10;i++) {
				tree.add(i);
			}
			//System.out.println(tree);
			return tree;
			
		//throw new UnsupportedOperationException("Not implemented yet!");
	}

	
	
	
	/**
	 * Get and return three elements from the given Set.
	 *
	 * @throws NoSuchElementException if the given Set contains less than three
	 *                                elements.
	 */
	public static Set<String> getThreeElements(Set<String> stringSet) {
		
		TreeSet<String> threeSet=new TreeSet<String>();
		
		int size=stringSet.size();
		System.out.println(size);
		
		if(size>3) {
			Iterator<String> iterator = stringSet.iterator();
			for(int i=0;i<3;i++) {
				if(iterator.hasNext()) threeSet.add(iterator.next());
			}
			
			System.out.println(threeSet);
			return threeSet;
		}
	
	else {throw new NoSuchElementException ("no such element");}

}}
