package com.temu.app.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice // Este componente se utiliza para manejar excepciones globalmente
public class GlobalExceptionHandler {
	ErrorDetails errorDetails;
	public GlobalExceptionHandler(ErrorDetails errorDetails) {
		this.errorDetails=errorDetails;
	}
	
	
	// El front end debe de verificar el status que le llegue un status 200
	// De lo contrario dependiendo del estatus le mostraremos el mensaje de error que dejamos en mesaage por ejemplo
	@ExceptionHandler(IllegalStateException.class) // Se ejecuta cuando ocurra la exception IllegalState exception
	ResponseEntity<ErrorDetails> handlerIllegalStateException(Exception exception, WebRequest webRequest){
		errorDetails.setTimestamp(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setPath(webRequest.getDescription(false));
		errorDetails.setErrorCode("Resource not found");
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.BAD_REQUEST ) ;
	}
		
}

