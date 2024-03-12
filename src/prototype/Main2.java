package prototype;

public class Main2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat navi = new Cat();
		navi.setName("나비");
		navi.setAge(new Age(2020, 3));

		Cat ya = navi;  //얕은 복사 (주소값 복사)
		ya.setName("ya");
		ya.setAge(new Age(2023, 5));

		System.out.println("navi.name " + navi.getName());
		System.out.println("ya.name " + ya.getName());
		System.out.println("navi.age " + navi.getAge().getYear());
		System.out.println("ya.age " + ya.getAge().getYear());

		System.out.println();
		Cat navi2 = new Cat();
		navi2.setName("나비1");
		navi2.setAge(new Age(2020, 3));

		Cat ya2 = navi2.copy(); //깊은 복사
		ya2.setName("ya2");
		ya2.getAge().setYear(2021);
		ya2.getAge().setValue(5);

		System.out.println("navi2.name " + navi2.getName());
		System.out.println("ya2.name " + ya2.getName());
		System.out.println("navi2.age " + navi2.getAge().getYear());
		System.out.println("ya2.age " + ya2.getAge().getYear());

		//자바의 대원칙
		//모든 값은 복사되어 할당된다. 값, 주소값 모두 이것만 기억하면 헷갈리지 않는다.
		//ex)
		// int a = 5;
		// int b = a;
		// a = 5, b = 5
		// A a = new A();
		// A b = a;
		// 주소값을 복사해서 할당
	}
}
