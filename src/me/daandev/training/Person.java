package me.daandev.training;

public class Person extends LivingEntity {

	int age;

	Person() {

		this("Anonymous");

	}

	Person(String name) {
		this(name, 0);
	}

	Person(int age) {
		this("Anonymous, age");
	}

	Person(String name, int age) {

		this.name = name;
		this.age = age;

		System.out.println("New person has been born!" + this.name + this.age);
	}

	@Override
	void walk() {
		this.age = 69;
		System.out.println(this.age);

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
