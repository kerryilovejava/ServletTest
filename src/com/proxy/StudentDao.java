package com.proxy;

public class StudentDao implements StudentInt {

	@Override
	public void show() {
		System.out.println("原始方法");
	}

}
