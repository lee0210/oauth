package com.stupidc.oauth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.stupidc.oauth.controller.exception.AuthException;
import com.stupidc.oauth.controller.response.ErrorResponse;

@ControllerAdvice("com.stupidc.oauth")
@RestController
public class ExceptionController{
	
	@ExceptionHandler(Exception.class)
    public @ResponseBody ResponseEntity<?> handleAllException(Exception e, WebRequest request) {
		ErrorResponse response = new ErrorResponse();
		response.setError(e.getClass().getName());
		response.setError_description(e.getMessage());
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(AuthException.class)
    public @ResponseBody ResponseEntity<?> handleAuthException(AuthException e, WebRequest request) {
		ErrorResponse response = new ErrorResponse();
		response.setError(e.getError());
		response.setError_description(e.getError_description());
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
}
