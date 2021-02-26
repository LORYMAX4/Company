package it.plansoft.company.model;

import javax.persistence.Entity;

@Entity
public class Employee extends IDModel<Long> {

	private String firstname;
	private String lastname;
	private int baseSalary;

	public Employee() {
	}

	public Employee(String firstname, String lastname, int baseSalary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.baseSalary = baseSalary;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
}