package javaProject.dataAccess;

import javaProject.entities.Course;

public interface ICourseDao {
	void add(Course course); // All the Database object need to depend on this interface rules. 
}
