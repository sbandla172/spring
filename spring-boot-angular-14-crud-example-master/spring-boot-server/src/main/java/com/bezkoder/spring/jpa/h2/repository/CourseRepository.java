package com.bezkoder.spring.jpa.h2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.jpa.h2.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	
	
//	List<Course> findByCourses(String title);
//	
//	
	Optional<List<Course>> findByAuthor(String title);
	
	
	
	
}
