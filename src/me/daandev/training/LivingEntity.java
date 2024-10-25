package me.daandev.training;

public abstract class LivingEntity {

	String name;

	LivingEntity() {

	}

	LivingEntity(String name) {
		this.name = name;
	}

	abstract void walk();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
