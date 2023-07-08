package com.mareez.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(generator = "pat_seq")
	@SequenceGenerator(name = "pat_seq", initialValue = 1111, allocationSize = 1)
	private int pid;
	
	private String pName;
	private String pCity;
	private String pEmail;
	private String pPhone;
	@ManyToOne
	private Symptom pSymptom;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCity() {
		return pCity;
	}
	public void setpCity(String pCity) {
		this.pCity = pCity;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	public String getpPhone() {
		return pPhone;
	}
	public void setpPhone(String pPhone) {
		this.pPhone = pPhone;
	}
	public Symptom getpSymptom() {
		return pSymptom;
	}
	public void setpSymptom(Symptom pSymptom) {
		this.pSymptom = pSymptom;
	}
	
	
}
