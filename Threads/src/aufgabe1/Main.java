package aufgabe1;
public class Main {
	public static void main(String[] args) throws InterruptedException {
		ThreadCounter threadCounter = new ThreadCounter("Tom");
		Thread counter = new Thread(threadCounter);
		Thread counter2 = new Thread(threadCounter);
		counter.start();
		counter2.start();
		
	
		
	}

}
