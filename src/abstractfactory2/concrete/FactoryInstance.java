package abstractfactory2.concrete;

import abstractfactory2.abst.GuiFactory;
import abstractfactory2.linux.LinuxGuiFactory;
import abstractfactory2.mac.MacGuiFactory;
import abstractfactory2.win.WinGuiFactory;

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
