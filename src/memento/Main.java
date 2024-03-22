package memento;

import java.util.Stack;

import memento.abc.Memento;
import memento.abc.Originator;

public class Main {
	public static void main(String[] args) {
		Stack<Memento> mementos = new Stack<>();
		Originator originator = new Originator();

		originator.setState("state 1");
		mementos.push(originator.createMemento());
		originator.setState("state 2");
		mementos.push(originator.createMemento());
		originator.setState("state 3");
		mementos.push(originator.createMemento());
		originator.setState("state Final");
		mementos.push(originator.createMemento());

		originator.restoreMemento(mementos.pop());
		System.out.println("origin.state = " + originator.getState());
		originator.restoreMemento(mementos.pop());
		System.out.println("origin.state = " + originator.getState());
		originator.restoreMemento(mementos.pop());
		System.out.println("origin.state = " + originator.getState());
		originator.restoreMemento(mementos.pop());
		System.out.println("origin.state = " + originator.getState());
	}
}
