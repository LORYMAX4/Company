package it.plansoft.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.plansoft.company.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}