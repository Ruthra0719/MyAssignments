package Week3.assignment;

public class Student extends Department{
	
	public void stdName() {
		System.out.println("Name is Ruthra");
	}
	public void stdDept() {
		System.out.println("Dept is CSE");
	}
	public void stdid() {
		System.out.println("Std id is 16CS023");
	}
	public static void main(String[] args) {
		
		Student s=new Student();
		s.collegeName();
		s.collegecode();
		s.collegeRank();
		s.deptName();
		s.stdDept();
		s.stdid();
		s.stdName();

	}

}
