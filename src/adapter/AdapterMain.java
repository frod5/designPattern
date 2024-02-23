package adapter;

public class AdapterMain {
	public static void main(String[] args) {

		//기존에 있는 기능
		Math.twoTime(1.5);
		Math.half(3.0);


		//기존기능을 우리가 원하는 기능대로 맞게
		Adapter adapterImpl = new AdapterImpl();

		System.out.println(adapterImpl.twiceOf(1.5f));
		System.out.println(adapterImpl.halfOf(3.0f));
	}
}
