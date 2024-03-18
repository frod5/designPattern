package builder;

public class AppleMacBluePrint extends BluePrint {

	private Computer computer;

	@Override
	public void setCpu() {
		computer.setCpu("M3");
	}

	public AppleMacBluePrint() {
		this.computer = new Computer("default", "default", "default");
	}
	@Override
	public void setRam() {
		computer.setRam("16g");
	}

	@Override
	public void setStorage() {
		computer.setStorage("256g");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}
}
