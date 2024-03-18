package builder;

public class BuilderMain1 {
	public static void main(String[] args) {
		ComputerBuilder builder = new ComputerBuilder();
		builder.setBluePrint(new AppleMacBluePrint());
		builder.make();
		Computer computer = builder.getComputer();

		System.out.println(computer.toString());
	}
}
