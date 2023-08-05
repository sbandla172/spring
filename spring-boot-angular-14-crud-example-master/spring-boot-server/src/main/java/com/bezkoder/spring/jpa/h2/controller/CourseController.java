package com.bezkoder.spring.jpa.h2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bezkoder.spring.jpa.h2.model.Course;
import com.bezkoder.spring.jpa.h2.repository.CourseRepository;


@RestController
@RequestMapping("/api")


public class CourseController {
	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("/courses/{author}")
	public ResponseEntity<List<Course>> getCourseByAuthor(@PathVariable("author") String title) {

		Optional<List<Course>> courseData = courseRepository.findByAuthor(title);

		if (courseData.isPresent()) {
			return new ResponseEntity<>(courseData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/courses")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		try {
			Course _course = courseRepository.save(new Course(course.getId(), course.getTitle(), course.getAuthor()));
			return new ResponseEntity<>(_course, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
