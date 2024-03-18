package builder2;

public class ComputerBuilder2 {
	private Computer computer;

	public ComputerBuilder2() {
		computer = new Computer("default", "default", "default");
	}

	public static ComputerBuilder2 start() {
		return new ComputerBuilder2();
	}

	public ComputerBuilder2 setCpu(String cpu) {
		computer.setCpu(cpu);
		return this;
	}

	public ComputerBuilder2 setRam(String ram) {
		computer.setRam(ram);
		return this;
	}

	public ComputerBuilder2 setStorage(String storage) {
		computer.setStorage(storage);
		return this;
	}

	public Computer build() {
		return this.computer;
	}
}
