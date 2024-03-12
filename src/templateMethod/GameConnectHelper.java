package templateMethod;

public abstract class GameConnectHelper {
	protected abstract String doSecurity(String str);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);

	/**
	 * 템플릿 메소드
	 */
	public String requestConnection(String encodedInfo) {
		//보안 작업 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);
		
		//인증과정
		//반환된것을 가지고 id와 password 할당
		String id = "aaa";
		String password = "bbb";

		if(!authentication(id, password)) {
			throw new Error("아이디 패스워드 불일치");
		}

		//인가과정
		String userName = "userName";
		int author = authorization(userName);

		switch (author) {
			case 0 -> System.out.println("게임 매니저");
			case 1 -> System.out.println("무료 회원");
			case 2 -> System.out.println("유료 회원");
			case 3 -> System.out.println("권한 없음");
			case 4,5,6 -> System.out.println("테스트");
			default -> System.out.println("기타 상황");
		}

		return connection(decodedInfo);
	}
}
