package com.org.lab4th.emp.service;


import org.springframework.stereotype.Component;

import com.org.lab4th.emp.dao.EmployeeDao;
import com.org.lab4th.emp.dto.Employee;

@Component
public class EmployeeService {
	EmployeeDao employeeDao=new EmployeeDao();
	boolean result=false;
}
