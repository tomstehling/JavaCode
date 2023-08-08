package main.aufgabe3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Component car = new Product("car",0);
		Component rim = new Material("rim",5);
		Component tyre = new  Material("tyre",2);
		Component windshield = new Material("windshield", 3);
		Component door = new Product("door", 5);
		Component handle = new Material("handle",5);
		Component hinge = new  Material("hinge",2);
		
		door.add(handle);
		door.add(hinge);
		car.add(tyre);
		car.add(rim);
		car.add(door);
		car.add(door);

		
		
		
		
		System.out.println("----__----");
		System.out.println(door.fetchTotalPrice());
		List <Material> materialList =door.fetchMaterialList();
		System.out.println(materialList.stream().map(i->i.name).collect(Collectors.toList()));
		
		
	}
}
