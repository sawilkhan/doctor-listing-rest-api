package com.mareez.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mareez.models.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {

	List<Doctor> findByCity(int city);

	@Query("from Doctor where city =:arg1 and speciality=:arg2")
	List<Doctor> findByCityAndSpec(@Param(value = "arg1") int city, @Param(value = "arg2") int speciality);

}
