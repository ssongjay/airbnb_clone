package com.example.airbnbclone;

//import com.example.airbnbclone.entity.User;
//import com.example.airbnbclone.repository.UserRepository;
//import com.example.airbnbclone.service.UserService;
//import org.springframework.boot.CommandLineRunner;
import com.example.airbnbclone.entity.User;
import com.example.airbnbclone.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class AirbnbCloneApplication {
	public static void main(String[] args) {
		SpringApplication.run(AirbnbCloneApplication.class, args);
	}
}



//@Slf4j

//public class AirbnbCloneApplication implements CommandLineRunner {
//
//	private final UserService userService;
//
//	@Autowired
//	public AirbnbCloneApplication(UserService userService) {
//		this.userService = userService;
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(AirbnbCloneApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		// Create a new user using constructor
////		LocalDate currentDate = LocalDate.now();
////		User user = new User("John Doe", "johndoe@example.com", "password123", Date.valueOf(currentDate));
////
////		// Save the user to the database
////		userService.addNewUser(user);
////
////		// Retrieve the saved user by ID
////		User savedUser = userService.getUserById(user.getId());
////
////		// Check if the user was successfully added
////		if (savedUser != null) {
////			log.debug("User added successfully!");
////			log.debug(savedUser.toString());
////		} else {
////			log.debug("Failed to add the user.");
////		}
//
//		// Test email duplication check
//		List<User> existingUser = userService.findByEmail("테스트");
//		if (existingUser.isEmpty()) {
//			log.info("Email does not exist. It can be used.");
//		} else {
//			log.info("Email already exists: ");
//		}
//	}
//}

//public class AirbnbCloneApplication implements CommandLineRunner {
//	 public final UserService userService;
//
//	public AirbnbCloneApplication(UserService userService) {
//		this.userService = userService;
//	}
//	public static void main(String[] args) {
//		SpringApplication.run(AirbnbCloneApplication.class, args);
//	}
//
////	@Override
//	public void run(String... args) throws Exception {
//		Optional<User> user = null;
//		user = userService.findByEmail("테스트");
//		if (user.isEmpty())
//			log.info("탐색 실패");
//		else if (user.isPresent())
//			log.info("탐색 성공");
//		// Create a new user using constructor
////		LocalDate currentDate = LocalDate.now();
////		User user = new User("송인제", "johndoe", "password123", Date.valueOf(currentDate));
////
////		// Save the user to the database
////		userService.addNewUser(user);
////
////		// Retrieve the saved user by ID
////		User savedUser = userService.getUserById(user.getId());
////
////		System.out.println(user.getId() + savedUser.getId());
////		// Check if the user was successfully added
////		if (savedUser != null) {
////			System.out.println("User added successfully!");
////			System.out.println(savedUser);
////		} else {
////			System.out.println("Failed to add the user.");
////		}
//	}
//}
