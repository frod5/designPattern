package prototype;

public class Age {
	public Age(int year, int value) {
		this.year = year;
		this.value = value;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	int year;
	int value;
}
