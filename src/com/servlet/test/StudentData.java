package com.servlet.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "studentData")
public class StudentData extends Student {
	private String nickName;
	private String sex;

	public StudentData(String nickName, String sex) {
		this.nickName = nickName;
		this.sex = sex;
	}

	public StudentData() {
		// TODO Auto-generated constructor stub
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
