package com.excutordemo;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcutorDemo {
	public static void main(String[] args) {
		ThreadPoolExecutor tp = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		int count = 0;
		while (count < 3) {
			System.out.println(tp.getQueue().size());
			tp.execute(new ThreadDemo(count));
			count++;
		}
	}
}
