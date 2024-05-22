package javaProject.business;

import java.util.ArrayList;
import java.util.List;

import javaProject.core.logging.ILogger;
import javaProject.dataAccess.ICategoryDao;
import javaProject.entities.Category;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	private List<Category> allCategories = new ArrayList<Category>();

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {

		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		if (isCategoryExist(category)) {
			throw new Exception("Category already existed: " + category.getName());
		}
		
		categoryDao.add(category);
		allCategories.add(category);
		for (ILogger iLogger : loggers) {
			iLogger.log(category.getName());
		}
	}
	
	

	public boolean isCategoryExist(Category category) {
		for (Category isCategoryExist : allCategories) {
			if (isCategoryExist.getName().equals(category.getName())) {
				return true;
			}
			
		}
		return false;
	}

}
