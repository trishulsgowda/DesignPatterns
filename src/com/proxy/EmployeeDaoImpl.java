package com.proxy;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void create(String client, Employee employee) {
		System.out.println("Created the employee");
	}

	@Override
	public Employee get(String client, int employeeId) {
		System.out.println("Employee is found");
		return new Employee();
	}

	@Override
	public void delete(String client, int employeeId) {
		System.out.println("Employee is deleted");
	}

}
