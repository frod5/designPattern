package state;

public class Light {

	protected LightState lightState;
	private LightState offState = new LightState() {
		@Override
		public void on() {
			System.out.println("Light On");
			lightState = onState;
		}

		@Override
		public void off() {
			System.out.println("Nothing");
		}
	};

	private LightState onState = new LightState() {
		@Override
		public void on() {
			System.out.println("Nothing");
		}

		@Override
		public void off() {
			System.out.println("Light On");
			lightState = offState;
		}
	};

	public Light() {
		this.lightState = offState;
	}

	public void on() {
		lightState.on();
	}

	public void off() {
		lightState.off();
	}
}

interface LightState {
	void on();
	void off();
}
