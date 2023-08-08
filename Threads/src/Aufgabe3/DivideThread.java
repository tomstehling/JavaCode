package Aufgabe3;

import java.util.List;

public class DivideThread implements Runnable {
	
	private List<Integer> list;
	private int mod;

	public DivideThread(List<Integer> list, int mod) {
		this.list = list;
		this.mod = mod;
	}

	@Override
	public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % mod == 0) {
                list.add(i);
            }
        }
	}

}
