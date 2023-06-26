package com.example.airbnbclone;

import com.example.airbnbclone.entity.User;
import com.example.airbnbclone.repository.UserRepository;
import com.example.airbnbclone.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.time.LocalDate;

@SpringBootApplication
public class AirbnbCloneApplication implements CommandLineRunner {

	private final UserService userService;

	public AirbnbCloneApplication(UserService userService) {
		this.userService = userService;
	}
	public static void main(String[] args) {
		SpringApplication.run(AirbnbCloneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Create a new user using constructor
		LocalDate currentDate = LocalDate.now();
		User user = new User("John Doe", "johndoe@example.com", "password123", Date.valueOf(currentDate));

		// Save the user to the database
		userService.addNewUser(user);

		// Retrieve the saved user by ID
		User savedUser = userService.getUserById(user.getId());

		// Check if the user was successfully added
		if (savedUser != null) {
			System.out.println("User added successfully!");
			System.out.println(savedUser);
		} else {
			System.out.println("Failed to add the user.");
		}
	}
}
