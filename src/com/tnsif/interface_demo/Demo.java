package com.tnsif.interface_demo;

interface InterDemo{
	void greeting();
}

public class Demo implements InterDemo{

	@Override
	public void greeting() {
		System.out.println("Suiii");
	}

}
