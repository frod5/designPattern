package abstractfactory2;

import abstractfactory2.abst.Button;
import abstractfactory2.abst.GuiFactory;
import abstractfactory2.abst.TextArea;
import abstractfactory2.concrete.FactoryInstance;

public class Main {
	public static void main(String[] args) {
		// GuiFactory guiFactory = new LinuxGuiFactory();
		// Button button = guiFactory.createButton();
		// TextArea textArea = guiFactory.createTextArea();
		// button.click();
		// String text = textArea.getText();
		// System.out.println("text = " + text);

		// GuiFactory guiFactory1 = new MacGuiFactory();
		// Button button1 = guiFactory1.createButton();
		// TextArea textArea1 = guiFactory1.createTextArea();
		// button1.click();
		// String text1 = textArea1.getText();
		// System.out.println("text1 = " + text1);
		//
		// GuiFactory guiFactory2 = new WinGuiFactory();
		// Button button2 = guiFactory2.createButton();
		// TextArea textArea2 = guiFactory2.createTextArea();
		// button2.click();
		// String text2 = textArea2.getText();
		// System.out.println("text2 = " + text2);

		GuiFactory guiInstance = FactoryInstance.getGuiFactory(); // 외부에서 알지 못하게 factory 마저 정해주는 static 메소드로 변경
		Button button1 = guiInstance.createButton();
		TextArea textArea1 = guiInstance.createTextArea();
		button1.click();
		String text1 = textArea1.getText();
		System.out.println("text1 = " + text1);
	}
}
