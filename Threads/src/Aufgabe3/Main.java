package Aufgabe3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create the list of integers
        ArrayList<Integer> list = new ArrayList<>();
        
        //Thread thread1 = new Thread(new DivideThread(list, 4));
        //Thread thread2 = new Thread(new DivideThread(list, 5));

        // Create the first thread
        Thread thread1 = new Thread(() -> {
            // This code will be executed by the first thread
            for (int i = 0; i <= 100; i++) {
                if (i % 4 == 0) {
                    list.add(i);
                }
            }
        });

        // Create the second thread
        Thread thread2 = new Thread(() -> {
            // This code will be executed by the second thread
            for (int i = 0; i <= 100; i++) {
	             if (i % 5 == 0) {
	            	 if(i%4!=0) {
	            		 list.add(i);
	            	 }
	                
            	 }
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
        if (!thread2.isAlive()) {System.out.println(list);}
    }
}
