package javaCodeTutorials;

@FunctionalInterface
interface Square {
	void calculate(int x);
}

@FunctionalInterface
interface Add {
	void calculate(int x, int y);
}

public class FunctioInterfaceLambda {

	public static void main(String[] args) {
		// Functional Interface Implementation
		// Return type of abstract method should match
		Square x = (s) -> System.out.println(s * s);
		x.calculate(5);
		Add addImplementation = (a, b) -> System.out.println(a + b);
		addImplementation.calculate(1, 2);
		
	}

}
