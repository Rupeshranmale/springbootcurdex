package com.hms.springboot.service;

//Java Program to Illustrate DepartmentServiceImpl.java
//File

//Importing required packages

//Importing required classes
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hms.springboot.entity.Department;
import com.hms.springboot.repository.DepartmentRepository;

//Annotation

@Service
//Class implementing DepartmentService class
@Component 
public  class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	// Save operation
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	// Read operation
	@Override
	public List<Department> fetchDepartmentList() {
		return (List<Department>) departmentRepository.findAll();
	}

	/*
	 * // Update operation
	 * 
	 * @Override public Department updateDepartment(Department department, Long
	 * departmentId) {
	 * 
	 * Department depDB = departmentRepository.findById(departmentId) .get();
	 * 
	 * if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(
	 * department.getDepartmentName())) { depDB.setDepartmentName(
	 * department.getDepartmentName()); }
	 * 
	 * if (Objects.nonNull( department.getDepartmentAddress()) &&
	 * !"".equalsIgnoreCase( department.getDepartmentAddress())) {
	 * depDB.setDepartmentAddress( department.getDepartmentAddress()); }
	 * 
	 * if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(
	 * department.getDepartmentCode())) { depDB.setDepartmentCode(
	 * department.getDepartmentCode()); }
	 * 
	 * return departme ntRepository.save(depDB); }
	 */
	// Delete operation
	@Override
	public void deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);
	}

	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	/*@Override
	public Department updateDepartment(Department department, Long departmentId) {
		return department;*/
	}

