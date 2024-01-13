package com.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findByUserAge(Integer age);
	public List<User> findByUserCountry(String Country);
	public List<User> findByUserAgeAndUserCountry(Integer age,String Country);
	public List<User> findByUserAgeIn(List<Integer> ages); 
	//public List<User> findByUsername(String name);
	@Query(value = "from User where userAge = :age ")
	public List<User>getByAge(Integer age);
	
	
	
	  

}
 