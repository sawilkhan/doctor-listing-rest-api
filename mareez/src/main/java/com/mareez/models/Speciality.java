package com.mareez.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Speciality {
	@Id
	@GeneratedValue(generator = "spe_seq")
	@SequenceGenerator(name = "spe_seq", initialValue = 1111, allocationSize = 1)
	private int spId;

	private String name;

	public int getSpId() {
		return spId;
	}

	public void setSpId(int spId) {
		this.spId = spId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};

}
