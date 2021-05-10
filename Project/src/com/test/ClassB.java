package com.test;

public class ClassB extends ClassA {
	
	public void setValue() {
		super.parentVariable = "Data to parent variable";
		System.out.println(super.parentVariable);
	}
	
	public static void main(String args[]) {
		ClassB classB = new ClassB();
		classB.setValue();
	}
}
