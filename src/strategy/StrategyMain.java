package strategy;

public class StrategyMain {
	public static void main(String[] args) {
		InterfaceA interfaceAImpl = new InterfaceAImpl();

		ObjectA objectA = new ObjectA(interfaceAImpl);

		objectA.functionAA();
	}
}
