package javaProject.business;

import java.util.ArrayList;
import java.util.List;

import javaProject.core.logging.ILogger;
import javaProject.dataAccess.IInstructorDao;
import javaProject.entities.Instructor;

public class InstructorManager {
	// Will update for future.
	
	private IInstructorDao instructorDao;
	private ILogger[] loggers;
	private List<Instructor> allInstructor = new ArrayList<Instructor>();
	
	public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
	
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		
	}

	public void add(Instructor instructor) throws Exception {
		if (instructor.getId() <= 0) {
			throw new Exception("Id is not valid. Please try positive or non zero value.");
		}
		
		if (isInstructorExist(instructor)) {
			throw new Exception("Name already existed " + instructor.getName());
		}
		
		instructorDao.add(instructor);
		
		for (ILogger iLogger : loggers) {
			iLogger.log(instructor.getName());
		}
	}
	
	// This method for each instructorname is exist or not.
	
	public boolean isInstructorExist(Instructor instructor) {
		
		for (Instructor isInstructorExist : allInstructor) {
			if(isInstructorExist.getName().equals(instructor.getName())) {
				return true;
			}
		}
		
		return false;
		
		}
	
	
}
