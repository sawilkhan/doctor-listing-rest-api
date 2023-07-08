package com.mareez.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mareez.models.Doctor;
import com.mareez.services.DoctorService;

@RestController
@RequestMapping("doctors")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("add")
	public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor){
		Doctor d = doctorService.addNewDoc(doctor);
		if(d == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(d);
	}
	
	@GetMapping("getList")
	public ResponseEntity<List<Doctor>> getDoctorsList(){
		List<Doctor> list = doctorService.getDocList();
		
		if(list == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@GetMapping("getListByCity")
	public ResponseEntity<List<Doctor>> getDoctorsListByCity(@RequestParam int city){
		List<Doctor> list = doctorService.getDocListByCity(city);
		
		if(list == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@GetMapping("getListByCityAndSpeciality")
	public ResponseEntity<List<Doctor>> getDoctorsListByCandS(@RequestParam int city, @RequestParam int speciality){
		List<Doctor> list = doctorService.getDocListByCandS(city, speciality);
		
		if(list == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@PatchMapping("updatePhone")
	public ResponseEntity<Doctor> updatePhone(@RequestParam int did, @RequestBody Doctor doctor){
		Doctor d = doctorService.getDoc(did);
		
		if(d == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		if(doctor.getName()!= null) {
			d.setName(doctor.getName());
		}
		if(doctor.getCity()!= null) {
			d.setCity(doctor.getCity());
		}
		if(doctor.getEmail()!= null) {
			d.setEmail(doctor.getEmail());
		}
		if(doctor.getPhone()!= null) {
			d.setPhone(doctor.getPhone());
		}
		
		Doctor doc = doctorService.updateDoc(d);
		
		return ResponseEntity.status(HttpStatus.OK).body(doc);
	}
	
	@DeleteMapping("delete")
	public ResponseEntity<Doctor> deleteDoctor(@RequestParam int did){
		Doctor d = doctorService.deleteDoc(did);
		
		if(d == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(d);
	}

}
