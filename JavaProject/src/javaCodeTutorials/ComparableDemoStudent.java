package javaCodeTutorials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(99,"Sam",9.7));
		studentList.add(new Student(1,"KL",9.6));
		studentList.add(new Student(18,"VK",9.9));
		
		
		Comparator<Student> comparatorImplementation = new Comparator<Student>() {
			
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub

				if(o1.getRollNo() > o2.getRollNo())
				return 1;
				return -1;
			}
		};
		Collections.sort(studentList,comparatorImplementation);
		System.out.println(studentList);
		
		for(Student s :studentList ) {
			System.out.println(s);
			
		}

	}

}
