package com.mareez.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mareez.models.Symptom;

public interface SymptomRepo extends JpaRepository<Symptom, Integer>{

}
