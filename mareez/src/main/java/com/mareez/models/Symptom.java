package com.mareez.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Symptom {
	
	@Id
	@GeneratedValue(generator = "sym_seq")
	@SequenceGenerator(name = "sym_seq", initialValue = 1111, allocationSize = 1)
	private int syId;
	
	private String name;
	
	@ManyToOne
	private Speciality sySpecialty;

	public int getSyId() {
		return syId;
	}

	public void setSyId(int syId) {
		this.syId = syId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Speciality getSySpecialty() {
		return sySpecialty;
	}

	public void setSySpecialty(Speciality sySpecialty) {
		this.sySpecialty = sySpecialty;
	}
	
	

}
