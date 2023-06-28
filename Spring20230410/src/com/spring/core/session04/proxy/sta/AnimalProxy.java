package com.spring.core.session04.proxy.sta;

public class AnimalProxy implements Animal{
	
	private Animal animal;
	
	public AnimalProxy(Animal animal) {
		this.animal = animal;
	}

	@Override
	public void Play() {
		System.out.println("打預防針");
		animal.Play();
	}

}
