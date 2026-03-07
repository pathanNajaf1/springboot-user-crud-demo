package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class Bootjpaexample1Application {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(Bootjpaexample1Application.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		// Creating users
		User user1 = new User();
		user1.setName("Lakhan Singh");
		user1.setCity("Delhi");
		user1.setStatus("Unemployed");

		User user2 = new User();
		user2.setName("Gopal Rathore");
		user2.setCity("Indore");
		user2.setStatus("Fresher");

		// Saving multiple users
		List<User> users = List.of(user1, user2);
		Iterable<User> savedUsers = userRepository.saveAll(users);

		System.out.println("Saved Users:");
		savedUsers.forEach(System.out::println);

		// Updating user with id = 3
		Optional<User> optionalUser = userRepository.findById(3);

		if (optionalUser.isPresent()) {

			User userToUpdate = optionalUser.get();
			userToUpdate.setName("Ankit Tiwari");

			User updatedUser = userRepository.save(userToUpdate);

			System.out.println("Updated User:");
			System.out.println(updatedUser);

		} else {
			System.out.println("User with ID 3 not found.");
		}
		// Deleting user with id 103
	    userRepository.deleteById(103);
		System.out.println("Deleted the user");
	}
}
