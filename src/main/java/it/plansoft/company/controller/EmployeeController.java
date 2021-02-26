package it.plansoft.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.plansoft.company.model.Employee;
import it.plansoft.company.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController extends BaseCrudController<EmployeeService, Employee, Long>{

	@Autowired
	public EmployeeController(EmployeeService service) {
		super(service);
	}
}