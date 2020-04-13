package com.org.lab4th.emp.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.org.lab4th.emp.dto.Employee;
import com.org.lab4th.util.EmployeeRepo;
@Component
public class EmployeeDao {
	List<Employee> empList=EmployeeRepo.getEmpList();
	int empIdGen=EmployeeRepo.getEmpIdGen();
	public Employee viewEmpById(int empId) {
		for(Employee emp:empList)
		{
			if(emp.getId()==empId)
				return emp;
		}
		return null;
	}
	public List<Employee> viewAllEmp() {
		
		return empList;
	}
}
