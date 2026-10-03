package Methods.withoutargwithreturn;

public class Company {
	
	int companyId;
	String companyname;
	String companyLocation;
	int empcount;
	double companyTurnover;

	public Company(int companyId,String companyname,String companyLocation,
			int empcount,double companyTurnover) {
		
		this.companyId=companyId;
		this.companyname=companyname;
		this.companyLocation=companyLocation;
		this.empcount=empcount;
		this.companyTurnover=companyTurnover;
		
	}
	
	public int getCompanyId() {
		return companyId;
	}
	
	public String getComanyname() {
		return companyname;
	}
	
	public String getCompanyLocation() {
		return companyLocation;
	}
	
	public int getEmpcount() {
		return empcount;
	}
	 
	public double getCompanyTurnOver() {
		return companyTurnover;
	}

}
