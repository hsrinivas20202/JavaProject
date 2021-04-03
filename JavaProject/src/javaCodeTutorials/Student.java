package javaCodeTutorials;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String studentName;
	private double marks;
	
	
	public Student(int rollNo, String studentName, double marks) {
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if(this.getMarks() > o.getMarks())
			return 1;
		
		return -1;
	}
	
	public boolean equals(Object o) {
		if(o == null || !(o instanceof Student)) {
			return false;
		}

		if(o == this) {
			return true;
		}

		Student s = (Student)o;
		return s.getRollNo() == this.getRollNo();
	}
	
	public int hashCode() {
		return getRollNo();
	}
}
