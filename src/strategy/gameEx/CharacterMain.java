package strategy.gameEx;

public class CharacterMain {
	public static void main(String[] args) {
		Character character = new Character();
		character.setWeapon(new Gun());
		character.attack();

		character.setWeapon(new Sword());
		character.attack();
	}
}
