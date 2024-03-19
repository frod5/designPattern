package bridge;

public class PrintMorseCode implements MorseCodeFunction {
	@Override
	public void dot() {
		print("•");
	}

	@Override
	public void dash() {
		print("-");
	}

	@Override
	public void space() {
		print(" ");
	}

	private void print(String str) {
		System.out.print(str);
	}
}
