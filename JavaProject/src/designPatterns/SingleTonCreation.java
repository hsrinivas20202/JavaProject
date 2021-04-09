package designPatterns;

public class SingleTonCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleTonExample singleton = SingleTonExample.getInstance();
		
		singleton.printMessage();
	}

}
