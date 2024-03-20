package observer;

public class Main {
	public static void main(String[] args) {
		Button button = new Button();
		button.setButtonListener(new ButtonListener() {
			@Override
			public void onClick(Button button) {
				System.out.println(button + "is clicked");
			}
		});

		button.onClick();
	}
}
