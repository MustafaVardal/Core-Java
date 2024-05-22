package javaProject.business;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javaProject.core.logging.ILogger;
import javaProject.dataAccess.HibernateDao;
import javaProject.dataAccess.ICourseDao;
import javaProject.dataAccess.JdbcDao;
import javaProject.entities.Course;

public class CourseManager {

	private ICourseDao courseDao;
	private ILogger[] loggers;
	private List<Course> allCourses = new ArrayList<>();

	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao; // When the course is new, give the IcourseDao 
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {

		if (course.getPrice() < 0) {
			throw new Exception("Course's price must not less than 0.");
		}

		/*
		 * if (course.getName().equals(course.getName())) { 
		 * throw new Exception("Course's name must not be same."); }
		 * This code is not running correctly...
		 */

		if (isCourseExist(course)) {
			throw new Exception("Course's name already had it.");

		}

		
		courseDao.add(course);
		allCourses.add(course);

		for (ILogger iLogger : loggers) {
			iLogger.log(course.getName());
		}

	}

	public boolean isCourseExist(Course course) {
		for (Course isCourseExist : allCourses) {
			if (isCourseExist.getName().equals(course.getName())) {
				return true;
			}
		}
		return false;
	}
}
