package bridge;

public class PrintSoundMorseCode implements MorseCodeFunction {
	@Override
	public void dot() {
		print("닷");
	}

	@Override
	public void dash() {
		print("대쉬");
	}

	@Override
	public void space() {
		print(" 띄움 ");
	}

	private void print(String str) {
		System.out.print(str);
	}
}
