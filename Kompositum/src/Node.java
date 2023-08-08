
public class Node {

	public Integer value;
	public Node successorNode;
	
	
	
	public Node(Integer value) {
		this.value=value;
	}
	
	public Integer getValue() {
		return this.value;
	}
	
	public void add(Node node) throws Exception {
		if (this.contains(node)) {
			throw new Exception("CyclicStructureException thrown");
		}
		else{this.successorNode=node;}
	}
	
	public Node getSuccessorNode() {
		return successorNode;
	}
	
	public Boolean contains (Node node) {
		Node current=this;
		while (current!=node) {
			if (current.getSuccessorNode()==null) {
				return false;
			}
			current=current.getSuccessorNode();
			
		}
		return true;
		
	}
	
	public Integer fetchSize() {
		Node current=this;
		Integer size=0;
		while(current!=null) {
			size++;
			current=current.getSuccessorNode();
		}
		return size;
	}
	
	public Integer computeSum() {
		Integer sum=0;
		Node current = this;
		while(current!=null) {
			sum=current.getValue()+sum;
			current=current.getSuccessorNode();
		}
		return sum;
	}
	
	
}
