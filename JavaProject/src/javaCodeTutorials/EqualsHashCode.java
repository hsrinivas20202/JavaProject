package javaCodeTutorials;

public class EqualsHashCode {
	
	static Student s1 = new Student(9, "Virat", 99);
	static Student s2 = new Student(9, "Virat", 9);
	static Student s3 = s2;
	
	public static void main(String[] args) {
		//S1 nd S2 using equals method
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		//s2 and s3 are pointing to same memory location
		System.out.println(s2 == s3);

	}
}
