package com.proxy;

public class EmployeeDaoProxy implements EmployeeDao {
	
	EmployeeDao employeeDao;
	
	public EmployeeDaoProxy(){
		this.employeeDao = new EmployeeDaoImpl();
	}

	@Override
	public void create(String client, Employee employee) throws Exception {
		if("ADMIN".equalsIgnoreCase(client)){
			this.employeeDao.create(client, employee);
		}
		throw new Exception("Access Denied");
	}

	@Override
	public Employee get(String client, int employeeId) throws Exception {
		if("ADMIN".equalsIgnoreCase(client) || "USER".equalsIgnoreCase(client)){
			return this.employeeDao.get(client, employeeId);
		}
		throw new Exception("Access Denied");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		if("ADMIN".equalsIgnoreCase(client)){
			this.employeeDao.delete(client, employeeId);
		}
		throw new Exception("Access Denied");
	}
}
