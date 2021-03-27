package javaCodeTutorials;

import java.util.ArrayList;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(5);
		integerList.add(2);
		System.out.println(integerList);
        integerList.forEach(i -> System.out.println(i));		
	}

}
