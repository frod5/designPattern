package strategy.gameEx;

public class Character {

	private Weapon weapon;

	//교체가능하도록
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void attack() {
		weapon.attack();
	}
}
