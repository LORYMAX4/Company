package it.plansoft.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.plansoft.company.model.Employee;
import it.plansoft.company.repository.EmployeeRepository;

@Service
public class EmployeeService extends BaseCrudService<EmployeeRepository, Employee, Long>{

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		super(employeeRepository);
	}
}