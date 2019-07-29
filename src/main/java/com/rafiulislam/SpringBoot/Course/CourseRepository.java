package com.rafiulislam.SpringBoot.Course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Courses, String> {

	public List<Courses> findByTopicsId(String topicId);

}
