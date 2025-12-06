package lesson10;

public abstract class IceCreamDecorator extends IceCream{
	
	
	IceCream ice;
	public IceCreamDecorator(IceCream i) {
		ice=i;
	}
	@Override
	public void makeIceCream() {
		ice.makeIceCream();

	}

}
