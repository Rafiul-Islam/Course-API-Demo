package com.rafiulislam.SpringBoot.Course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafiulislam.SpringBoot.Topic.Topics;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/topics/{id}/courses")
	public List<Courses> showCourses(@PathVariable("id") String id) {

		return courseService.getAllCourses(id);
	}

	@GetMapping(value = "/topics/{topicId}/courses/{id}")
	public Optional<Courses> showCourseindividual(@PathVariable("id") String id) {

		return courseService.getIndividualCourse(id);
	}

	@PostMapping("/topics/{topicId}/courses")
	public Courses postCourseindividual(@RequestBody Courses courses, @PathVariable("topicId") String topicId) {

		courses.setTopics(new Topics(topicId, "", ""));
		courseService.addCourse(courses);
		return courses;
	}

	@PutMapping("/topics/{topicId}/courses/{id}")
	public Courses updateCourseindividual(@PathVariable("id") String id, @PathVariable("topicId") String topicId,
			@RequestBody Courses courses) {

		courses.setTopics(new Topics(topicId, "", ""));
		courseService.updateCourse(courses);
		return courses;
	}

	@DeleteMapping("/topics/{topicId}/courses/{id}")
	public String deleteCourseindividual(@PathVariable("id") String id) {

		courseService.deleteCourse(id);
		return "Deleted";
	}

}







