
public class Main {
	public static void main(String[] args) throws Exception {
		Node first = new Node(0);
		Node second= new Node(1);
		Node third= new Node(2);
		Node fourth=new Node(3);
		
		first.add(second);
		second.add(third);
		third.add(fourth);
		
		System.out.println(first.computeSum());
	}
}
