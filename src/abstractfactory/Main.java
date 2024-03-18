package abstractfactory;

import java.util.Arrays;

import abstractfactory.abst.BikeFactory;
import abstractfactory.abst.Body;
import abstractfactory.abst.Wheel;
import abstractfactory.bike.BikeFactoryImpl;

public class Main {
	public static void main(String[] args) {
		BikeFactory factory = new BikeFactoryImpl();
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		System.out.println("body.getClass " + body.getClass());
		System.out.println("wheel.getClass = " + wheel.getClass());
	}
}
