package observer;

public class Button {

	private ButtonListener buttonListener;
	public void onClick() {
		if(buttonListener != null)
			buttonListener.onClick(this);
	}

	public void setButtonListener(ButtonListener buttonListener) {
		this.buttonListener = buttonListener;
	}
}
