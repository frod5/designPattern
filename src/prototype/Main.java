package prototype;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle1 = new Circle(1,1,3);
		Circle circle2 = circle1.copy();
		System.out.println("circle2.x = " + circle2.getX());
		System.out.println("circle2.y = " + circle2.getY());
		System.out.println("circle2.r = " + circle2.getR());
	}
}
