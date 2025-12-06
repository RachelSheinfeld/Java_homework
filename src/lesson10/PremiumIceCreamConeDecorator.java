package lesson10;

public class PremiumIceCreamConeDecorator extends IceCreamDecorator {
public  PremiumIceCreamConeDecorator(IceCream i) {
	super(i);
}
@Override
public void makeIceCream() {
	super.makeIceCream();
	System.out.print("+ PremiumIceCream");

}
}
