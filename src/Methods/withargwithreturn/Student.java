package Methods.withargwithreturn;

public class Student {
	
	int studentId;
	String studentName;
	int mark1;
	int mark2;
	int mark3;
	
	public Student(int studentId,String studentName,int mark1,int mark2,int mark3) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	
	public void displayStudentDetails(Student student) {
		
	
	
	
	
	double percentage = calculatePercentage(student.mark1,student.mark2,student.mark3);
	System.out.println("studentid:"+student.studentId+ "studentname:"+student.studentName+ ""
			+ " "+percentage);

	
	System.out.println("Percentage:"+ percentage);
	
	}
	
	public double calculatePercentage(int mark1, int mark2, int mark3) {
		
		double percentage = ((mark1+mark2+mark3)/3 ) * 100;
		return percentage;
	}
	

	public static void main(String[] args) {
		

        Student s = new Student(101, "Sai", 90, 80, 70);

        s.displayStudentDetails(s);

	}

}
