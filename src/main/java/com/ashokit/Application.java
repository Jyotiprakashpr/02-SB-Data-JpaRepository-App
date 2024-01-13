package com.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.User;
import com.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
	     UserRepository userRepo = context.getBean(UserRepository.class);
	     
	     User user = new User(); 
		  //user.setUserId(105); 
		  user.setUserName("Jyoti");
		  user.setUserAge(28); 
		 // user.setUserPhno(7077709512l);
		  user.setUserCountry("UK");
		  
		  userRepo.save(user);
	         // List<User> findAll = userRepo.findAll(Sort.by("userId").ascending());
	   //  List<User> findAll = userRepo.findAll(PageRequest.of(0, 3)).getContent();
		/*
		 * User userEntity = new User(); userEntity.setUserCountry("India");
		 * Example<User> example = Example.of(userEntity); List<User> findAll =
		 * userRepo.findAll(example);
		 */
	    // List<User> findAll = userRepo.findByUserAge(25);
	   //  List<User> findAll = userRepo.findByUserCountry("India");
		/*
		 * List<User> findAll = userRepo.findByUserAgeAndUserCountry(25,"India");
		 * for(User user : findAll) { System.out.println(user); }
		 */	}

}
