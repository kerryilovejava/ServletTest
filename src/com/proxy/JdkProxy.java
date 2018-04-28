package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {

	private StudentInt studentInt;

	public JdkProxy(StudentInt studentInt) {
		super();
		this.studentInt = studentInt;
	}

	public StudentInt createProxy() {
		StudentInt proxy = (StudentInt) Proxy.newProxyInstance(studentInt.getClass().getClassLoader(), studentInt.getClass().getInterfaces(), this);
		return proxy;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("增强的方法");
		return method.invoke(studentInt, args);
	}

	public static void main(String[] args) {
		StudentInt studentInt = new StudentDao();
		JdkProxy jdkProxy = new JdkProxy(studentInt);
		StudentInt proxy = jdkProxy.createProxy();
		proxy.show();
	}
}
