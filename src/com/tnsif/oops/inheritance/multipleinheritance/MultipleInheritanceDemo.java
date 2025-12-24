package com.tnsif.oops.inheritance.multipleinheritance;

interface punching {
	 void punch();

}

interface kicking {
	void kick();
}
 
class Human implements punching , kicking {
	
	@Override
	public void punch() {
		System.out.println("Human can punch");
		
	}

	@Override
	public void kick() {
		System.out.println("Human can kick");
		
	}
	 
}

public class MultipleInheritanceDemo{
	public static void main(String[] args) {
		Human obj = new Human();
		obj.punch();
		obj.kick();
	}
}