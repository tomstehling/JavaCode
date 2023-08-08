
public class uml1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	



public abstract class Meal{
	public String taste;
	public int weight;
}
public class Pet extends Meal {
	protected String name;
	public void makeSound() {}
	private Meal meal;
}

public class Dog extends Pet{}
public class Cat extends Pet{}
public class Mouse extends Pet{}


public class Person{
	public static int counter;
	public int id;
	private String firstName;
	private String lastName;
	private Pet [] pets;
	
	
}


}