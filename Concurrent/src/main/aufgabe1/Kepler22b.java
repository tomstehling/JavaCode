package main.aufgabe1;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class Kepler22b implements Callable<Boolean> {


	@Override
	public Boolean call() throws Exception {
		
		int calcTimeInMs = ThreadLocalRandom.current().nextInt(5000, 10000);
		Thread.sleep(calcTimeInMs);
		
		return true;
	}

}


