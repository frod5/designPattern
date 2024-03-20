package chainofresponsibility2;

public class Armor implements Defense {

	private Defense nextDefense;
	private int def;

	public Armor(int def) {
		this.def = def;
	}

	@Override
	public void defense(Attack attack) {
		//Point1 -> 첫번째 책임 처리와 관계없이 다음 책임도 있는경우에는 처리하도록 활용하는방법.
		process(attack);
		if (nextDefense != null) nextDefense.defense(attack);
	}

	private void process(Attack attack) {
		int amount = attack.getAmount();
		attack.setAmount(amount - def);
	}

	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}
}
