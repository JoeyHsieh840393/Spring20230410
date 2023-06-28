package com.spring.core.session02.bean;

public class Color {
	private String name;

	public Color() {
		super();
	}

	public Color(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Color [name=" + name + "]";
	}
	
}
