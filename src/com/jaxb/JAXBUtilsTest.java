package com.jaxb;

import com.servlet.test.Student;
import com.servlet.test.StudentData;

public class JAXBUtilsTest {
	public static void main(String[] args) {
		StudentData data = new StudentData();
		data.setAddress("1");
		data.setName("1");
		data.setAge(1);
		data.setNickName("zhang");
		data.setSex("nan");
		// student.setStudentData(null);
		String xml = JAXBUtils.modelToStringXML(data);
		System.out.println("-------------------------------");
		System.out.println(xml);
	}
}
