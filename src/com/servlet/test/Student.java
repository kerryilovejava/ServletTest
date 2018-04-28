package com.servlet.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "studentBean")
public class Student {
	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private String address;

	public Student(String name, int age, String address) {
	}

	public Student() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", age=" + age + ", address='" + address + '\'' + '}';
	}
}
