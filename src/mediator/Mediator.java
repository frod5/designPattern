package mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
	protected List<Colleague> colleagueList = new ArrayList<>();
	public boolean addColleague(Colleague colleague) {
		return colleague != null && colleagueList.add(colleague);
	}
	public abstract void mediate(String data);
}
