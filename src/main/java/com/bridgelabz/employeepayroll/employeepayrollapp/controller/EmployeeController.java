package com.bridgelabz.employeepayroll.employeepayrollapp.controller;

import com.bridgelabz.employeepayroll.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.employeepayrollapp.entity.Employee;
import com.bridgelabz.employeepayroll.employeepayrollapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Layer that receives various HTTP request from client
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 10/10/2021
 */

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Function to get mapping from client
     * @return greeting
     */
    @GetMapping(value = "/employee")
    public List<Employee> employees() {
        return employeeService.employees();
    }

    /**
     * Function to receive get request from client
     * @param employeeDto employee data from client
     * @return added employee in the database
     */
    @PostMapping("/add-employee")
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDto){
        return employeeService.addEmployee(employeeDto);
    }

    /**
     * Function to receive put request from client
     * @param id unique id of the employee
     * @return updated employee details
     */
    @PutMapping(value = "/edit-employee/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody EmployeeDTO employeeDto){
        return employeeService.updateEmployee(id, employeeDto);
    }

    /**
     * Function to delete employee from client
     * @param id unique id of the employee
     * @return String message displaying status of operation
     */
    @DeleteMapping(value = "/delete-employee")
    public String deleteemployee(@RequestParam int id) {
        return employeeService.deleteEmployee(id);
    }
}
