package abstractfactory2.concrete;

import abstractfactory2.abst.Button;
import abstractfactory2.abst.GuiFactory;
import abstractfactory2.abst.TextArea;

public class FactoryInstance {
	public static GuiFactory getGuiFactory() {
		int code = 0;
		return switch (code) {
			case 0 -> new MacGuiFactory();
			case 1 -> new WinGuiFactory();
			default -> new LinuxGuiFactory();
		};
	}
}

class LinuxButton implements Button {
	@Override
	public void click() {
		System.out.println("Linux Button Click!!");
	}
}

class LinuxGuiFactory implements GuiFactory {
	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}
}

class LinuxTextArea implements TextArea {
	@Override
	public String getText() {
		return "Linux Text Area Text Value";
	}
}

class MacButton implements Button {
	@Override
	public void click() {
		System.out.println("Mac Button Click!!");
	}
}
class MacGuiFactory implements GuiFactory {
	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}
}
class MacTextArea implements TextArea {
	@Override
	public String getText() {
		return "Mac TextArea Value";
	}
}
class WinButton implements Button {
	@Override
	public void click() {
		System.out.println("Win Button Click!!");
	}
}
class WinGuiFactory implements GuiFactory {
	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WinTextArea();
	}
}
class WinTextArea implements TextArea {
	@Override
	public String getText() {
		return "Win TextArea Value";
	}
}
