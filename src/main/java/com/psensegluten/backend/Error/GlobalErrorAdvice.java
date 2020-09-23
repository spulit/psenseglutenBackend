package com.psensegluten.backend.Error;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;


@RestControllerAdvice
public class GlobalErrorAdvice extends ResponseEntityExceptionHandler {
	
	
	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		
		GeneralError  apiError = new GeneralError(status, LocalDateTime.now(), ex.getMessage());
		
		return ResponseEntity.status(status).headers(headers).body(apiError);
	
	}

	//TODO: must to implement some another exceptions like PostException.
	@ExceptionHandler({CommentException.class, SectionNotFoundException.class})
	public ResponseEntity<GeneralError> handleNotFound(Exception ex) {
	
		GeneralError apiError = new GeneralError(HttpStatus.NOT_FOUND, LocalDateTime.now(), ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError);
	
	}
	

}
