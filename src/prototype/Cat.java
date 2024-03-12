package prototype;

public class Cat implements Cloneable {
	private String name;
	private Age age;

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cat copy() throws CloneNotSupportedException {
		Cat rtn = (Cat)clone();
		//멤버변수는 깊은 복사가 되지 않아서 직접 할당해서 깊은 복사 처리
		rtn.setAge(new Age(rtn.getAge().year, rtn.getAge().value));
		return rtn;
	}
}
