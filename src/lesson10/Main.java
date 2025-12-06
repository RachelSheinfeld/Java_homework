package lesson10;

public class Main {
	  public static void main(String[] args) {
		  IceCream ice=new SimpleIceCream();
		  ice.makeIceCream();
		  System.out.println();
		  IceCream ice2=new AmericanIceCream();
		  ice2.makeIceCream();
		  System.out.println();
		  IceCream ice3=new FrozenYogurt();
		  ice3.makeIceCream();
		  System.out.println();
		  IceCream ice4=new ChocolateDecorator(
				  new PremiumIceCreamConeDecorator(
						  new AmericanIceCream()
						  ));
		  ice4.makeIceCream();
		  System.out.println();
		  IceCream ice5 =
				    new PremiumIceCreamConeDecorator(
				        new AmericanIceCream()
				    );
		  ice5.makeIceCream();
		  System.out.println();

		  IceCream ice6 =
				    new ChocolateDecorator(
				        new FrozenYogurt()
				    );

				ice6.makeIceCream();
				  System.out.println();

	  

	  }
}
