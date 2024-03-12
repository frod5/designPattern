package factorymethod.framework;

public abstract class ItemCreator {

	/**
	 * 팩토리 메소드
	 */
	public Item create() {
		requestItemsInfo();
		Item item = createItem();
		createItemLog();
		return item;
	}

	protected abstract void requestItemsInfo();
	protected abstract void createItemLog();
	protected abstract Item createItem();
}
