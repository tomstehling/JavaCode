
public class uml2 {

	public static void main(String[] args) {
}
	
}


	 class Expression{
		public int evaluate() {
			return 1;
		} 				
	}
	 class Constant{
		private int value;
		public void setValue( int wert) {
			this.value= wert;
		}
		public int getValue() {
			return this.value;
		}
	}
	 class Operator extends Expression{
		protected Constant first;
		protected Constant second;
	}
	 class Add extends Operator{}
	 class Sub extends Operator{}

