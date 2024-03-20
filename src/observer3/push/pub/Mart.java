package observer3.push.pub;

import observer3.push.sub.Customer;

public interface Mart {

	//고객 등록
	void add(Customer customer);

	//고객 등록 해제
	void remove(Customer customer);

	//상품 입고
	void received();

	//상품이 입고되면 알림
	void notifyChange(String msg);
}
