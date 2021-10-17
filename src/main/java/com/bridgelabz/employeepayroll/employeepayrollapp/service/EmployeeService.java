package com.bridgelabz.employeepayroll.employeepayrollapp.service;

import com.bridgelabz.employeepayroll.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeepayrollapp.entity.Employee;
import com.bridgelabz.employeepayroll.employeepayrollapp.exceptions.CustomException;
import com.bridgelabz.employeepayroll.employeepayrollapp.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Layer contains business logic,
 * It implements all the methods in controller layer
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 11/10/2021
 */

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;

    /**
     * Function to get the list of employee stored in database
     * @return list of employee
     */
    public List<Employee> employees() {
        return employeeRepository.findAll();
    }

    /**
     * Function to add employees to the database
     * @param employeeDto greeting data from client
     * @return employees added
     */
    public Employee addEmployee(EmployeeDTO employeeDto) {
        Employee employee = new Employee();
        modelMapper.map(employeeDto, employee);
        return employeeRepository.save(employee);
    }

    /**
     * Function to edit the available employee in the database
     * @param id unique id of the employee
     * @param employeeDto data from client
     * @return updated employee entry
     */
    public Employee updateEmployee(int id, EmployeeDTO employeeDto) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            modelMapper.map(employeeDto, employee);
            return employeeRepository.save(employee);
        }
        return null;
    }

    /**
     * Function to particular employee from database and delete it
     * @param id unique id of the employee
     * @return String message displaying status of operation
     */
    public String deleteEmployee(int id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            employeeRepository.delete(optionalEmployee.get());
            return "Record deleted successfully";
        }
        throw new CustomException("Record does not exists with this id : " + id);
    }
}