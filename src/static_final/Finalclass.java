package static_final;
//Program to demonstrate final class
final class Finalclass {
	void show() {
	System.out.println("Final class cannot be inherited");
	}
	}
	//can't create child classes from Final class, Ex: String, Wrapper Classes, System, Scanner, Number are Final classes
	/*class FinalChildClass extends FinalClass {
	}
	*/