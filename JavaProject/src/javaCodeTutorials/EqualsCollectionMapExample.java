package javaCodeTutorials;

import java.util.HashMap;
import java.util.Map;

public class EqualsCollectionMapExample {
 
	
	public static void main(String[] args) {
		

		Student s1 = new Student(9, "Virat", 99);
		Student s2 = new Student(9, "Virat", 9);
		
		System.out.println(s1.equals(s2));
		Map<Student,String> mapCustom = new HashMap<Student,String>();
		mapCustom.put(s1, "ADD");
		mapCustom.put(s2, "Dupicate");
		//Since they both are equal only one is added
		System.out.println(mapCustom.size());
	}
}
