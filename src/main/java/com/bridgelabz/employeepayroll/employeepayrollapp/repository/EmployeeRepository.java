package com.bridgelabz.employeepayroll.employeepayrollapp.repository;

import com.bridgelabz.employeepayroll.employeepayrollapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Layer that implements interface and does the database operations
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 11/10/2021
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
