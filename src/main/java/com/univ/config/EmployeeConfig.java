package com.univ.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Employee;


@Configuration
public class EmployeeConfig {

	  @Bean
		public Employee getData()
		{
			Employee e1=new Employee();
			e1.setEid(101);
			e1.setEname("Anshita");
			e1.setSalary(400000);
			e1.setDept("CS");
			return e1;
			
		}
	
}
