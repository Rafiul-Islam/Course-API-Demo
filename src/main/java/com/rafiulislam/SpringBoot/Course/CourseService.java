package com.rafiulislam.SpringBoot.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

//	private List<Courses> courses = new ArrayList<>(Arrays.asList(
//			new Courses("101", "Test", "Java"),
//			new Courses("102", "Test2", "Spring"),
//			new Courses("103", "Test3", "Spring Boot"))
//			);

//	private List<Courses> courses = new ArrayList<>();

	public List<Courses> getAllCourses(String topicId) {

		List<Courses> courses = new ArrayList<Courses>();
		courseRepository.findByTopicsId(topicId).forEach(courses::add);

		return courses;
	}

	public Optional<Courses> getIndividualCourse(String id) {
		return courseRepository.findById(id);
	}

	public void addCourse(Courses courses) {
		courseRepository.save(courses);
	}

	public void updateCourse(Courses courses) {
		courseRepository.save(courses);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}
