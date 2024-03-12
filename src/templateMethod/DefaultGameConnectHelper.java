package templateMethod;

public class DefaultGameConnectHelper extends GameConnectHelper {
	@Override
	protected String doSecurity(String str) {
		System.out.println("디코드");
		return "디코드" + str;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("id, password 확인");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 체크");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속 단계");
		return info;
	}
}
