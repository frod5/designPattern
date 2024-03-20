package chainofresponsibility;

public class SubCalculator extends Calculator {
	@Override
	protected boolean operator(Request request) {
		String operation = request.getOperation();
		if("-".equals(operation)) {
			System.out.println(request.getNum1() + " - " + request.getNum2() + " = " + (request.getNum1() - request.getNum2()));
		}
		return false;
	}
}
