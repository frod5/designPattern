package abstractfactory2.mac;

import abstractfactory2.abst.Button;

public class MacButton implements Button {
	@Override
	public void click() {
		System.out.println("Mac Button Click!!");
	}
}
