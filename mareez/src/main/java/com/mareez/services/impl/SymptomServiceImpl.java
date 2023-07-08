package com.mareez.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mareez.models.Symptom;
import com.mareez.repos.SymptomRepo;
import com.mareez.services.SymptomService;

@Service
public class SymptomServiceImpl implements SymptomService{
	
	@Autowired
	private SymptomRepo symptomRepo;

	public Symptom addNewSym(Symptom symptom) {
		return symptomRepo.save(symptom);
	}

}
