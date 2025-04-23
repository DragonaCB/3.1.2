package ru.kata.spring.boot_security.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;
import ru.kata.spring.boot_security.demo.services.UserService;

import java.util.Set;

@SpringBootApplication
public class SpringBootSecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
		RoleRepository roleRepository = null;
//		Role userRole = roleRepository.findByName("ROLE_USER").orElseThrow(() -> new RuntimeException("Роль не найдена"));
//
//		UserService userService = null;
//		userService.createUser("admin", "admin", Set.of(adminRole));
//		userService.createUser("user", "user", Set.of(userRole));
	}
}
