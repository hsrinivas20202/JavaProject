package javaCodeTutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamLamdaReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList = new ArrayList<>();
		List<Integer> integerList2 = new ArrayList<>();

		integerList.addAll(Arrays.asList(1, 2, 3));
		
		int x = integerList.stream().reduce(1,(a,b) -> a*b);
		
		integerList.forEach(i -> integerList2.add(i*5));
		
		System.out.println(integerList);
		System.out.println(x);
		System.out.println(integerList2);


	}

}
