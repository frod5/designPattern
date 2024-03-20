package observer3.polling;

public class ObserverPollingMain {
	public static void main(String[] args) {
		LotteMart lotteMart = new LotteMart();
		Customer1 customer1 = new Customer1();
		Customer2 customer2 = new Customer2();

		// 다른 Thread에서 실행
		new Thread(() -> {
			//5초 후에 들어옴.
			lotteMart.received();
		}).start();

		//계속 물어봐야한다.
		while(true) {
			try {
				System.out.println("상품 들어왔나요?");
				Thread.sleep(1000);
			} catch (Exception e) {

			}

			if(lotteMart.getValue() != null) {
				customer1.update(lotteMart.getValue() + "가 들어왔습니다.");
				customer2.update(lotteMart.getValue() + "가 들어왔습니다.");
				break;
			} else {
				System.out.println("상품이 아직 들어오지 않았습니다.");
			}
		}
	}
}
