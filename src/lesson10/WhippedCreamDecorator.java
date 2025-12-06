package lesson10;

public class WhippedCreamDecorator extends IceCreamDecorator{
	public WhippedCreamDecorator(IceCream i) {
		super(i);
	}
	@Override
	public void makeIceCream() {
		super.makeIceCream();
		System.out.print("+ WhippedCream");

	}
}
