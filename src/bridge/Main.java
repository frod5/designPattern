package bridge;

public class Main {
	public static void main(String[] args) {
		MorseCode morseCode = new MorseCode(new PrintMorseCode());
		morseCode.a();
		morseCode.b();
		morseCode.c();

		morseCode.setMorseCodeFunction(new PrintSoundMorseCode());
		morseCode.a();
		morseCode.b();
		morseCode.c();
	}
}
