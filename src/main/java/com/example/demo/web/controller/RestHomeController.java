package com.example.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RestResponseDto;
import com.example.demo.service.UserService;

@RestController
public class RestHomeController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/ajax/check-email")
	public ResponseEntity<RestResponseDto<String>> emailCheck(String email) {
		boolean isExists = userService.isExistEmail(email);
		String data = isExists ? "exists" : "none";
		
		return ResponseEntity.ok(RestResponseDto.success(data));
	}
}
