package decorate;

public class LaserDecorator extends JetPlaneDecorator {
	public LaserDecorator(JetPlane jetPlane) {
		super(jetPlane);
	}

	public void attack() {
		super.attack();
		System.out.println("2단계 레이저 발사!");
	}
}
