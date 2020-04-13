package com.org.lab4th.emp.collection;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.org.lab4th.emp.dto.Employee;
@Configuration
public class Collection {
 private List<Employee>emplist;
 @Bean
 public List<Employee>getEmplist()
 {
	 return emplist;
 }
}
