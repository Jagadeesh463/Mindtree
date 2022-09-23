package com.course.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.Springrest.CourseDao;
import com.course.springtest.entity.Course;
@Service
public class CourseServiceimpl implements CourseServices  {
	
	@Autowired
	private CourseDao cd1;
	//List <Course> l1;

	public  CourseServiceimpl ()
	{
	/*	 l1=new ArrayList<>();
		l1.add(new Course(101,"java","this is java"));
		l1.add(new Course(102,"sql","this is sql"));
		l1.add(new Course(103,"html","this is html"));
		*/
		
	}
	@Override
	public List<Course> getCourses()
	{
		return cd1.findAll();
		
	}
	 @Override
		public Course getCourse(long courseId) {
			/*Course c=null;
			for (Course cs1:l1)
			{
				if(c.getId()==courseId)
				{
					c=cs1;
					break;
				}
			}*/
	
			return cd1.getOne(courseId);
		}
	@Override
	public Course addCourse(Course cs1) {
		//l1.add(cs1);
		cd1.save(cs1);
		return (cs1);
	}
	@Override
	public Course updateCourse(Course cs1) {
		/*l1.forEach(e->{
			if(e.getId()==cs1.getId())
			{
				e.setName(cs1.getName());
				e.setDesc(cs1.getDesc());
			}
		});*/
		cd1.save(cs1);
		return cs1;
	}
	
	
}
