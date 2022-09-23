package com.course.services;
import java.util.List;

import com.course.springtest.entity.Course;

public interface CourseServices {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course  addCourse(Course cs1);
	public Course updateCourse(Course cs1);
}
