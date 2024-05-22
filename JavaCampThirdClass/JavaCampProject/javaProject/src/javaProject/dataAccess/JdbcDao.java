package javaProject.dataAccess;

import javaProject.entities.Category;
import javaProject.entities.Course;
import javaProject.entities.Instructor;

public class JdbcDao implements ICourseDao, IInstructorDao, ICategoryDao {
	@Override
	public void add(Course course) {
		System.out.println("Course element is added by JDBC in Database.");
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor's element is added by JDBC in Database.");
	}

	@Override
	public void add(Category category) {
		System.out.println("Category's element is added by JDBC in Database.");

	}
}
