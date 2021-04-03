package javaCodeTutorials;

import java.util.Arrays;

public class ArraysLamda {

	 static int[] x = {1,2,3,4,5};
	
	public static void main(String[] args) {
		System.out.println(x);
		
		System.out.println(Arrays.toString(x));
		
		

		Arrays.asList(x).forEach(i -> System.out.println(i));
		Arrays.asList(Arrays.toString(x)).forEach(i -> System.out.println(i));;

	}
	
}
