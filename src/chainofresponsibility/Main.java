package chainofresponsibility;

public class Main {
	public static void main(String[] args) {
		Calculator plus = new PlusCalculator();
		Calculator sub = new SubCalculator();

		plus.setNextCalculator(sub);

		Request request = new Request(1,3,"+");
		plus.process(request);

		Request request2 = new Request(1,3,"-");

		sub.process(request2);
	}
}
