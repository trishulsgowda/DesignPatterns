package com.proxy;

public class ProxyTester {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoProxy();
		try {
			employeeDao.create("USER", new Employee());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
