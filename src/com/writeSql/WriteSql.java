package com.writeSql;



public class WriteSql {
	public static void main(String[] args) {
		for (int i = 0; i < 32; i++) {
			System.out.println("insert into my_test (name,age) values('zhujinfan','"+i+"');");
		}
	}
}
