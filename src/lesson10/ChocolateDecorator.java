package lesson10;

public class ChocolateDecorator extends IceCreamDecorator {
public ChocolateDecorator(IceCream i) {
	super (i);
	
}
@Override
public void makeIceCream() {
	super.makeIceCream();
	System.out.print("+ Chocolate");

}
}
