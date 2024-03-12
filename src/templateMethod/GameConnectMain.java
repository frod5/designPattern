package templateMethod;

public class GameConnectMain {
	public static void main(String[] args) {
		GameConnectHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("접속정보");
	}
}
