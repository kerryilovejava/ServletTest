package com.excutordemo;

public class ThreadDemo implements Runnable {
	private int count;

	public ThreadDemo(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "线程执行" + count);

	}

}
