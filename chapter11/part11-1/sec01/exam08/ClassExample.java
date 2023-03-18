package sec01.exam08;

import sec01.exam09.Car;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Car.class;
		
		
		//Class B = Class.forName("sec01.exam08.Car");
		
		//Car car = new Car();
		//Class C = Car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName().getBytes());
		
	}

}
