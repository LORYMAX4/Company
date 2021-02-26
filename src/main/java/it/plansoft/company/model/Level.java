package it.plansoft.company.model;

import javax.persistence.Entity;

@Entity
public class Level extends IDModel<Long>{

	private String description;
	private int PromotionValueSalary;
	
	public Level() {
	}

	public Level(String description, int promotionValueSalary) {
		this.description = description;
		PromotionValueSalary = promotionValueSalary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPromotionValueSalary() {
		return PromotionValueSalary;
	}

	public void setPromotionValueSalary(int promotionValueSalary) {
		PromotionValueSalary = promotionValueSalary;
	}
}