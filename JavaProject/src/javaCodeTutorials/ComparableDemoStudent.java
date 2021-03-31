package javaCodeTutorials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(99,"Sam",9.7));
		studentList.add(new Student(1,"KL",9.6));
		studentList.add(new Student(18,"VK",9.9));
		
		Collections.sort(studentList);
		System.out.println(studentList);
		
		for(Student s :studentList ) {
			System.out.println(s);
			
		}

	}

}
