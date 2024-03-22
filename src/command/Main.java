package command;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		// List<Command> commandList = new LinkedList<>();
		// commandList.add(() -> System.out.println("작업1"));
		// commandList.add(() -> System.out.println("작업2"));
		// commandList.add(() -> System.out.println("작업3"));
		// commandList.forEach(Command::execute);

		PriorityQueue<Command> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(new StringPrintCommand("A"));
		priorityQueue.add(new StringPrintCommand("AB"));
		priorityQueue.add(new StringPrintCommand("ABC"));
		priorityQueue.add(new StringPrintCommand("ABCD"));

		priorityQueue.forEach(Command::execute);
	}
}
