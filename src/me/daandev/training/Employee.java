package me.daandev.training;

public class Employee extends Person implements Nice {

	String position;
	double salary;

	Employee(String position, double salary, String name, int age) {
		this.position = position;
		this.salary = salary;
		this.age = age;
		this.name = name;
	}

	@Override
	public void smile(int intensity) {
		// TODO Auto-generated method stub

	}

	public String getPosition() {
		return position;
	}

	public double getSalary() {
		return salary;
	}

	void setPosition(String position) {
		this.position = position;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

}
