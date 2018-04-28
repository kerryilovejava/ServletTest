package com.producetest;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

/**
 * 类描述:存储过程调用
 * 
 * @author 5385
 * @date 2018年4月8日
 * @time 下午5:15:11
 */
public class TestDemo {
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://127.0.0.1:3306/mytest";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";

	public static void main(String[] args) throws Exception {
		// test1();
		test2();
		// test3();
	}

	/**
	 * 方法描述:一个输出参数
	 * 
	 * @throws Exception
	 * @date 2018年4月8日
	 * @time 下午5:14:50
	 * @author 5385
	 */
	public static void test1() throws Exception {
		Class.forName(DRIVER_CLASS);
		Connection connection = DriverManager.getConnection(URL, USERNAME,
				PASSWORD);
		String sql = "{CALL querytablecount(?)}"; // 调用存储过程
		CallableStatement cstm = connection.prepareCall(sql); // 实例化对象cstm
		cstm.execute(); // 执行查询操作，并获取结果集
		System.out.println(cstm.getInt(1));
		cstm.close();
		connection.close();
	}

	/**
	 * 方法描述:两个输入参数，一个输出参数
	 * 
	 * @throws Exception
	 * @date 2018年4月8日
	 * @time 下午5:14:08
	 * @author 5385
	 */
	public static void test2() throws Exception {
		Class.forName(DRIVER_CLASS);
		Connection connection = DriverManager.getConnection(URL, USERNAME,
				PASSWORD);
		String sql = "{CALL querytest(?,?,?)}"; // 调用存储过程
		CallableStatement cstm = connection.prepareCall(sql); // 实例化对象cstm
		cstm.setInt(1, 1); // 存储过程输入参数
		cstm.setInt(2, 2); // 存储过程输入参数
		cstm.registerOutParameter(3, Types.INTEGER); // 设置返回值类型 即返回值
		cstm.execute(); // 执行存储过程
		System.out.println(cstm.getInt(3));
		cstm.close();
		connection.close();

	}

	/**
	 * 方法描述:无参数，(select * )查询整条对象
	 * 
	 * @throws Exception
	 * @date 2018年4月8日
	 * @time 下午5:13:41
	 * @author 5385
	 */
	public static void test3() throws Exception {
		Class.forName(DRIVER_CLASS);
		Connection connection = DriverManager.getConnection(URL, USERNAME,
				PASSWORD);
		String sql = "{CALL queryuser()}"; // 调用存储过程
		CallableStatement cstm = connection.prepareCall(sql); // 实例化对象cstm
		ResultSet rs = cstm.executeQuery(); // 执行查询操作，并获取结果集
		while (rs.next()) {
			String name = rs.getString("user_name");
			String password = rs.getString("password");
			System.out.println(name + " " + password);
		}
		cstm.close();
		connection.close();
	}
}
