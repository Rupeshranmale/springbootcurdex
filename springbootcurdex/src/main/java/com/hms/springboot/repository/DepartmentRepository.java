package com.hms.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.hms.springboot.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> { 

}
