package flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FlyweightManager {
	private Map<String, Flyweight> pool;

	public FlyweightManager() {
		this.pool = new TreeMap<>();
	}

	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = pool.get(key);

		if (flyweight != null) {
			System.out.println("재사용 " + key);
			return flyweight;
		}

		flyweight = new Flyweight(key);
		pool.put(key, flyweight);
		System.out.println("새로 생성 " + key);

		return flyweight;
	}
}
