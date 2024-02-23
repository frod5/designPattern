package strategy;

public class ObjectA {

	InterfaceA interfaceA;

	public ObjectA(InterfaceA interfaceA) {
		this.interfaceA = interfaceA;
	}

	public void functionAA() {

		// System.out.println("AAA");
		// System.out.println("AAA");

		// ~ 기능이 필요합니다.
		interfaceA.functionA();
	}
}
