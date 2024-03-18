package abstractfactory2.linux;

import abstractfactory2.abst.Button;

public class LinuxButton implements Button {
	@Override
	public void click() {
		System.out.println("Linux Button Click!!");
	}
}
