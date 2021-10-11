package com.bridgelabz.employeepayroll.employeepayrollapp.dto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Layer that contains data from client
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 11/10/2021
 */

@Getter
@Setter
@Data
public class EmployeeDTO {
    private String name;
    private int salary;
}
