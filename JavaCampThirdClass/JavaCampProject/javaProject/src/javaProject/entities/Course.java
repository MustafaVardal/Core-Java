package javaProject.entities;

public class Course {
	private int id;
	private String name;
	private String courseCode;
	private double price;

	public Course() {

	}

	public Course(int id, String name, String courseCode, double price) {

		this.id = id;
		this.name = name;
		this.courseCode = courseCode;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
