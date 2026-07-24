package com.example.demo;

import com.example.demo.model.AppUser;
import com.example.demo.repository.AppUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(AppUserRepository appUserRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			if (appUserRepository.findByUsername("admin").isEmpty()) {
				AppUser admin = new AppUser();
				admin.setUsername("admin");
				admin.setPassword(passwordEncoder.encode("admin@123#"));
				appUserRepository.save(admin);
				System.out.println("Default admin user created successfully.");
			}
		};
	}
}
