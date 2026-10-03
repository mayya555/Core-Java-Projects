package Methods.withargwithreturn;

public class Salary {
	
	double basic;
	double hra;
	double commission;
	
	
	
	public Salary(double basic, double hra, double commission) {
		super();
		this.basic = basic;
		this.hra = hra;
		this.commission = commission;
	}

	public double getgrossSalary(Salary salary) {
		
		double grossSalary = salary.basic + salary.hra + salary.commission;
		return grossSalary;
	}

	public static void main(String[] args) {
		
		Salary s = new Salary(100.00,300.00,500.00);
		System.out.println("Gross Salary");
		

	}

}
