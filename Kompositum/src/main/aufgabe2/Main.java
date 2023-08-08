package main.aufgabe2;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Tree first = new Node(0);
		Tree second= new Node(1);
		Tree third= new Node(2);
		Tree fourth=new Node(3);
		Tree fifth= new Leaf(4);
		
		
		first.add(second);
		second.add(third);
		third.add(fourth);
		fourth.add(fifth);
		
		System.out.println(second.computeSum());
		
	}
}
