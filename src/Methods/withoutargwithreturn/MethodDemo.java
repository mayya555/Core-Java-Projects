package Methods.withoutargwithreturn;

// Program demonstrating a method without argument and with return type
public class MethodDemo {
	
	public int getStudentCount() {
		
		return 200;
	}
	
	public String getGreeting() {
		
		return "hello";
	}
	

	public static void main(String[] args) {
		
		MethodDemo m = new MethodDemo();
		
		int StudentCount = m.getStudentCount();
		System.out.println(StudentCount);
		String Greeting = m.getGreeting();
		System.out.println(Greeting);
	}

}
