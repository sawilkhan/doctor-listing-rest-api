package com.mareez.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mareez.models.Doctor;
import com.mareez.models.Symptom;
import com.mareez.services.SymptomService;

@RestController
@RequestMapping("symptoms")
public class SymptomController {
	
	@Autowired
	private SymptomService symptomService;
	
	@PostMapping("add")
	public ResponseEntity<Symptom> addSymptom(@RequestBody Symptom symptom){
		Symptom sy = symptomService.addNewSym(symptom);
		if(sy == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(sy);
	}
}
