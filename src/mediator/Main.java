package mediator;

public class Main {
	public static void main(String[] args) {

		Mediator mediator = new ChatMediator();
		Colleague colleague1 = new ChatColleague();
		Colleague colleague2 = new ChatColleague();
		Colleague colleague3 = new ChatColleague();

		colleague1.join(mediator);
		colleague2.join(mediator);
		colleague3.join(mediator);

		colleague1.sendData("AA");
		colleague2.sendData("BB");
		colleague3.sendData("CC");
	}
}
