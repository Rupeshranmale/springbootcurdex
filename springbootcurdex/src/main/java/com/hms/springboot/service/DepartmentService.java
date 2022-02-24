package com.hms.springboot.service;

import java.util.List;

import com.hms.springboot.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> fetchDepartmentList();

	Department updateDepartment(Department department,
								Long departmentId);

	void deleteDepartmentById(Long departmentId);
}
