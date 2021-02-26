package it.plansoft.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.plansoft.company.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}