package aufgabe1;

public class ThreadCounter implements Runnable {
	String name;
	private Object mutex= new Object();
	private Integer counter=0;
	
	public ThreadCounter(String name) {
		this.name=name;
		
	}

	
	
	@Override
	public void run() {
		
		synchronized(this) {
			while(counter<=	20) {
	    	
	    		
	    		this.counter++;
		    	//increment();
		    	System.out.println(String.valueOf(Thread.currentThread())+this.counter);
	    	
	    	
		    	try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    	
	    }
		
	}
	
	public synchronized void increment() {
		this.counter++;
	}
	
	public Integer getCounter() {
		return this.counter;
	}
}


	
	
	