package com.inet.config;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
 import com.inet.dto.ErrorDto;
import com.inet.exception.ErrorException;

@ControllerAdvice
public class ConfigCoustom extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler({ErrorException.class, ErrorException.class})
	public ResponseEntity<ErrorDto> MensajeError(Exception exception){
		ErrorDto  e = new ErrorDto();
		e.setHtppCode(HttpStatus.BAD_REQUEST.value());
		e.setMensaje(exception.getMessage());
		 	
		return new ResponseEntity<>(e,HttpStatus.BAD_REQUEST);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		
		ErrorDto e = new ErrorDto();
		e.setHtppCode(HttpStatus.BAD_REQUEST.value());
		e.setMensaje(ex.getMessage());
		
		return new ResponseEntity<>(e ,HttpStatus.BAD_REQUEST);
	}
	
	
}
