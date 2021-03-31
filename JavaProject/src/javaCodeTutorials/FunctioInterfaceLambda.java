package javaCodeTutorials;

@FunctionalInterface
interface Square {
	void calculate(int x);
}

@FunctionalInterface
interface add {
	void calculate(int x, int y);
}

public class FunctioInterfaceLambda {

	public static void main(String[] args) {
		// Functional Interface Implementation
		// Return type of abstract method should match
		Square x = (s) -> System.out.println(s * s);
		x.calculate(5);
		add addImplementation = (a, b) -> System.out.println(a + b);
		addImplementation.calculate(1, 2);
		
	}

}
