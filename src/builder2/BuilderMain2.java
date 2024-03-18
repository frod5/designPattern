package builder2;

public class BuilderMain2 {
	public static void main(String[] args) {

		Computer computer = ComputerBuilder2.start()
			.setCpu("i7")
			.setRam("16g")
			.build();

		System.out.println("computer.toString() = " + computer.toString());
	}
}
