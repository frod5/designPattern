package observer3.push.sub;

public class Customer2 implements Customer{
	@Override
	public void update(String msg) {
		System.out.println("손님2이 받은 알림 = " + msg);
	}
}
