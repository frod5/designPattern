package observer3.push.pub;

import java.util.ArrayList;
import java.util.List;

import observer3.push.sub.Customer;

public class LgMart implements Mart {
	private List<Customer> customerList = new ArrayList<>();
	@Override
	public void add(Customer customer) {
		customerList.add(customer);
	}

	@Override
	public void remove(Customer customer) {
		customerList.remove(customer);
	}

	@Override
	public void received() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(".");
				Thread.sleep(1000);
			}
			notifyChange("Lg 상품 들어왔어");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void notifyChange(String msg) {
		customerList.forEach(customer -> customer.update(msg));
	}
}
