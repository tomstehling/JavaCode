package main.aufgabe2;

public class Leaf extends Tree{
	
	
	public Leaf (Integer value) {
		super(value);
	}
	
	public Integer getValue() {
		return this.value;
	}
	
	
	@Override
	public void add(Tree tree) throws Exception {
		System.out.println("cant add sucessor");
	}
	
	public Node getSuccessorNode() {
		System.out.println("a leaf never has a sucessor");
		return null;
	}
	
	@Override
	public Integer computeSum()  {
		return this.getValue();
	}

	@Override
	public Boolean contains (Tree tree) {
		System.out.println("a leaf only contains itself, because it has no successor");
		return false;
		
	}

	@Override
	public Integer fetchSize() {
		System.out.println("the size of a leaf is always 1 because it has no successor");
		return 1;
	}

}
