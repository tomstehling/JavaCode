package aufgabe2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParralellStreams {
	
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Alpha-Centauri","Kepler-22b","Kepler62f","Gliese667Cc");
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		List<Integer> list3 = Arrays.asList(9,1,5,3,2,4,6);
	
		//Teil1
		list1.parallelStream().filter(i->i.contains("epler")).findFirst().ifPresent(i -> System.out.print(i + " "));
		
		
		//Teil2
		List<Integer> list = list2.parallelStream().skip(1).filter(i->i%2!=0).limit(3).collect(Collectors.toList());
		
		//Teil3
		int sum=list3.parallelStream().mapToInt(i ->i).sum();
		list3.parallelStream().mapToDouble(i->(double)i/sum).boxed().toList().forEach(i -> System.out.print(i + " "));
	
		
		
	
		
	}

}
