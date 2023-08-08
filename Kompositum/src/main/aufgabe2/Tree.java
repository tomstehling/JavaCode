package main.aufgabe2;

public abstract class Tree {
	protected Integer value;
	protected Tree successor;
	
	public Tree(Integer value) {
		this.value=value;
	}
	
	
	public Boolean contains (Tree tree) {
		Tree current=this;
		while (current!=tree) {
			if (current.getSuccessor()==null) {
				return false;
			}
			current=current.getSuccessor();
			
		}
		return true;
		
	}
	
	public Integer fetchSize() {
		Tree current=this;
		Integer size=0;
		while(current!=null) {
			size++;
			current=current.getSuccessor();
		}
		return size;
	}
	
	public Integer computeSum() {
		Integer sum=0;
		Tree current = this;
		while(current!=null) {
			sum=current.getValue()+sum;
			current=current.getSuccessor();
		}
		return sum;
	}
	
	
	
	public void add(Tree tree) throws Exception {
		if (this.contains(tree)==false) {
			this.successor=tree;
		}
		else {throw new Exception ("text");}
	}
	
	public Tree getSuccessor() {
		return successor;
	}


	protected Integer getValue() {
		return this.value;
	}
	
	protected void setValue(Integer value) {
		this.value=value;
	}
}



