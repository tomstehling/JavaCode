package Aufgabe3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[]args) {
		
		List<Integer> list=Arrays.asList(10,20,30,40);
		List<Integer> otherlist=Arrays.asList(10,20,30,40);
		
		Integer resultStream =list.stream().reduce(0,(a,b)->a+b)+10;
		System.out.println("result stream:  "+resultStream);
		
		
		otherlist.parallelStream().reduce((a,b)->a+b).map(i->(Integer)i+10).ifPresent(i-> System.out.println(i));
		
	}
}
