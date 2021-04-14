package com.company.movie.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.movie.entity.User;
import com.company.movie.entity.dto.UserDTO;
import com.company.movie.service.AuthService;

@RestController
@RequestMapping(value = "auth")
public class AuthController {

	@Autowired
	AuthService authService;

	@PostMapping("/login")
	public ResponseEntity<UserDTO> login(@RequestBody User user, HttpServletResponse response) {
		return ResponseEntity.ok().body(authService.login(user, response));
	}

	@PostMapping("/register")
	public ResponseEntity<UserDTO> register(@RequestBody User user) {
		return ResponseEntity.ok().body(authService.register(user));
	}

	@GetMapping("/user")
	public ResponseEntity<List<User>> getusers() {
		return ResponseEntity.ok().body(authService.getusers());
	}

}
