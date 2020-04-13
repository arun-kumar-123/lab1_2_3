package com.org.lab4th.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.org.lab4th.emp.dto.Employee;
@Component
public class EmployeeRepo {
	static private List<Employee> empList=new ArrayList<Employee>();
	static private int empIdGen=100;
	static {
		
		empList.add(new Employee(empIdGen++, "Anoop",80000.0));
		empList.add(new Employee(empIdGen++,"Sachin",95000.0));
		empList.add(new Employee(empIdGen++,"John", 120000.0));
		empList.add(new Employee(empIdGen++,"Kaushik",75000.0));
		
	}
	public static List<Employee> getEmpList() {
		return empList;
	}

	public static int getEmpIdGen() {
		return empIdGen;
	}

	public static void setEmpIdGen(int empIdGen) {
		EmployeeRepo.empIdGen = empIdGen;
	}
	
	
}
