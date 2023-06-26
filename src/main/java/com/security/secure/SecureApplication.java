package com.security.secure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureApplication.class, args);
	}
	@GetMapping("/")
	public String sayHello(){
		return "Hello, World!";
	}
	@GetMapping("/user")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String userWord(){
		return "Only user authority can view this";
	}
	@GetMapping("/admin")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String adminWord(){
		return  "Only the admin can view this";
	}
	@GetMapping("/welcome")
	public String getMessage(){
		return "Should be protected";
	}

}
