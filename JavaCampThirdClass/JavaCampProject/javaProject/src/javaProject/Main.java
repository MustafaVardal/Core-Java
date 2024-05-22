package javaProject;

import javaProject.business.CategoryManager;
import javaProject.business.CourseManager;
import javaProject.business.InstructorManager;
import javaProject.core.logging.DatabaseLogger;
import javaProject.core.logging.FileLogger;
import javaProject.core.logging.ILogger;
import javaProject.core.logging.MailLogger;
import javaProject.dataAccess.HibernateDao;
import javaProject.dataAccess.JdbcDao;
import javaProject.entities.Category;
import javaProject.entities.Course;
import javaProject.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course = new Course(1, "Java", "123", 10);
		//Course course2 = new Course(1, "Java", "123", 0); // is not useful for upper cases./ !!!!!!!Need toupdate. /
		Course course2 = new Course(2, "Php", "123", 0);
		ILogger[] loggers = { new DatabaseLogger()};
		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
		courseManager.add(course);
		courseManager.add(course2); 
		
		System.out.println("");
		
		Instructor instructor = new Instructor(1, "Engin Demirog");
		//Instructor instructor2 = new Instructor(2, "Engin Demirog");
		Instructor instructor2 = new Instructor(2, "Drek");
		ILogger[] loggers2 = { new DatabaseLogger(), new FileLogger()};
		InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggers2);
		instructorManager.add(instructor);
		instructorManager.add(instructor2);
		
		System.out.println("");
		
		Category category = new Category(1, "Backend Programming");
		// Category category2 = new Category(1, "Backend Programming");
		Category category2 = new Category(1, "Frontend Programming");
		ILogger[] loggers3 = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		CategoryManager categoryManager = new CategoryManager(new JdbcDao(), loggers3);
		categoryManager.add(category);
		categoryManager.add(category2);

	}

}
