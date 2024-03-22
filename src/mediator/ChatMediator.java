package mediator;

public class ChatMediator extends Mediator {
	@Override
	public void mediate(String data) {
		colleagueList.forEach(colleague -> colleague.handle(data));
	}
}
