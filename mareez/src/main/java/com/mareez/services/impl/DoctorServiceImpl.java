package com.mareez.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mareez.models.Doctor;
import com.mareez.repos.DoctorRepo;
import com.mareez.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepo doctorRepo;

	public Doctor addNewDoc(Doctor doctor) {
		return doctorRepo.save(doctor);
	}

	public List<Doctor> getDocList() {
		return doctorRepo.findAll();
	}

	public List<Doctor> getDocListByCity(int city) {
		return doctorRepo.findByCity(city);
	}

	public List<Doctor> getDocListByCandS(int city, int speciality) {

		return doctorRepo.findByCityAndSpec(city, speciality);
	}

	public Doctor getDoc(int did) {
		return doctorRepo.findById(did).orElse(null);
	}

	public Doctor updateDoc(Doctor d) {
		return doctorRepo.save(d);
	}

	public Doctor deleteDoc(int did) {
		Doctor d = doctorRepo.findById(did).orElse(null);
		doctorRepo.deleteById(did);
		return d;
	}

}
