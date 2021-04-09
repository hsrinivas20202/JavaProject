package javaCodeTutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMapDemo {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> intList2 = new ArrayList<Integer>();

		intList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

		intList2 = intList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(intList2);
		intList2 = intList.stream().filter(i -> i % 2 == 0).map(i -> i*i).collect(Collectors.toList());
		System.out.println(intList2);
		


	}

}
