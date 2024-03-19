package decorate;

public class BoomDecorator extends JetPlaneDecorator {
	public BoomDecorator(JetPlane jetPlane) {
		super(jetPlane);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println("3단계 폭탄 발사!");
	}
}
