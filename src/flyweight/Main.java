package flyweight;

public class Main {
	public static void main(String[] args) {
		FlyweightManager flyweightManager = new FlyweightManager();
		Flyweight a = flyweightManager.getFlyweight("A");
		System.out.println(a);

		Flyweight a1 = flyweightManager.getFlyweight("A");
		System.out.println(a1);

		System.out.println("a == a1 " + (a == a1));
	}
}
