package it.plansoft.company.model;

import javax.persistence.Entity;

@Entity
public class TimeBank extends IDModel<Long> {

	private Long idEmployee;
	private int totSalary;
	private int maxHoursForDay;
	private int hoursWorked;
	private int extraHours;
	private Long idLevel;
	private int nPromotions;

	public TimeBank() {
	}

	public TimeBank(Long idEmployee, Long idLevel) {
		this.idEmployee = idEmployee;
		this.idLevel = idLevel;
	}

	public Long getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Long idEmployee) {
		this.idEmployee = idEmployee;
	}

	public int getTotSalary() {
		return totSalary;
	}

	public void setTotSalary(int totSalary) {
		this.totSalary = totSalary;
	}

	public int getMaxHoursForDay() {
		return maxHoursForDay;
	}

	public void setMaxHoursForDay(int maxHoursForDay) {
		this.maxHoursForDay = maxHoursForDay;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(int extraHours) {
		this.extraHours = extraHours;
	}

	public Long getIdLevel() {
		return idLevel;
	}

	public void setIdLevel(Long idLevel) {
		this.idLevel = idLevel;
	}

	public int getnPromotions() {
		return nPromotions;
	}

	public void setnPromotions(int nPromotions) {
		this.nPromotions = nPromotions;
	}
}
