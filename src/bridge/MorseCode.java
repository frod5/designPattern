package bridge;

public class MorseCode {
	private MorseCodeFunction morseCodeFunction;

	public MorseCode(MorseCodeFunction morseCodeFunction) {
		this.morseCodeFunction = morseCodeFunction;
	}

	public void setMorseCodeFunction(MorseCodeFunction morseCodeFunction) {
		this.morseCodeFunction = morseCodeFunction;
	}

	public void a() {
		morseCodeFunction.dot();
		morseCodeFunction.dash();
		morseCodeFunction.space();
	}

	public void b() {
		morseCodeFunction.dash();
		morseCodeFunction.dot();
		morseCodeFunction.dot();
		morseCodeFunction.dot();
		morseCodeFunction.space();
	}

	public void c() {
		morseCodeFunction.dash();
		morseCodeFunction.dot();
		morseCodeFunction.dash();
		morseCodeFunction.dot();
		morseCodeFunction.space();
	}
}
