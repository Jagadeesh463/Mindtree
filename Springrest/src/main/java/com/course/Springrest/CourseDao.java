package com.course.Springrest;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.springtest.entity.Course;

public interface CourseDao extends JpaRepository <Course,Long> {

	

}
