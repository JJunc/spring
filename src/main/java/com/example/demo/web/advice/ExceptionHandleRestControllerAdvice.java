package com.example.demo.web.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.RestResponseDto;
import com.example.demo.exception.RestStoreException;
import com.example.demo.exception.StoreException;

@RestControllerAdvice
public class ExceptionHandleRestControllerAdvice {
	
	@ExceptionHandler(RestStoreException.class)
	public ResponseEntity<RestResponseDto<Void>> handleStoreException(RestStoreException ex) {
		String erroeMessage = ex.getMessage();
		
		return ResponseEntity.internalServerError().body(RestResponseDto.fail(erroeMessage));
	}
}
