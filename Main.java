package myMethod;

public class Main {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.value(10,20);
		tri.value(10, 10);
		
		System.out.println("Area of rectangle is "+rec.area());
		System.out.println("Area of triangle is "+tri.area());

	}

	
}
