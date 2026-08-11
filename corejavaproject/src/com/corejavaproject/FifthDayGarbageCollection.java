package com.corejavaproject;

public class FifthDayGarbageCollection {

	class One{
		One o;
	}
	class Two{
		Two t;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalzed");
	}
//	Method inside Object
	void jon() {
		FifthDayGarbageCollection n = new FifthDayGarbageCollection();
		System.out.println("THis is method inside method");
		n.display();
		System.gc();
	}
	void display() {
		System.out.println("this gc");
	}
	public static void main(String[] args) {
//		1. Nullify the objects 
		System.out.println("Main Method Started");
		FifthDayGarbageCollection fg = new FifthDayGarbageCollection();
		System.out.println(fg);
		fg = null;
//		2. re-assigning the object ang gc
		FifthDayGarbageCollection fg1 = new FifthDayGarbageCollection();
		System.out.println(fg1);
		fg1 = fg;
		System.out.println(fg1);
//		anonymous gc
		new FifthDayGarbageCollection().display();
		
//		class inside class
		
		FifthDayGarbageCollection fg2 = new FifthDayGarbageCollection();
		fg2.jon();
		FifthDayGarbageCollection fg3 = new FifthDayGarbageCollection();
//		One one = new One();
//		Two two = new Two();
//		one.o = two;
//		two.t = one;
		

		System.gc();
		

		
	}

}
