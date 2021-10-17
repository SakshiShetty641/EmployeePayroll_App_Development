package com.bridgelabz.employeepayroll.employeepayrollapp.exceptions;

/**
 * Layer is used to create own Exceptions
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 17/10/2021
 */


public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
