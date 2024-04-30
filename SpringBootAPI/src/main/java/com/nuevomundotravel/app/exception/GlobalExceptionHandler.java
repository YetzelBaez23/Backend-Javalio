package com.nuevomundotravel.app.exception;



import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice // Este componente se usa para manejar Excepciones globalmente
public class GlobalExceptionHandler {
	
	ErrorDetails errorDetails;
	
	public GlobalExceptionHandler(ErrorDetails errorDetails) {
		this.errorDetails = errorDetails;
	}
	
	@ExceptionHandler(IllegalStateException.class)
	//Respondemos con un objeto para la excepcion de tal forma que luzca como un JSON
	ResponseEntity<ErrorDetails> handlerIllegalStateException(Exception exception, WebRequest webRequest){
		errorDetails.setTimestamp(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setPath(webRequest.getDescription(false));
		errorDetails.setErrorCode("Resource not found");
		
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
}
