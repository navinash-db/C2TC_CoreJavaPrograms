package com.tnsif.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		ChildThread threadOne = new ChildThread(7, "First");
		ChildThread threadTwo = new ChildThread(10, "Second");
		
		threadOne.start();
		//thredOne.start();
		//threadOne.run();
		threadTwo.start();
		
		System.out.println("--------------------End of Main--------------------");
	}

}
