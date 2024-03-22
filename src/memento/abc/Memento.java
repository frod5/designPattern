package memento.abc;

public class Memento {
	String state;

	Memento(String state) {
		this.state = state;
	}

	String getState() {
		return state;
	}
}
