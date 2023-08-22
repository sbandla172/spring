package com.java.lambda;


interface Shape {
	void draw();
}

interface Addable {
	int add(int a, int b); 
}
//creating addbleimpl class
class AddableImpl implements Addable{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	
	
}
class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Class: draw() method");
	}
	
}
public class Lambdaexample {

	public static void main(String [] args) {
		
		//Shape rectangle = () -> System.out.println("Rectangle Class: draw1() method");
	//	rectangle.draw();
	//	print(rectangle);
		print(() -> System.out.println("Rectangle Class: draw1() method"));
		
		Addable addition = ( a,  b)  ->	(a+b);
		int result = addition.add(10, 20);
System.out.println("dufhsduv" +result);
}
	private static void print(Shape shape) {
		shape.draw();
	}
}
