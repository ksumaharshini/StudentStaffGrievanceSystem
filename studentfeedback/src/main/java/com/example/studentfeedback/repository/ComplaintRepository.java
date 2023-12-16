package com.example.studentfeedback.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentfeedback.model.Complaint;



public interface ComplaintRepository extends JpaRepository<Complaint,Serializable> {

	public List<Complaint> findByDepartment(String department);
	
	

}