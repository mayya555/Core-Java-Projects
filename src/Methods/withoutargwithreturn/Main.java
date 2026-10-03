package Methods.withoutargwithreturn;

public class Main {

	public static void main(String[] args) {
		
		Company company =  new Company(100,"Codegnan","Hyderabad",200,23540.37);
		
		System.out.println(company.getCompanyId());
		
		int companyId = company.getCompanyId();
		System.out.println("Company ID:"+companyId);
		
		
		String companyname = company.getComanyname();
	    int empcount = company.getEmpcount();
	    String companyLocation = company.getCompanyLocation();
	    double companyTurnover=company.getCompanyTurnOver();
	    
	    System.out.println(companyname);
	    System.out.println(empcount);
	    System.out.println(companyLocation);
	    System.out.println(companyTurnover);

	}

}
