package chainofresponsibility;

public abstract class Calculator {

	private Calculator calculator;
	public void setNextCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public boolean process(Request request) {
		return operator(request) || calculator != null && calculator.process(request);
	}
	protected abstract boolean operator(Request request);
}
