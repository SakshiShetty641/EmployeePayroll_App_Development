package com.bridgelabz.employeepayroll.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Layer is used to pass parameter data and object
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 17/10/2021
 */

@Data
@AllArgsConstructor
public class ResponseDTO {
    private String message;
    private Object data;
}
