package decorate;

public class DefaultJetPlane implements JetPlane {
	@Override
	public void attack() {
		System.out.println("1단계 총알 발사!");
	}
}
