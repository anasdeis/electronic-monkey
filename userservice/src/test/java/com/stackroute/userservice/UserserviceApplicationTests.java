package com.stackroute.userservice;

import com.stackroute.userservice.controller.UserController;
import com.stackroute.userservice.repository.UserRepository;
import com.stackroute.userservice.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class UserserviceApplicationTests {

	@Autowired
	private UserService userService;

	@Autowired
	private UserController userController;

	@Autowired
	private UserRepository userRepository;


	@AfterEach
	void tearDown() {
		userRepository.deleteAll();
	}

	@Test
	void contextLoads() {
		assertThat(userService).isNotNull();
		assertThat(userController).isNotNull();
		assertThat(userRepository).isNotNull();
	}
}
