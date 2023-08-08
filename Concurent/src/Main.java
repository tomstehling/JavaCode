
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {

	static AlphaCentauri calc1 = new AlphaCentauri();
	static Keppler22b calc2 = new Keppler22b();
	static Keppler62f calc3 = new Keppler62f();
	static Gliese667Cc calc4 = new Gliese667Cc();
	static FutureTask<Boolean> calc1Future = new FutureTask<>(calc1);
	static FutureTask<Boolean> calc2Future = new FutureTask<>(calc2);
	static FutureTask<Boolean> calc3Future = new FutureTask<>(calc3);
	static FutureTask<Boolean> calc4Future = new FutureTask<>(calc4);

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);

		executor.submit(calc1Future);
		executor.submit(calc2Future);
		executor.submit(calc3Future);
		executor.submit(calc4Future);

		while (true) {
			try {
				Boolean result1 = calc1Future.get(500, TimeUnit.MILLISECONDS);
				if (result1 == true) {
					System.out.println("Alpha Centauri is true");
					// executor.shutdown();
					break;
				}
				
				Boolean result2 = calc2Future.get(500, TimeUnit.MILLISECONDS);
				if (result2 == true) {
					System.out.println("Keppler22b is true");
					// executor.shutdown();
					break;
				}
				
				Boolean result3 = calc3Future.get(500, TimeUnit.MILLISECONDS);
				if (result3 == true) {
					System.out.println("Keppler62f is true");
					// executor.shutdown();
					break;
				}
				
				Boolean result4 = calc4Future.get(500, TimeUnit.MILLISECONDS);
				if (result4 == true) {
					System.out.println("Gliese667Cc is true");
					// executor.shutdown();
					break;
				}



			} catch (InterruptedException | ExecutionException | TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			calc1Future.cancel(true);
			calc2Future.cancel(true);
			calc3Future.cancel(true);
			calc4Future.cancel(true);
		}
	}
}
