package com.mareez.services;

import java.util.List;

import com.mareez.models.Doctor;

public interface DoctorService {

	Doctor addNewDoc(Doctor doctor);

	List<Doctor> getDocList();

	List<Doctor> getDocListByCity(int city);

	List<Doctor> getDocListByCandS(int city, int speciality);

	Doctor getDoc(int did);

	Doctor updateDoc(Doctor d);

	Doctor deleteDoc(int did);
	
	

}
