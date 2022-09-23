package com.course.springtest.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.course.services.CourseServices;
import com.course.springtest.entity.Course;
@RestController
public class Mycontroller {
	@Autowired
	private CourseServices cs;
//	@GetMapping("/home")
//	public String home()
//	{
//		return "AMMA & NANNA";
//	}
	//get the courses
	@GetMapping("/courses")
public List<Course> getCourses(){
		return this.cs.getCourses();
}
	@GetMapping("/courses/{courseId}")
	public Course getCourse( @PathVariable String courseId)
	{
		return this.cs.getCourse(Long.parseLong(courseId));
	}
	//ADD COURSE
	@PostMapping("/courses")
	public Course addCourse( @RequestBody Course cs1)
	{
		return this.cs.addCourse(cs1);
	}
	//UPDATE COURSE
	@PutMapping("/courses")
	public Course updateCourse ( @RequestBody Course cs1)
	{
		return this.cs. updateCourse(cs1);
	}
	
	
}
