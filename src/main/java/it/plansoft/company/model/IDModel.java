package it.plansoft.company.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class IDModel<ID> {

	@Id
	@GeneratedValue
	protected ID id;

	public IDModel() {
	}

	public IDModel(ID id) {
		this.id = id;
	}

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}
}