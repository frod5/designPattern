package observer3.push;

import observer3.push.pub.LgMart;
import observer3.push.pub.LotteMart;
import observer3.push.pub.Mart;
import observer3.push.sub.Customer1;
import observer3.push.sub.Customer2;
import observer3.push.sub.Customer3;

public class ObserverPushMain {
	public static void main(String[] args) {
		Mart lotteMart = new LotteMart();
		Mart lgMart = new LgMart();
		Customer1 customer1 = new Customer1();
		Customer2 customer2 = new Customer2();
		Customer3 customer3 = new Customer3();

		//롯데마트 구독하기 (고객 등록)
		lotteMart.add(customer1);
		lotteMart.add(customer2);
		lotteMart.add(customer3);

		//롯데 마트 구독 취소 (고객 등록 해제)
		lotteMart.remove(customer2);

		//Lg마트 구독
		lgMart.add(customer3);

		//롯데 상품 입고
		new Thread(() -> {
			lotteMart.received();
		}).start();

		//Lg 상품 입고
		new Thread(() -> {
			lgMart.received();
		}).start();
	}
}
