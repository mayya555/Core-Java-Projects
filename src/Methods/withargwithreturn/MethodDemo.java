package Methods.withargwithreturn;

public class MethodDemo {
	
	public int sum(int a,int b) {
		
		return a+b;
	}
	
	public int multiply(int a , int b) {
		
		return a*b;
	}
	
	public String displayDetails(String name,int age) {
		
		String text = "welcome"+name+"!"+"your age is:"+age;
		return text;
	}
	
	
	public double calculateGrossSalary(double basic,double hra,double commission) {
		
		double grossSalary = basic+hra+commission;
		return grossSalary;
	}

	public static void main(String[] args) {
		 
		int num1=1000;
		int num2=2000;
		
		MethodDemo m = new MethodDemo();
		
		int result = m.sum(num1, num2);
		System.out.println("sum of "+ num1+"and"+num2+"is"+result);
		
		int result2 = m.sum(result, 100);
		System.out.println("After adding 100 to result:"+result2);
		
		
		String name = "Raj";
		int age = 20;
		
		//Invoke displayDetails()
		String result3 = m.displayDetails(name, age);
		System.out.println(result3);
		
		
		double grossSalary = m.calculateGrossSalary(10000.00, 2000.00, 3000.00);

	}

}
