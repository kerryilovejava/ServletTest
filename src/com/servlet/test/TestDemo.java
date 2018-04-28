package com.servlet.test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.eidc.slee.security.MD5;

public class TestDemo {
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String jsonStr1 = "{\"name\": \"zhujinfan\",\"age\": 18}";
		String jsonStr2 = "{\"name\": \"zhujinfan\",\"age\": \"18\"}";
		Student a = new Gson().fromJson(jsonStr2, Student.class);
//		System.out.println(MD5.md5(jsonStr1));;
//		System.out.println(MD5.md5(jsonStr1));;
		System.out.println(a.getAge());
	}
}
