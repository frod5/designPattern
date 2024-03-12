package factorymethod.concrete;

import factorymethod.framework.Item;
import factorymethod.framework.ItemCreator;

public class Main {
	public static void main(String[] args) {
		ItemCreator creator = new HpCreator();
		Item item = creator.create();
		item.use();

		ItemCreator creator1 = new MpCreator();
		Item item1 = creator1.create();
		item1.use();
	}
}
