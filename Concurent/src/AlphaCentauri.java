import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class AlphaCentauri implements Callable<Boolean> {
	

	@Override
	public Boolean call() throws Exception {
		int calcTimeInMs = ThreadLocalRandom.current().nextInt(2000, 10000);
		Thread.sleep(calcTimeInMs);
		return false;
	}
	
	

}
