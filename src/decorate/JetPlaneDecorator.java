package decorate;

public abstract class JetPlaneDecorator implements JetPlane {
	private JetPlane jetPlane;

	public JetPlaneDecorator(JetPlane jetPlane) {
		this.jetPlane = jetPlane;
	}

	@Override
	public void attack() {
		jetPlane.attack();
	}
}
