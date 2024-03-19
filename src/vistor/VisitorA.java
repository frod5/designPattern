package vistor;

public class VisitorA implements Visitor {
	private int ageSum;

	public VisitorA() {
		this.ageSum = 0;
	}

	public int getAgeSum() {
		return ageSum;
	}

	@Override
	public void visit(Visitable visitable) {
		if(visitable instanceof VisitableA) {
			ageSum += ((VisitableA) visitable).getAge();
		} else {

		}
	}
}
