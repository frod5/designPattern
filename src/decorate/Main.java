package decorate;

public class Main {
	public static void main(String[] args) {
		JetPlane jetPlane = new DefaultJetPlane();
		JetPlaneDecorator decorator = new LaserDecorator(jetPlane);
		decorator.attack();

		BoomDecorator boom = new BoomDecorator(decorator);
		boom.attack();
	}
}
